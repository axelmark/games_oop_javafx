package ru.job4j.chess.firuges.black;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell pos = bishopBlack.position();
        assertThat(pos, is(Cell.A1));
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Figure figure = bishopBlack.copy(Cell.E7);
        Cell pos = figure.position();
        assertThat(pos, is(Cell.E7));
    }

    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell[] steps = bishopBlack.way(Cell.E6);
        for (Cell step : steps) {
            System.out.println(step);
        }
        assertThat(steps[0].toString(), is("D7"));
        assertThat(steps[1].toString(), is("E6"));

    }

    @Test
    public void testIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        boolean result = bishopBlack.isDiagonal(bishopBlack.position(), Cell.C5);
        assertThat(result, is(false));
    }
}