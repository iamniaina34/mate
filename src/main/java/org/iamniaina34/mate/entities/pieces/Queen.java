package org.iamniaina34.mate.entities.pieces;

import org.iamniaina34.mate.enums.Color;
import org.iamniaina34.mate.utils.Position;

import java.util.ArrayList;

public class Queen extends Piece {

    public Queen() {
        super("Q", "Queen", 9, Color.WHITE);
    }

    public Queen(Color color) {
        super("Q", "Queen", 9, color);
    }

    @Override
    public void move(int c, int r) {
        if (true) {
            System.out.println("A queen moved");
        }
    }

    @Override
    public ArrayList<Position> getPossibleMoves() {
        return null;
    }
}
