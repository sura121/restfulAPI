package org.seonbeen.service;

import javax.inject.Inject;

import org.seonbeen.domain.MemberVO;
import org.seonbeen.persistence.MemberDAO;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO dao;
	
	@Override
	public int memberRegister(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dao.memberAPI(vo);
	}

	@Override
	public MemberVO memberRegisterShow(int mno) throws Exception {
		// TODO Auto-generated method stub
		return dao.memberList(mno);
	}

}
