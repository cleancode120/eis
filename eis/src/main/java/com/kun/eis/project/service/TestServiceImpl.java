package com.kun.eis.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kun.eis.project.vo.ProjectVO;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectMapper projectMapper;

	@Override
	public List<ProjectVO> testList(ProjectVO vo) throws Exception {
		return projectMapper.selectEqpmntList(vo);
	}

	@Override
	public ProjectVO selectPwCode(ProjectVO vo) throws Exception {
		return projectMapper.selectPwCode(vo);
	}	
}