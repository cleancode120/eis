package com.kun.eis.work.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kun.eis.work.vo.WorkVO;

@Service("workService")
public class WorkServiceImpl implements WorkService {

	@Autowired
	private WorkMapper workMapper;

	@Override
	public List<WorkVO> testList(WorkVO vo) throws Exception {
		return workMapper.selectEqpmntList(vo);
	}

	@Override
	public WorkVO selectPwCode(WorkVO vo) throws Exception {
		return workMapper.selectPwCode(vo);

	}
}