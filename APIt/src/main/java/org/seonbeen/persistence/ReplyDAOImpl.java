package org.seonbeen.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.seonbeen.domain.ReplyVO;
import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAOImpl implements ReplyDAO {
	
	private static String namespace = "org.seonbeen.mappers.replymapper";
	
	@Inject
	private SqlSession session;
	
	@Override
	public int registerReply(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".replyRegi", vo);
	}

	@Override
	public void modifiedReply(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.update(namespace+".modifyReply", vo);
	}

	@Override
	public void deleteReply(int rno) throws Exception {
		// TODO Auto-generated method stub
		session.delete(namespace+".deleteReply",rno);
	}

	@Override
	public ReplyVO readReply(int rno) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".readReply", rno);
	}

}
