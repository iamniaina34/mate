package org.iamniaina34.mate.entities;

import org.iamniaina34.mate.entities.pieces.Piece;
import org.iamniaina34.mate.utils.Position;

public class Square {

    private Position position;
    private Piece piece;

    public Square() {
    }

    public Square(Position position) {
        this.position = position;
    }

    public Square(Position position, Piece piece) {
        this.position = position;
        this.piece = piece;
    }

    public Position getCoordinates() {
        return position;
    }

    public void setCoordinates(Position position) {
        this.position = position;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void removePiece() {
        this.piece = null;
    }
}
