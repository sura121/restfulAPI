package org.seonbeen.service;

import org.seonbeen.domain.MemberVO;

public interface MemberService {

	public int memberRegister(MemberVO vo) throws Exception;
	
	public MemberVO memberRegisterShow(int mno) throws Exception;
}
