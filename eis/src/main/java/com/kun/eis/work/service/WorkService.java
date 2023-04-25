package com.kun.eis.work.service;

import java.util.List;

import com.kun.eis.work.vo.WorkVO;

public interface WorkService {
	
	/**
	 * 테스트 항목 리스트
	 * @param vo
	 * @return List
	 * @throws Exception
	 */
	public List<WorkVO> testList(WorkVO vo) throws Exception;

	public WorkVO selectPwCode(WorkVO vo) throws Exception;

}