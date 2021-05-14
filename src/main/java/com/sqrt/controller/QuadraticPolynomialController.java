package com.sqrt.controller;

import com.sqrt.entity.QuadraticPolynomial;
import com.sqrt.service.QuadraticPolynomialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class QuadraticPolynomialController {

    private final QuadraticPolynomialService quadraticPolynomialService;

    @Autowired
    public QuadraticPolynomialController(QuadraticPolynomialService quadraticPolynomialService) {
        this.quadraticPolynomialService = quadraticPolynomialService;
    }

    @GetMapping
    public String homePage(Model model){
        QuadraticPolynomial quadraticPolynomial = new QuadraticPolynomial();
        model.addAttribute("quadraticPolynomial", quadraticPolynomial);
        return "index";
    }

    @PostMapping
    public String solvePolynomial(@ModelAttribute("quadraticPolynomial") QuadraticPolynomial quadraticPolynomial){
        quadraticPolynomialService.savePolynomial(quadraticPolynomial);
        return "quadratic_polynomial_roots";
    }

    @GetMapping("/quadraticPolynomials")
    public String squareRoots(Model model){
        List<QuadraticPolynomial> quadraticPolynomials = quadraticPolynomialService.readAllQuadraticPolynomials();
        model.addAttribute("quadraticPolynomials", quadraticPolynomials);
        return "quadratic_polynomial_list";
    }
}
