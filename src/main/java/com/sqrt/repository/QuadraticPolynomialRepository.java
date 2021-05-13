package com.sqrt.repository;

import com.sqrt.entity.QuadraticPolynomial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuadraticPolynomialRepository extends JpaRepository<QuadraticPolynomial,Long> {
}
