package com.kun.eis.project.service;

import java.util.List;

import com.kun.eis.project.vo.ProjectVO;

public interface ProjectService {
	
	/**
	 * 테스트 항목 리스트
	 * @param vo
	 * @return List
	 * @throws Exception
	 */
	public List<ProjectVO> testList(ProjectVO vo) throws Exception;

	public ProjectVO selectPwCode(ProjectVO vo) throws Exception;

}