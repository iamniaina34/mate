package org.iamniaina34.mate.ints;

import org.iamniaina34.mate.utils.Position;

import java.util.ArrayList;

public interface Moveable {

    void move(int c, int r);

    ArrayList<Position> getPossibleMoves();
}
