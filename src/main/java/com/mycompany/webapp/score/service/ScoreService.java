package com.mycompany.webapp.score.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.webapp.score.dao.IScoreRepository;
import com.mycompany.webapp.score.vo.ScoreVO;

@Service
public class ScoreService implements IScoreService {

	@Autowired
	IScoreRepository scoreRepository;
	
	//유진
	//전체 그룹코드 조회
	@Override
	public List<Map<String, String>> getAllGroupCodes() {
		return scoreRepository.getAllGroupCodes();
	}

	//그룹코드별 상세코드 조회
	@Override
	public List<Map<String, Object>> getDetailCodes(String groupCode) {
		return scoreRepository.getDetailCodes(groupCode);
	}

	//상세코드 수정
	@Override
	public int updateDetailCode(Map<String, String> detailCodeMap) {
		return scoreRepository.updateDetailCode(detailCodeMap);
	}

	//그룹코드 수정
	@Override
	public int updateGroupCode(Map<String, String> groupCodeMap) {
		//그룹코드 사용여부가 N이면 하위 상세코드들도 사용중지되도록
		if(groupCodeMap.get("groupOccupied").equals("N")) {
			Map<String, String> detailMap = new HashMap<String, String>();
			detailMap.put("detailOccupied", groupCodeMap.get("groupOccupied"));
			detailMap.put("groupCode", groupCodeMap.get("groupCode"));
			scoreRepository.updateDetailCode(detailMap);
		}
		return scoreRepository.updateGroupCode(groupCodeMap);
	}
	
	//상세코드 추가
	@Override
	public int insertDetailCode(Map<String, String> detailCodeMap) {
		return scoreRepository.insertDetailCode(detailCodeMap);
	}
	
	//그룹코드 추가
	@Override
	public int insertGroupCode(Map<String, String> groupCodeMap) {
		return scoreRepository.insertGroupCode(groupCodeMap);
	}
	
	//윤선

	//아래는 구현해야함
	@Override
	public List<ScoreVO> getScoreList() {
		return scoreRepository.getScoreList();
	}

	@Override
	public void insertScore(ScoreVO score) {
		scoreRepository.saveScore(score);
	}

	@Override
	public void deleteScore(ScoreVO score) {
	}

	@Override
	public int saveScore(ScoreVO score) {
		return scoreRepository.saveScore(score);
	}
}