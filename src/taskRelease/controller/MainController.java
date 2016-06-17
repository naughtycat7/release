package taskRelease.controller;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import taskRelease.pojo.ShowInfo;
import taskRelease.service.ShowModuleService;

@Controller
public class MainController {
	
	@Autowired
	public ShowModuleService showModuleService;
	
	@RequestMapping(value="/")
	public String showMain(Model model,HttpSession session){
//		Enumeration<String> e = session.getAttributeNames();
		String userName=null;
//		Integer userId=null;
//		while(e.hasMoreElements()){
		userName = (String) session.getAttribute("userName");
//		userId = (Integer) session.getAttribute("userId");
		List<ShowInfo> module1 = showModuleService.showModule1();
		List<ShowInfo> module2 = showModuleService.showModule2();
		model.addAttribute("module1", module1);
		model.addAttribute("module2", module2);
		model.addAttribute("userName", userName);
		return "main";
	}
}
