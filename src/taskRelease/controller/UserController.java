package taskRelease.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import taskRelease.bean.User;
import taskRelease.service.LoginService;

@Controller
public class UserController {
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="login")
	public String login(String username,String password,HttpSession session){
		User user = loginService.getUser(username,password);
		if(user!=null){
			session.setAttribute("userId", user.getId());
			session.setAttribute("userName", user.getName());
			return "redirect:/";
		}
		else
			return "login";
	}
}
