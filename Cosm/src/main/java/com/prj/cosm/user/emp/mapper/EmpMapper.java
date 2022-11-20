package com.prj.cosm.user.emp.mapper;

import java.util.List;

import com.prj.cosm.user.emp.service.EmpVO;

public interface EmpMapper {
	// 전체조회
	public List<EmpVO> empSelectList(int no);

	// 조회(로그인)
	public EmpVO empSelect(String usersId);

	// 상세조회
	public EmpVO userInfoSelect(String usersNo);

	// 가입(직원 가입)
	public int empInsert(EmpVO vo);

	// 수정
	public int empUpdate(EmpVO vo);

	// 탈퇴
	public int empDelete(EmpVO vo);

	// 사원 권한 리스트
	public List<String> getAuthorList();

	// 아이디 중복 조회
	public int checkId(String usersId);

}
