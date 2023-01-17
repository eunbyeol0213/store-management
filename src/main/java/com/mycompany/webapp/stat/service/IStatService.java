package com.mycompany.webapp.stat.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mycompany.webapp.score.vo.ScoreVO;

public interface IStatService {
	Map<String, List<ScoreVO>> getAvgScores(int centerCode);
}
