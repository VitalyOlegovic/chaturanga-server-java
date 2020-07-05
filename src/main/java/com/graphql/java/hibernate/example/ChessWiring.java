package com.graphql.java.hibernate.example;

import com.graphql.java.hibernate.example.data.model.ChessGame;
import com.graphql.java.hibernate.example.data.model.Droid;
import com.graphql.java.hibernate.example.data.repository.ChessRepository;
import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;

@Component
public class ChessWiring {

    private final ChessRepository chessRepository;

    public ChessWiring(ChessRepository chessRepository){
        this.chessRepository = chessRepository;
    }

    public ChessRepository getChessRepository() {
        return chessRepository;
    }

    DataFetcher chessDataFetcher = environment -> {
        String sid = environment.getArgument("id");
        Long id = Long.parseLong(sid);

        return getChessRepository().findById(id);
    };

    DataFetcher gamesDataFetcher = environment -> {
        return getChessRepository().findAll();
    };
}
