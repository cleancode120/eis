package com.kun.eis.solution.service;

import java.util.List;

import com.kun.eis.solution.vo.SolutionVO;

public interface SolutionService {
	
	/**
	 * 테스트 항목 리스트
	 * @param vo
	 * @return List
	 * @throws Exception
	 */
	public List<SolutionVO> testList(SolutionVO vo) throws Exception;

	public SolutionVO selectPwCode(SolutionVO vo) throws Exception;
	
}