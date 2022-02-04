package com.boardserver.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.boardserver.domain.Board;
import com.boardserver.domain.Member;

public interface BoardRepository extends CrudRepository<Board, Long>{

	List<Board> findByMember(Member mem);

}
