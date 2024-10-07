package org.iamniaina34.mate.entities.pieces;

import org.iamniaina34.mate.enums.Color;
import org.iamniaina34.mate.utils.Position;

import java.util.ArrayList;

public class Pawn extends Piece {

    public Pawn() {
        super("", "Pawn", 1, Color.WHITE);
    }

    public Pawn(Color color) {
        super("", "Pawn", 1, color);
    }

    public Pawn(Color color, Position coordinates) {
        super("", "Pawn", 1, color);
    }


    @Override
    public void move(int c, int r) {
        System.out.println("A pawn moved");
    }

    @Override
    public ArrayList<Position> getPossibleMoves() {
        return null;
    }
}
