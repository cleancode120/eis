package com.kun.eis.solution.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kun.eis.solution.vo.SolutionVO;

@Mapper
public interface SolutionMapper {

	public List<SolutionVO> selectEqpmntList(SolutionVO vo);

	public SolutionVO selectPwCode(SolutionVO vo);
	
}