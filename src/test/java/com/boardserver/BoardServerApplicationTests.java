package com.boardserver;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.boardserver.domain.Board;
import com.boardserver.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class BoardServerApplicationTests {
	@Autowired
	private BoardRepository boardRepo;
	
	@Test
	void contextLoads() {
		Board board = new Board();
		board.setTitle("FIRST");
		board.setWriter("FIRST WRITER");
		board.setContent("FOR TEST");
		board.setCreateDate(new Date());
		board.setCount(0L);
		
		boardRepo.save(board);
	
	}

}
