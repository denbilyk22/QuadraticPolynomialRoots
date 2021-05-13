package com.sqrt.controller;

import com.sqrt.exception.NoRootsException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlingController {
    @ExceptionHandler(NoRootsException.class)
    public String handleNoRootException(NoRootsException noRootsException, Model model){
        model.addAttribute("noRootsException", noRootsException);
        return "no_roots_exception_page";
    }
}
