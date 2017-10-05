package org.seonbeen.controller;

import java.net.URLDecoder;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.seonbeen.domain.ReplyVO;
import org.seonbeen.service.ReplyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reply/*")
public class ReplyAPIController {
	
	private static Logger logger = Logger.getLogger(ReplyAPIController.class);
	
	@Inject
	private ReplyService service;
	
	@RequestMapping(value="/register", method=RequestMethod.POST, produces="application/json; charset=utf8")
	public ResponseEntity<ReplyVO> replyRegi(@ModelAttribute ReplyVO vo, HttpServletRequest request)throws Exception{
		
		try{
			String rcontent = URLDecoder.decode(vo.getRcontent(),"UTF-8");
			String rwriter = URLDecoder.decode(vo.getRwriter(), "UTF-8");
			logger.info(rcontent+"한글");
			logger.info(rwriter+"한글");
			logger.info(vo);
		    service.registerReply(vo);
			int rno = vo.getRno();
			logger.info(rno);
			ReplyVO vo2 = service.readOneReply(rno);
			logger.info(vo2);
			return new ResponseEntity<ReplyVO>(vo2,HttpStatus.OK);
		}catch (Exception e){
		
			return new ResponseEntity<ReplyVO>(HttpStatus.BAD_REQUEST);
		}
		
		
		
	}
	
	@RequestMapping(value="/update/{rno}", method=RequestMethod.PUT)
	public ResponseEntity<ReplyVO> replyDelete(@PathVariable("rno") int rno, @ModelAttribute ReplyVO vo)throws Exception{
		
		try{
			service.modifyReply(vo);
			
			ReplyVO vo2 = service.readOneReply(rno);
			return new ResponseEntity<ReplyVO>(vo2,HttpStatus.OK);
		}catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<ReplyVO>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@RequestMapping(value="/delete/{rno}", method=RequestMethod.DELETE, produces="text/plain;charset=UTF-8")
	public String replyDelete(@PathVariable("rno") int rno) throws Exception{
		
		service.deleteReply(rno);
		
		return rno+"삭제되었습니다.";
	}

}
