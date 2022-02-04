package com.boardserver;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.boardserver.domain.*;
import com.boardserver.persistence.BoardRepository;
import com.boardserver.persistence.MemberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class BoardServerApplicationTests {
	@Autowired
	private BoardRepository boardRepo;
	
	@Autowired
	private MemberRepository memberRepo;
	
	@Test
	void saveTest() {
		
		Member member = new Member();
		member.setId("TestAccount1");
		member.setName("Admin");
		member.setPassword("admin1");
		member.setRegistDate(new Date());
		member.setRole("TEST");
		member.setAvailable(true);
		memberRepo.save(member);
		
		Board board = new Board();
		board.setTitle("FIRST");
		board.setContent("FOR TEST");
		board.setCreateDate(new Date());
		board.setCount(0L);
		board.setMember(member);
		boardRepo.save(board);
		
		Board board2 = new Board();
		board2.setTitle("SECOND");
		board2.setContent("FOR TEST");
		board2.setCreateDate(new Date());
		board2.setCount(0L);
		board2.setMember(member);
		boardRepo.save(board2);
	}
	
	@Test
	void findByTest() {
		Member mem = memberRepo.findById("TestAccount1").get();
		
		List<Board> boardList = boardRepo.findByMember(mem);
		
		for(Board board : boardList) {
			System.out.println(board.toString());
		}
	}

}
