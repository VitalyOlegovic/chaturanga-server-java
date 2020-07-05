package com.graphql.java.hibernate.example.data.repository;

import com.graphql.java.hibernate.example.data.model.ChessGame;
import org.springframework.data.repository.CrudRepository;

public interface ChessRepository extends CrudRepository<ChessGame,Long> {
}
