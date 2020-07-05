package com.graphql.java.hibernate.example.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class ChessGame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String playerWhite;
    private String playerBlack;
    private java.sql.Date startDate;

    public ChessGame(){

    }

    public ChessGame(Long id, String playerWhite, String playerBlack, Date startDate) {
        this.id = id;
        this.playerWhite = playerWhite;
        this.playerBlack = playerBlack;
        this.startDate = startDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerWhite() {
        return playerWhite;
    }

    public void setPlayerWhite(String playerWhite) {
        this.playerWhite = playerWhite;
    }

    public String getPlayerBlack() {
        return playerBlack;
    }

    public void setPlayerBlack(String playerBlack) {
        this.playerBlack = playerBlack;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "ChessGame{" +
                "playerWhite='" + playerWhite + '\'' +
                ", playerBlack='" + playerBlack + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
