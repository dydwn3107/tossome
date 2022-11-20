package com.prj.cosm.produce.plan.service;

import java.util.List;

public interface PlanService {
	//생산계획 전체조회 
	public List<PlanVO> selectPlanList();
	
	//생산계획 단건조회
	public PlanVO selectInfo(int planNo);
	
	//생산계획 번호
	public PlanVO selectPlanNo();
	
	//등록
	public int insertPlanInfo(PlanVO planVO);
	
	//수정
	public int updatePlanInfo(PlanVO planVO);
	
	//삭제
	public int deletePlanInfo(int planNo);

}
