package org.seonbeen.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.seonbeen.domain.MemberVO;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	private static String namespace = "org.seonbeen.mappers.apimapper";
	
	@Inject
	private SqlSession session;
	
	@Override
	public int memberAPI(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".apiMember",vo);
	}

	@Override
	public MemberVO memberList(int mno) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".memberList", mno);
	}

}
