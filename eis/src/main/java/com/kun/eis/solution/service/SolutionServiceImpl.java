package com.kun.eis.solution.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kun.eis.solution.vo.SolutionVO;

@Service("solutionService")
public class SolutionServiceImpl implements SolutionService {

	@Autowired
	private SolutionMapper solutionMapper;

	@Override
	public List<SolutionVO> testList(SolutionVO vo) throws Exception {
		return solutionMapper.selectEqpmntList(vo);
	}

	@Override
	public SolutionVO selectPwCode(SolutionVO vo) throws Exception {
		return solutionMapper.selectPwCode(vo);
	}
}