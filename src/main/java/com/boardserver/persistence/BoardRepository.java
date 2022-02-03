package com.boardserver.persistence;

import org.springframework.data.repository.CrudRepository;

import com.boardserver.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{

}
