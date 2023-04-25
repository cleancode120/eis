package com.kun.eis.management.service;

import java.util.List;

import com.kun.eis.management.vo.ManagementVO;

public interface ManagementService {
	
	/**
	 * 테스트 항목 리스트
	 * @param vo
	 * @return List
	 * @throws Exception
	 */
	public List<ManagementVO> testList(ManagementVO vo) throws Exception;

	public ManagementVO selectPwCode(ManagementVO vo) throws Exception;

}