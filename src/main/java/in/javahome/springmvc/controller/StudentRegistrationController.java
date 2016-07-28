package in.javahome.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String register(@Valid @ModelAttribute("register") Register r, BindingResult result, ModelMap map) {
		  if(result.hasErrors()){
			  // redisplay form with error messages
			  return "studentRegister";
		  }
//		  IF form data is valid go and register the student
		  try {
				service.register(r);
				map.addAttribute("message", "Succussfully Register");
			} catch (Exception e) {
				map.addAttribute("message", "Existing User");
				e.printStackTrace();
			}
		return "studentRegister";
	}
}
