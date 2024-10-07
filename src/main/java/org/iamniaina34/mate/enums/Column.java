package org.iamniaina34.mate.enums;

public enum Column {
    A(1, 'a'),
    B(2, 'b'),
    C(3, 'c'),
    D(4, 'd'),
    E(5, 'e'),
    F(6, 'f'),
    G(7, 'g'),
    H(8, 'h');

    int rank;
    char value;

    Column(int rank, char value) {
        this.rank = rank;
        this.value = value;
    }

    public int getRank() {
        return rank;
    }

    public char getValue() {
        return value;
    }

    public static Column getByRank(int rank) {
        for (Column column : Column.values()) {
            if (column.getRank() == rank) return column;
        }
        throw new IllegalArgumentException("No column assigned to " + rank);
    }
}
