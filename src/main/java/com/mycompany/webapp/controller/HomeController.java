package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.webapp.dao.ITestRepository;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class HomeController {
	//private static final Logger logger = LoggerFactory.getLogger(Ch01Controller.class);
	@Autowired
	ITestRepository test;
	
	@RequestMapping("/")
	public String home() {
		//logger.info("실행");
//		log.info("실행");
		System.out.println(test.test());
		return "home";
	}
<<<<<<< HEAD
	@RequestMapping(value="/centerList")
	public String loadCenter() {
		System.out.println("센터조회");
		return "centerList";
=======

	@RequestMapping("/login")
	public String login() {
		return "login";
>>>>>>> refs/remotes/origin/master
	}
	
<<<<<<< HEAD
	@RequestMapping(value="/centerPhoto")
	public String managePhotoCenter() {
		System.out.println("사진관리");
		return "centerPhoto";
=======
	@RequestMapping("/code")
	public String code() {
		return "code";
	}
	
	@RequestMapping("/statistics")
	public String statistics() {
		return "statistics";
>>>>>>> refs/remotes/origin/master
	}
}

