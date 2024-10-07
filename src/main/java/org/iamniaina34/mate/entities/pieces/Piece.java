package org.iamniaina34.mate.entities.pieces;

import org.iamniaina34.mate.enums.Color;
import org.iamniaina34.mate.ints.Moveable;

public abstract class Piece implements Moveable {

    private String key;
    private String name;
    private Integer point;
    private Color color;

    public Piece() {
    }

    public Piece(String key, String name, Integer point, Color color) {
        this.key = key;
        this.name = name;
        this.point = point;
        this.color = color;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
