package com.example.demo.caculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.caculator.service.CalcService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CalcController {
	
	////A.자바방식의 개발자가 직접 Obj를 관리는 방식
	//	private CalcService calcService = new CalcService();
	//	
	//	@GetMapping("/add")
	//	public String add(@RequestParam int a, @RequestParam int b) {
	//		return calcService.add(a,b) ;
	//	}
	
	////B.Autowired 사용
	//	@Autowired
	//	private CalcService calcService;
	//	
	//	
	//	@GetMapping("/add")
	//	public String add(@RequestParam int a, @RequestParam int b) {
	//		return calcService.add(a,b);
	//	}
	
	////C.생성자 방식
	//    private final CalcService calcService;
	//
	//    public CalcController(CalcService calcService) {
	//        this.calcService = calcService;
	//    }
	//
	//    @GetMapping("/add")
	//    public String add(@RequestParam int a, @RequestParam int b) {
	//        return calcService.add(a, b);
	//    }
	
	
	// D. 롬복 방식
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
