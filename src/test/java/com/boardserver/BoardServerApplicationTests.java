package com.boardserver;

import java.util.Date;

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
	}
	

}
