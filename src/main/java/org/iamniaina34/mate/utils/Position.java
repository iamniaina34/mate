package org.iamniaina34.mate.utils;

import org.iamniaina34.mate.enums.Column;

public class Position {

    private Column column;
    private Integer row;

    public Position() {
    }

    public Position(Column column, Integer row) {
        this.setColumn(column);
        this.setRow(row);
    }

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        if (row < 1 || row > 8) throw new IllegalArgumentException("row value should be between 1 and 8");
        this.row = row;
    }

    @Override
    public String toString() {
        return "" + getColumn().getValue() + getRow();
    }
}
