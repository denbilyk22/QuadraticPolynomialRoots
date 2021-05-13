package com.sqrt.service;

import com.sqrt.entity.QuadraticPolynomial;
import com.sqrt.exception.NoRootsException;

import java.util.List;

public interface QuadraticPolynomialService {

    List<QuadraticPolynomial> readAllQuadraticPolynomials();

    void savePolynomial(QuadraticPolynomial quadraticPolynomial);
}
