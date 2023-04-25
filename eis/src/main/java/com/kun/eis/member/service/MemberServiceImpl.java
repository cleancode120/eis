package com.kun.eis.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kun.eis.member.vo.MemberVO;
import com.kun.eis.test.vo.TestVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public List<MemberVO> testList(MemberVO vo) throws Exception {
		return memberMapper.selectEqpmntList(vo);
	}

	@Override
	public MemberVO selectPwCode(MemberVO vo) throws Exception {
		return memberMapper.selectPwCode(vo);
	}
}