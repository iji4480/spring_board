package org.ict.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.ict.domain.BoardVO;

// mybatis는 인터페이스에 메서드를 정의한 다음
// xml파일에 메서드 실행시 동작시킬 쿼리문을 분리해 저장합니다.
// 따라 BoardMapper인터페이스에는 실행문 없이 메서드 선언만 합니다.

public interface BoardMapper {
	//ArrayList와 유사한 List(java.util.List)을 활용해
	//BoardVO를 여럿 담을 수 있게 설정
	@Select("SELECT * FROM ictboard where bno > 0")
	public List<BoardVO> getList();
	
}
