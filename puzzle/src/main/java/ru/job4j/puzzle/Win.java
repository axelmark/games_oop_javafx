package ru.job4j.puzzle;

public class Win {

    public static boolean check(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                rsl = checkHorizont(board, i) || checkVertical(board, i);
            }
        }
        return rsl;
    }

    public static boolean checkHorizont(int[][] array, int row) {
        for (int index = 0; index < array.length; index++) {
            if (array[row][index] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkVertical(int[][] array, int column) {
        for (int index = 0; index < array[column].length; index++) {
            if (array[index][column] != 1) {
                return false;
            }
        }
        return true;
    }
}
