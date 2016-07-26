package in.javahome.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HttpMethodsController {

	@RequestMapping(value="/demo",method=RequestMethod.GET)
	public void getEmployee(){
	}
	@RequestMapping(value="/demo",method=RequestMethod.POST)
	public void addEmployee(){
	}
	@RequestMapping(value="/demo",method=RequestMethod.DELETE)
	public void deleteEmployee(){
	}
	@RequestMapping(value="/demo",method=RequestMethod.PUT)
	public void updateEmployee(){
	}	
}
