package org.iamniaina34.mate.entities.pieces;

import org.iamniaina34.mate.enums.Color;
import org.iamniaina34.mate.utils.Position;

import java.util.ArrayList;

public class Knight extends Piece {

    public Knight() {
        super("N", "Knight", 3, Color.WHITE);
    }

    public Knight(Color color) {
        super("N", "Knight", 3, color);
    }

    @Override
    public void move(int c, int r) {
        if (true) {
            System.out.println("A knight moved");
        }
    }

    @Override
    public ArrayList<Position> getPossibleMoves() {
        return null;
    }
}
