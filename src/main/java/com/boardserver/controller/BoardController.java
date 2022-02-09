package com.boardserver.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.boardserver.domain.Board;
import com.boardserver.domain.Member;
import com.boardserver.persistence.BoardRepository;
import com.boardserver.persistence.MemberRepository;
import com.boardserver.service.BoardService;

@SessionAttributes("member")
@Controller
public class BoardController{
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/boardList")
	public String getBoardList(@ModelAttribute("member") Member member , Model model, Board board) {
		
		if(member.getId() == null) {
			return "redirect:login";
		}
		
		List<Board> boardList = boardService.getBoardList(board);
		
		model.addAttribute(boardList);
		
		return "boardList";
	}
	
	@GetMapping("/insertBoard")
	public String writeBoardView(Model model, Board board) {

		return "insertBoard";
	}
	
	@PostMapping("/insertBoard")
	public String writeBoard(Model model, Board board) {

		boardService.insertBoard(board);
		return "redirect:boardList";
	}
	
	@GetMapping("/board")
	public String Board(Model model, Board board) {
		model.addAttribute("board", boardService.getBoard(board));
		return "board";
	}
	
	@PostMapping("/updateBoard")
	public String updateBoard(Model model, Board board) {
		boardService.updateBoard(board);
		return "redirect:boardList";
	}
	
	@GetMapping("deleteBoard")
	public String deleteBoard(Model model, Board board) {
		boardService.deleteBoard(board);
		return "redirect:boardList";
	}
	
	@ModelAttribute("member")
	public Member setMember() {
		return new Member();
	}
};