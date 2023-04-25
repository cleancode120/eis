package com.kun.eis.business.service;

import java.util.List;

import com.kun.eis.business.vo.BusinessVO;

public interface BusinessService {
	
	/**
	 * 테스트 항목 리스트
	 * @param vo
	 * @return List
	 * @throws Exception
	 */
	public List<BusinessVO> testList(BusinessVO vo) throws Exception;

	public BusinessVO selectPwCode(BusinessVO vo) throws Exception;

}