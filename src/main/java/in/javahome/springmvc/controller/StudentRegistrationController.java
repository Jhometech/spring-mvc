package in.javahome.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.javahome.springmvc.dao.StudentDAO;
import in.javahome.springmvc.model.Register;
import in.javahome.springmvc.service.RegisterService;

@Controller
public class StudentRegistrationController {
	@Autowired
	private RegisterService service;

	@RequestMapping(value = "/studentRegister", method = RequestMethod.GET)
	public String getRegister(ModelMap map) {
		map.addAttribute("register", new Register());
		return "studentRegister";
	}

	@RequestMapping(value = "/studentRegister", method = RequestMethod.POST)
	public String register(Register r, ModelMap map) {
		map.addAttribute("register", r);
		try {
			service.register(r);
			map.addAttribute("message", "Succussfully Register");
		} catch (Exception e) {
			map.addAttribute("message", "Existing User");
			e.printStackTrace();
		}
		System.out.println(r);
		return "studentRegister";
	}
}
