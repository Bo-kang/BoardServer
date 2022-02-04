package com.boardserver.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boardserver.domain.Board;
import com.boardserver.domain.Member;
import com.boardserver.persistence.BoardRepository;
import com.boardserver.persistence.MemberRepository;

@Controller
public class BoardController{
	@Autowired
	private MemberRepository memRepo;
	
	@Autowired
	private BoardRepository boardRepo;
	
	@RequestMapping("/boardList")
	public String getBoardList(Model model) {
		
		//Member mem = memRepo.findById("TestAccount1").get();
		
		List<Board> boardList = (List<Board>)boardRepo.findAll();
		
		model.addAttribute(boardList);
		
		return null;
	}
};