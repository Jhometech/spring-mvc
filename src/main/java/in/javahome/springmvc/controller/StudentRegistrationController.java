package in.javahome.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.javahome.springmvc.model.Register;

@Controller
public class StudentRegistrationController {

	@RequestMapping(value = "/studentRegister", method = RequestMethod.GET)
	public String getRegister(ModelMap map) {
		map.addAttribute("register", new Register());
		return "studentRegister";
	}

	@RequestMapping(value = "/studentRegister", method = RequestMethod.POST)
	public String register(Register r, ModelMap map) {
		map.addAttribute("register", r);
		// Save data in DB
		System.out.println(r);
		return "studentRegister";
	}
}
