package com.kun.eis.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kun.eis.management.vo.ManagementVO;
	
@Service("managementService")
public class ManagementServiceImpl implements ManagementService {

	@Autowired
	private ManagementMapper managementMapper;

	@Override
	public List<ManagementVO> testList(ManagementVO vo) throws Exception {
		return managementMapper.selectEqpmntList(vo);
	}

	@Override
	public ManagementVO selectPwCode(ManagementVO vo) throws Exception {
		return managementMapper.selectPwCode(vo);
	}
}