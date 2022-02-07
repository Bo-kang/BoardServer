package com.boardserver.domain;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString (exclude = "member")
@Entity
public class Board {
	@Id @GeneratedValue
	private Long seq;
	private String title;
	// private String writer;
	private String content;
	
	
	@Column(insertable = false, updatable = false, columnDefinition = "date default sysdate")
	private Date createDate;
	
	@Column(insertable = false, updatable = false, columnDefinition = "number default 0")
	private Long count;

	@ManyToOne
	@JoinColumn(name = "MEMBER_ID", nullable = false)
	private Member member;
}
