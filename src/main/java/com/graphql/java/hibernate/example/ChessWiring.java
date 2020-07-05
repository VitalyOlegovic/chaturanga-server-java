package com.graphql.java.hibernate.example;

import com.graphql.java.hibernate.example.data.model.ChessGame;
import com.graphql.java.hibernate.example.data.model.Droid;
import com.graphql.java.hibernate.example.data.repository.ChessRepository;
import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Map;

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

    DataFetcher createChessGame = environment -> {
        Map arguments = environment.getArguments();
        Long id = ((Integer) arguments.get("id")).longValue();
        String playerWhite = (String) arguments.get("playerWhite");
        String playerBlack = (String) arguments.get("playerBlack");
        String inputDate = (String) arguments.get("startDate");
        Date date = Date.valueOf(LocalDate.parse(inputDate));
        ChessGame chessGame = new ChessGame(id, playerWhite, playerBlack, date);
        return getChessRepository().save(chessGame);
    };
}
