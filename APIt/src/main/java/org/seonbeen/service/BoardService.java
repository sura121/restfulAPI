package org.seonbeen.service;

import java.util.List;

import org.seonbeen.domain.BoardVO;

public interface BoardService {
	
	public List<BoardVO> listAll() throws Exception;
	
	public int registerBoard(BoardVO vo) throws Exception;
	
	public BoardVO listOne(int bno) throws Exception;
	
	public void deleteBoard(int bno) throws Exception;
	
	public void modifiedBoard(BoardVO vo) throws Exception;
}
