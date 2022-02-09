package com.boardserver.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.boardserver.domain.Board;
import com.boardserver.domain.Member;
import com.boardserver.persistence.BoardRepository;
import com.boardserver.persistence.MemberRepository;
import com.boardserver.service.BoardService;
import com.boardserver.service.MemberService;

@SessionAttributes("member")
@Controller
public class LoginController {
	@Autowired
	private MemberService memberService;

	@GetMapping("/login")
	public void loginView() {

	}

	@PostMapping("/login")
	public String login(Member member, Model model) {
		Member findMember = memberService.getMember(member);

		if (findMember != null && findMember.getPassword().equals(member.getPassword())) {
			model.addAttribute("member", findMember);
			return "redirect:boardList";
		} else {
			return "redirect:login";
		}
	}
	@GetMapping("/logout")
	public String logout(SessionStatus status) {
		status.setComplete();
		return "redirect:index.html";
	}
}
