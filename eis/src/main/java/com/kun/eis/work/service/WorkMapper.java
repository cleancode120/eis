package com.kun.eis.work.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kun.eis.work.vo.WorkVO;

@Mapper
public interface WorkMapper {

	public List<WorkVO> selectEqpmntList(WorkVO vo);

	public WorkVO selectPwCode(WorkVO vo);
	
}