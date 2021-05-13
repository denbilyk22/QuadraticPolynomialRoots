package com.sqrt.service;

import com.sqrt.entity.QuadraticPolynomial;

import java.util.List;

public interface QuadraticPolynomialService {

    List<QuadraticPolynomial> readAllQuadraticPolynomials();

    void calculateQuadraticPolynomial(QuadraticPolynomial quadraticPolynomial);
}
