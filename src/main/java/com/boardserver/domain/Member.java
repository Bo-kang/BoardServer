package com.boardserver.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString(exclude = "boardList")
@Entity
public class Member {
	@Id
	@Column(name="MEMBER_ID")
	private String id;
	private String password;
	private String name;
	private String role;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date registDate;
	private boolean available;
	
	@OneToMany(mappedBy = "member", fetch=FetchType.EAGER)
	private List<Board> boardList = new ArrayList<Board>();
}
