package com.mycompany.webapp.manager.service;

import java.util.List;

import com.mycompany.webapp.center.vo.CenterVO;
import com.mycompany.webapp.manager.vo.ManagerVO;

public interface IManagerService {
	/* author 고은별
	 * 담당자 등록 */
	int insertManager(ManagerVO mgr);
	
	/* author 고은별
	 * 담당자 목록 조회 */
	List<ManagerVO> selectManagerList();
	
	/* author 고은별
	 * 담당자 정보 상세조회 */
	ManagerVO selectManagerDetail(int userCode);
	
	/* author 고은별
	 * 담당자 정보 수정*/
	int managerUpdate(ManagerVO mgr);
	
	//유진
	List<CenterVO> getCenterByManager(int userCode);
	int cancelMapping(int userCode, int centerCode);
	int mapping(int userCode, int centerCode);
}
