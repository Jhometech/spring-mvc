package in.javahome.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.javahome.springmvc.model.Course;

@Controller
public class CourseController {
	@RequestMapping(value="/course", method=RequestMethod.GET)
	public String getCourse(ModelMap map){
		  map.addAttribute("course", new Course());
		return "course";
	}
	
	@RequestMapping(value="/course", method=RequestMethod.POST)
	public String addCourse(Course c, ModelMap map){
		System.out.println(c);
		  map.addAttribute("course", new Course());
		return "course";
	}
}
