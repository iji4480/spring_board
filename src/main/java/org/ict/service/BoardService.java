package org.ict.service;

import java.util.List;

import org.ict.domain.BoardVO;

// 서비스 계층에는 일반적으로 담당 테이블 하나당 인터페이스 하나
// 그리고 그 인터페이스를 구현한 구현 클래스 하나를 만듭니다.
// 하나의 메서드 당 하나의 쿼리가 필요.



public interface BoardService {
	
	public void register(BoardVO board);
	
	public BoardVO get(Long bno);
	
	public boolean modify(BoardVO board); //update
	
	public boolean remove(Long bno);
	
	public List<BoardVO> getList(); //delete
	
	
}
