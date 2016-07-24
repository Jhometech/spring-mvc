package in.javahome.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {
	@RequestMapping(value = "/add")
	@ResponseBody
	public String add(@RequestParam("value1") int i, @RequestParam("value2") int j) {
		int result = i + j;
		return "Result is " + result;
	}

	@RequestMapping(value = "/multiply/{x}/{y}")
	@ResponseBody
	public String multlipy(@PathVariable("x") int i, @PathVariable("y") int j) {
		int result = i *  j;
		return "Result is " + result;
	}
	
}
