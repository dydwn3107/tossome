package com.prj.cosm.produce.plan.mapper;

import java.util.List;


import com.prj.cosm.produce.plan.service.PlanVO;

public interface PlanMapper {
	
		// 생산계획 전체조회 
		public List<PlanVO> getPlanList();
		
		// 생산계획 단건조회
		public PlanVO selectInfo(PlanVO planVO); 
		
		//상세조회
		public PlanVO getPlanNo();
		
		//등록
		public int insertPlan(PlanVO planVO);
		
		//수정
		public int updatePlan(PlanVO planVO);
		
		//삭제
		public int deletePlan(int planNo);
}
