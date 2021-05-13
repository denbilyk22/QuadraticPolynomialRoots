package com.sqrt.repository;

import com.sqrt.entity.QuadraticPolynomial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuadraticPolynomialRepository extends JpaRepository<QuadraticPolynomial,Long> {
}
