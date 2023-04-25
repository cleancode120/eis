package com.kun.eis.business.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kun.eis.business.vo.BusinessVO;

@Mapper
public interface BusinessMapper {

	public List<BusinessVO> selectEqpmntList(BusinessVO vo);

	public BusinessVO selectPwCode(BusinessVO vo);
	
}