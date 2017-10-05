package org.seonbeen.persistence;

import org.seonbeen.domain.ReplyVO;

public interface ReplyDAO {

	public int registerReply(ReplyVO vo) throws Exception;
	
	public void modifiedReply(ReplyVO vo) throws Exception;
	
	public void deleteReply(int rno) throws Exception;
	
	public ReplyVO readReply(int rno) throws Exception;
}
