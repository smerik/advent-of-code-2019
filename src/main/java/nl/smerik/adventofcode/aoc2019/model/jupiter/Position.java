package nl.smerik.adventofcode.aoc2019.model.jupiter;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Position {

    public int x;
    public int y;
    public int z;

    public Position(final int x, final int y, final int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "<x=" + x + ", y=" + y + ", z=" + z + '>';
    }
}
