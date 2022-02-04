package com.boardserver.persistence;

import org.springframework.data.repository.CrudRepository;

import com.boardserver.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String> {

}
