package org.seonbeen.service;

import javax.inject.Inject;

import org.seonbeen.domain.ReplyVO;
import org.seonbeen.persistence.ReplyDAO;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDAO dao;
	
	@Override
	public int registerReply(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dao.registerReply(vo);
	}

	@Override
	public void modifyReply(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.modifiedReply(vo);
	}

	@Override
	public void deleteReply(int rno) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteReply(rno);
	}

	@Override
	public ReplyVO readOneReply(int rno) throws Exception {
		// TODO Auto-generated method stub
		return dao.readReply(rno);
	}

}
