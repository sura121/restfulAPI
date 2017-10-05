package org.seonbeen.service;

import org.seonbeen.domain.ReplyVO;

public interface ReplyService {
	
	public int registerReply(ReplyVO vo) throws Exception;
	
	public void modifyReply(ReplyVO vo) throws Exception;
	
	public void deleteReply(int rno) throws Exception;
	
	public ReplyVO readOneReply(int rno) throws Exception;

}
