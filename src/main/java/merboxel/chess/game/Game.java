package merboxel.chess.game;

import merboxel.chess.board.Board;
import merboxel.chess.board.BoardFactory;
import merboxel.chess.board.Color;

public class Game {

    private final Board board;
    private int currentMove;
    private final Color currentColor;

    public Game() {
        this.board = BoardFactory.createDefaultBoardSetup();
        this.currentMove = 0;
        this.currentColor = Color.WHITE;
    }

    public void doMove(String moveInput) {
        this.currentMove++;
        board.doMove(moveInput);
    }
    public String printBoard() {
        return board.printBoard();
    }
}
