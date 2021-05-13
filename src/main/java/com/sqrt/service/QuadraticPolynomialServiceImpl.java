package com.sqrt.service;

import com.sqrt.entity.QuadraticPolynomial;
import com.sqrt.repository.QuadraticPolynomialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuadraticPolynomialServiceImpl implements QuadraticPolynomialService {

    @Autowired
    QuadraticPolynomialRepository quadraticPolynomialRepository;

    @Override
    public List<QuadraticPolynomial> readAllQuadraticPolynomials() {
        return quadraticPolynomialRepository.findAll();
    }

    @Override
    public void calculateQuadraticPolynomial(QuadraticPolynomial quadraticPolynomial) {

        double a = quadraticPolynomial.getA();
        double b = quadraticPolynomial.getB();
        double c = quadraticPolynomial.getC();

        List<Double> roots = new ArrayList<>();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if(discriminant > 0){
            double x1 = (-b + Math.sqrt(discriminant)) / 2*a;
            double x2 = (-b - Math.sqrt(discriminant)) / 2*a;
            roots.add(x1);
            roots.add(x2);
        }

        if(discriminant == 0){
            double x = -b / (2 * a);
            roots.add(x);
        }

        quadraticPolynomial.setRoots(roots);
        quadraticPolynomialRepository.save(quadraticPolynomial);
    }
}