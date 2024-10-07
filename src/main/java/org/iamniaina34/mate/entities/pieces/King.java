package org.iamniaina34.mate.entities.pieces;

import org.iamniaina34.mate.enums.Color;
import org.iamniaina34.mate.utils.Position;

import java.util.ArrayList;

public class King extends Piece {

    public King() {
        super("K", "King", 10, Color.WHITE);
    }

    public King(Color color) {
        super("K", "King", 10, color);
    }

    @Override
    public void move(int c, int r) {
        if (Math.abs(c) <= 1 && Math.abs(r) <= 1) {
            System.out.println("The king moved");
        }
    }

    @Override
    public ArrayList<Position> getPossibleMoves() {
        return null;
    }
}
