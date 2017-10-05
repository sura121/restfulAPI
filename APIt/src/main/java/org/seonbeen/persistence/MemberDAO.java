package org.seonbeen.persistence;

import org.seonbeen.domain.MemberVO;

public interface MemberDAO {
	
	public int memberAPI(MemberVO vo)throws Exception;
	
	public MemberVO memberList(int mno)throws Exception;

}
