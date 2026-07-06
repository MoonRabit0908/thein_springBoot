package com.example.demo.caculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.caculator.service.CalcService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CalcController {
	private final CalcService calcService;
	
    @GetMapping("/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
        return calcService.add(a, b);
    }
    
    @GetMapping("/minus")
    public int minus(@RequestParam("a") int a, @RequestParam("b") int b) {
        return calcService.minus(a, b);
    }
    
    @GetMapping("/multiply")
    public int multiply(@RequestParam("a") int a, @RequestParam("b") int b) {
        return calcService.multiply(a, b);
    }
    
    @GetMapping("/divide")
    public double divide(@RequestParam("a") double a, @RequestParam("b") double b) {
        return calcService.divide(a, b);
    }
}
