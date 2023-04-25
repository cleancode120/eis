package com.kun.eis.project.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kun.eis.project.vo.ProjectVO;

@Mapper
public interface ProjectMapper {

	public List<ProjectVO> selectEqpmntList(ProjectVO vo);

	public ProjectVO selectPwCode(ProjectVO vo);
	
}