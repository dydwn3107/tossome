package com.prj.cosm.user.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.prj.cosm.user.emp.mapper.EmpMapper;
import com.prj.cosm.user.emp.service.EmpService;
import com.prj.cosm.user.emp.service.EmpVO;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpMapper mapper;

	@Override
	public List<EmpVO> empSelectList() {
		return mapper.empSelectList(0);
	}

	@Override
	public EmpVO empSelect(String usersNo) {
		return mapper.empSelect(usersNo);
	}

	@Override
	public int empInsert(EmpVO vo) {
		BCryptPasswordEncoder enco = new BCryptPasswordEncoder();
		vo.setUsersPassword(enco.encode(vo.getUsersPassword()));
		if (vo.getUsersAuthor() == null || vo.getUsersAuthor().equals("")) {
			vo.setUsersAuthor("고객");
		}
		return mapper.empInsert(vo);
	}

	@Override
	public int empUpdate(EmpVO vo) {
		return mapper.empUpdate(vo);
	}

	@Override
	public int empDelete(EmpVO vo) {
		return mapper.empDelete(vo);
	}

	@Override
	public List<String> getAuthorList() {
		return mapper.getAuthorList();
	}

	@Override
	public int checkId(String id) {
		return mapper.checkId(id);
	}

}
