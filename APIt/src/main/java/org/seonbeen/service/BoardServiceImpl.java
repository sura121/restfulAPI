package org.seonbeen.service;

import java.util.List;

import javax.inject.Inject;

import org.seonbeen.domain.BoardVO;
import org.seonbeen.persistence.BoardDAO;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO dao;
	
	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listBoard(); 
	}

	
	@Override
	public int registerBoard(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dao.creatBoard(vo);
	}

	@Override
	public BoardVO listOne(int bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.readBoard(bno);
	}

	@Override
	public void deleteBoard(int bno) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteBoard(bno);
	}
	@Override
	public void modifiedBoard(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		 dao.updateBoard(vo);
	}

}
