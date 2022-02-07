package com.boardserver.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardserver.domain.Board;
import com.boardserver.domain.Member;
import com.boardserver.persistence.BoardRepository;
import com.boardserver.persistence.MemberRepository;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardRepository boardRepo;
	
	@Autowired
	private MemberRepository memberRepo;
	
	
	@Override
	public List<Board> getBoardList(Board board){
		return (List<Board>) boardRepo.findAll();
	}
	
	@Override
	public void insertBoard(Board board) {
		Member tmpMember = memberRepo.findById("TestAccount1").get();
		board.setMember(tmpMember);
		boardRepo.save(board);
	}
	
	@Override
	public Board getBoard(Board board) {
		return boardRepo.findById(board.getSeq()).get();
	}
	
	@Override
	public void updateBoard(Board board) {
		
		
		
		Board findBoard = boardRepo.findById(board.getSeq()).get();
		findBoard.setTitle(board.getTitle());
		findBoard.setContent(board.getContent());
		boardRepo.save(findBoard);
	}
	
	@Override
	public void deleteBoard(Board board) {
		
	}
}
