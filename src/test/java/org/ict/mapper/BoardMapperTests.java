package org.ict.mapper;

import java.util.List;

import org.ict.domain.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Autowired //의존성 주입
	private BoardMapper boardMapper;
	
	@Test
	public void testGetList() {
		
		List<BoardVO> boards = boardMapper.getList();
		boards.forEach(board -> {
			
			log.info(board);
		
		});
			
		
	}
	
	
	//@Test
	public void testInsert() {
		//BoardVO객체를 다음 조건으로 완성시켜주세요
		//content : "insert본문"
		//title : "insert제목"
		//writer : "insert글쓴이"
		BoardVO board = new BoardVO();
		
		board.setContent("insert본문");
		board.setTitle("insert제목");
		board.setWriter("insert글쓴이");
		boardMapper.insert(board);
	
		
		//완성시킨 구문을 .insert() 메서드를 이용해
		//글을 DB에 집어넣어주세요.
		//코드작성
	}
	
	
	//@Test
	public void testRead() {
		BoardVO board = boardMapper.read(6L);
		
		log.info(board);
		
	}
	
	
	//@Test
	public void testDelete() {
		boardMapper.delete(6L);
		
		log.info("삭제 성공");
		
	}
	
//	@Test
	public void testUpdate() {
		//수정내역은 BoardVO에 담아서 보내야 합니다.
		//BoardVO를 생성해주시고 필요 정보 (bno, title, content)
		//을 세팅해서 수정 구문을 실행해주세요.
		BoardVO board = new BoardVO();
		board.setBno(5L);
		board.setTitle("수정제목");
		board.setContent("수정내용");
		
		int count = boardMapper.update(board);
		log.info("변경 된 컬럼 수 : " + count);
	}
	
	
	
	
	
}











