package merboxel.chess.board;

import lombok.Builder;

@Builder
public class Board {

    private final Square[][] squares;
    //
    public void doMove(String moveInput) throws RuntimeException {

        MoveFactory moveFactory = new DefaultMoveFactory();
        Move move = moveFactory.parseInputToMove(moveInput);

        int startX = move.start.x();
        int startY = move.start.y();

        int endX = move.end.x();
        int endY = move.end.y();

        if(!squares[startY][startY].containsChessPieceType(move.chessPieceType)) {
            throw new RuntimeException("Not a valid chessPieceType");
        }

        squares[endY][endX].chessPieceMovedToCurrentSquare(squares[startY][startX]);

    }

    public String printBoard() {
        StringBuilder print = new StringBuilder();

        print.append(" ABCDEFGH \n");
        for(int i = squares.length-1; i >= 0; i--) {
            print.append(i+1);
            for(Square square: squares[i]) {
                print.append(square.printSquare());
            }
            print.append("\n");
        }
        return print.toString();
    }
}
