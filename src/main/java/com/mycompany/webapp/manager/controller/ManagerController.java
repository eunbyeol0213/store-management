package com.mycompany.webapp.manager.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.json.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.webapp.center.vo.CenterVO;
import com.mycompany.webapp.manager.service.IManagerService;
import com.mycompany.webapp.manager.vo.ManagerVO;

@Controller
public class ManagerController {
	static final Logger logger=LoggerFactory.getLogger(ManagerController.class);

	
	@Autowired 
	IManagerService managerService;
	/* author 은별
	   담당자 목록 조회*/
	@RequestMapping(value="/managerList")
	public String selectManagerList(Model model) {
		List<ManagerVO> managerList = managerService.selectManagerList();
		Map<Integer, List<String>> centerMap = new HashMap<>();
		for(int i=0;i<managerList.size();i++) {
			ManagerVO manager = managerList.get(i);
			List<String> centerNamesByManager = new ArrayList<>();
			int userCode = manager.getUserCode();
			List<CenterVO> centers = managerService.getCenterByManager(userCode);
			List<String> centerNames = new ArrayList<>();
			for(CenterVO center:centers) {
				centerNames.add(center.getCenterName());
			}
			centerMap.put(userCode, centerNames);
		}
				//managerService.getCenterByManager(mgr.getUserCode());
		logger.info("managerList : " + managerList);
		model.addAttribute("managerList", managerList);
		int usercode = managerList.get(0).getUserCode();
		model.addAttribute("userCode",usercode+1);
		model.addAttribute("centerMap",centerMap);
		logger.info("centerMaps : " + centerMap);
		return "jsp/manager/managerlookup";
	}
	
	/* author 은별
	   담당자 상세 조회*/
	@RequestMapping(value="/managerDetail")
	public String selectManagerDetail(Model model, @PathVariable int userCode) {
		ManagerVO mgrDetails = managerService.selectManagerDetail(userCode);
		model.addAttribute("managerVO",mgrDetails);
		return "jsp/manager/managerdetail";
	}
	
	/* author 은별
	  담당자 등록 GET*/
	@GetMapping(value="/managerInsert")
	public String insertManager(Model model) {
		return "jsp/manager/managerlookup";
	}
	
	/* author 은별
	  담당자 등록 POST*/
	@ResponseBody
	@PostMapping(value="/managerInsert")
	public List<ManagerVO> insertManager(ManagerVO mgr) {
		managerService.insertManager(mgr);
		List<ManagerVO> mgrlist = managerService.selectManagerList();
		return mgrlist;
	}

	//담당자 매핑
	@RequestMapping(value="/managerMapping")
	public String managerMapping(Model model) {
		model.addAttribute("managerList", managerService.selectManagerList());
		return "jsp/manager/managermapping";
	}

	//담당하는 센터 정보 조회
	@RequestMapping(value="/getCenters/{userCode}")
	public @ResponseBody List<CenterVO> getCenterByManager(@PathVariable int userCode){
		return managerService.getCenterByManager(userCode);
	}

	//맵핑 해제
	@RequestMapping(value="/cancelMapping", method=RequestMethod.POST)
	public @ResponseBody int cancelMapping(@RequestBody String req) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> map = mapper.readValue(req, Map.class);
		int userCode = Integer.parseInt(map.get("userCode"));
		int centerCode = Integer.parseInt(map.get("centerCode"));
		return managerService.cancelMapping(userCode, centerCode);
	}
	
	//맵핑 요청
	@RequestMapping(value="/mapping", method=RequestMethod.POST)
	public @ResponseBody int mapping(@RequestBody String req) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> map = mapper.readValue(req, Map.class);
		int userCode = Integer.parseInt(map.get("userCode"));
		int centerCode = Integer.parseInt(map.get("centerCode"));
		return managerService.mapping(userCode, centerCode);
	}
}