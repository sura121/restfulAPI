package org.seonbeen.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.seonbeen.domain.BoardVO;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {

	
	private static String namespace = "org.seonbeen.mappers.apimapper";
	
	@Inject
	private SqlSession session;

	
	@Override
	public int creatBoard(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".apiInsert", vo);

	}

	@Override
	public BoardVO readBoard(int bno) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".apiRead", bno);
	}

	@Override
	public List<BoardVO> listBoard() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".apiList");
	}

	@Override
	public void deleteBoard(int bno) throws Exception {
		// TODO Auto-generated method stub
		session.delete(namespace+".apiDelete",bno);
		
	}

	@Override
	public void updateBoard(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.update(namespace+".apiPatch",vo);
	}

	@Override
	public int latestBoard() throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".latestBoard");
	}

}
