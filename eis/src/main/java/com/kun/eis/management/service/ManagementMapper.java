package com.kun.eis.management.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kun.eis.management.vo.ManagementVO;

@Mapper
public interface ManagementMapper {

	public List<ManagementVO> selectEqpmntList(ManagementVO vo);

	public ManagementVO selectPwCode(ManagementVO vo);
	
}