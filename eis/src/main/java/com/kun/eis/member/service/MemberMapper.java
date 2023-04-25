package com.kun.eis.member.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kun.eis.member.vo.MemberVO;

@Mapper
public interface MemberMapper {

	public List<MemberVO> selectEqpmntList(MemberVO vo);

	public MemberVO selectPwCode(MemberVO vo);
	
}