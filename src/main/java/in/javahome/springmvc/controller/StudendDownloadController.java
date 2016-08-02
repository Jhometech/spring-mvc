package in.javahome.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;

import in.javahome.springmvc.view.StudentExcelView;

@Controller
public class StudendDownloadController {
	@RequestMapping(value="/excel")
  public View downloadExcel(ModelMap map){
		Map<String, String> data = new HashMap<String, String>();
		data.put("Sitha", "9999999999");
		data.put("Rama", "7777777777");
		map.addAttribute("stdList", data);
	  return new StudentExcelView();
  }
}
