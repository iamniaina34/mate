package org.iamniaina34.mate.entities.pieces;

import org.iamniaina34.mate.enums.Color;
import org.iamniaina34.mate.utils.Position;

import java.util.ArrayList;

public class Bishop extends Piece {

    public Bishop() {
        super("B", "Bishop", 3, Color.WHITE);
    }

    public Bishop(Color color) {
        super("B", "Bishop", 3, color);
    }

    @Override
    public void move(int c, int r) {
        if (true) {
            System.out.println("A bishop moved");
        }
    }

    @Override
    public ArrayList<Position> getPossibleMoves() {
        return null;
    }
}
