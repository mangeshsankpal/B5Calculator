package com.batch5.Batch5Calculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

	@GetMapping("calculator/division")
	@ResponseBody
	public double division(@RequestParam double firstOperand,@RequestParam double secondOperand) {
		return firstOperand / secondOperand;
	}
}
