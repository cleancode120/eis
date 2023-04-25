package com.kun.eis.member.service;

import java.util.List;

import com.kun.eis.member.vo.MemberVO;

public interface MemberService {
	
	/**
	 * 테스트 항목 리스트
	 * @param vo
	 * @return List
	 * @throws Exception
	 */
	public List<MemberVO> testList(MemberVO vo) throws Exception;

	public MemberVO selectPwCode(MemberVO vo) throws Exception;

}