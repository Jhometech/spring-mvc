package in.javahome.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	   static  List<String> empDB = new ArrayList<String>();
	    static{
	    	empDB.add("Raghu");
	    	empDB.add("Siva");
	    	empDB.add("Chandra");
	    	empDB.add("Sita");
	    }
	    @RequestMapping(value="/searchEmp")
		public String searchEmployees(@RequestParam("empoyeeName") String searchKey, 
				ModelMap map ){
			List<String> result = new ArrayList<String>();
		     for (String string : empDB) {
				if(string.contains(searchKey)){
					result.add(string);
				}
			}	
			map.addAttribute("result",result);
			return "employee";
		}
	    @RequestMapping("/attDemo")
	    public String attributeDemo(ModelMap map){
	    	map.addAttribute("time", new Date());
	    	return "demo";
	    }
	    
	    @RequestMapping("/redirect")
	    public String redirectDemo(ModelMap map){
	    	return "redirect:http://www.google.in";
	    }
	    
	    
}
