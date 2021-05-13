package com.sqrt.controller;

import com.sqrt.entity.QuadraticPolynomial;
import com.sqrt.service.QuadraticPolynomialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class QuadraticPolynomialController {

    @Autowired
    private QuadraticPolynomialService quadraticPolynomialService;

    @GetMapping
    public String homePage(Model model){
        QuadraticPolynomial quadraticPolynomial = new QuadraticPolynomial();
        model.addAttribute("quadraticPolynomial", quadraticPolynomial);
        return "index";
    }

    @PostMapping
    public String calculateSquareRoot(@ModelAttribute("quadraticPolynomial") QuadraticPolynomial quadraticPolynomial){
        return "quadratic_polynomial_roots";
    }

    @GetMapping("/quadraticPolynomials")
    public String squareRoots(Model model){
        List<QuadraticPolynomial> quadraticPolynomials = quadraticPolynomialService.readAllQuadraticPolynomials();
        model.addAttribute("quadraticPolynomials", quadraticPolynomials);
        return "quadratic_polynomial_list";
    }
}
