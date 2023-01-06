package com.mycompany.webapp.center.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.webapp.center.dao.ICenterRepository;
import com.mycompany.webapp.center.vo.CenterVO;
import com.mycompany.webapp.common.vo.Pager;

@Service
public class CenterService implements ICenterService{

	@Autowired
	ICenterRepository centerRepository;
	
	public int insertCenterCode() {
		return centerRepository.insertCenterCode();
	}

	@Override
	public int insertCenter(CenterVO centerVO) {
		return centerRepository.insertCenter(centerVO);
	}

	@Override
	public List<CenterVO> centerList(Pager pager) {
		return centerRepository.centerList(pager);
	}
		
	@Override
	public int countAllCenters() {
		return centerRepository.countAllCenters();
	}
}
