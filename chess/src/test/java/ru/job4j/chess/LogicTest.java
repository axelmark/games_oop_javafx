package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void testMoveFigureNotFoundException()
        throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.move(Cell.C4, Cell.D5);
    }

    @Test(expected = OccupiedCellException.class)
    public void testMoveOccupiedCellException()
        throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.add(new PawnBlack(Cell.D7));
        logic.move(Cell.C8, Cell.E6);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testMoveImpossibleMoveException()
        throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.move(Cell.C8, Cell.A5);
    }
}