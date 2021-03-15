package org.ict.service;

import java.util.List;

import org.ict.domain.BoardVO;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {

	@Autowired
	private BoardService service;
	
	@Test
	public void testRegister() {
		//BoardVO를 생성하고 service의 register 메서드를 사용
		//어렵다면 BoardMapperTest를 참고해서 완성시켜주세요.
		
		BoardVO board = new BoardVO();
		board.setTitle("서비스 제목");
		board.setContent("레지스터 내용");
		board.setWriter("서비스 작성자");
		
		service.register(board);
	}
	
	
	@Test
	public void testGet() {
		service.get(8L);
		
		
		
	}
	
	@Test
	public void testModify() {
		BoardVO board = new BoardVO();
		board.setBno(8L);
		
		board.setTitle("수정후 제목");
		board.setContent("수정 후 내용");
		board.setWriter("글쓴이 수정");
		
		service.modify(board);
		
	}
	
	@Test
	public void testRemove() {
		service.remove(8L);
		
		
		
	}
	
	
	
	
	
	
}





















