package org.iamniaina34.mate.entities.pieces;

import org.iamniaina34.mate.enums.Color;
import org.iamniaina34.mate.utils.Position;

import java.util.ArrayList;

public class Rook extends Piece {

    public Rook() {
        super("R", "Rook", 5, Color.WHITE);
    }

    public Rook(Color color) {
        super("R", "Rook", 5, color);
    }

    public Rook(Color color, Position coordinates) {
        super("R", "Rook", 5, color);
    }

    @Override
    public void move(int c, int r) {
        if (true) {
            System.out.println("A rook moved");
        }
    }

    @Override
    public ArrayList<Position> getPossibleMoves() {
        return null;
    }
}
