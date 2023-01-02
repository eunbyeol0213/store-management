package com.mycompany.webapp.center.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CenterController {

	@RequestMapping(value="/centerPhoto")
	public String managePhotoCenter() {
		System.out.println("사진관리");
		return "jsp/center/centerPhoto";
	}
	
	@RequestMapping(value="/centerList")
	public String loadCenter() {
		return "jsp/center/centerList";
	}
}