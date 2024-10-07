package org.iamniaina34.mate.entities;

import org.iamniaina34.mate.enums.Color;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Game {

    private Board board;
    private Color turn;
    private List<Player> players;
    private Integer moveIndex;
    private HashMap<Integer, Move[]> moves;

    public Game(Player player1, Player player2) {
        this.board = new Board();
        this.players = Arrays.asList(player1, player2);
        this.turn = Color.WHITE;
        this.moveIndex = 1;
    }

    public void startGame() {
        // Let the game begin !!
    }

    public void nextTurn() {
        turn = (turn == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }

    public boolean isCheck() {
        return false;
    }

    public boolean isCheckmate() {
        return false;
    }

    public boolean isStalemate() {
        return false;
    }

    public boolean isDraw() {
        return false;
    }
}
