package org.seonbeen.persistence;

import java.util.List;

import org.seonbeen.domain.BoardVO;

public interface BoardDAO {
	
	public int creatBoard(BoardVO vo) throws Exception;
	
	public BoardVO readBoard(int bno) throws Exception;
	
	public List<BoardVO> listBoard() throws Exception;
	
	public void deleteBoard(int bno) throws Exception;
	
	public void updateBoard(BoardVO vo) throws Exception;
	
	public int latestBoard() throws Exception;

}
