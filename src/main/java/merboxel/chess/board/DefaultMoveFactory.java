package merboxel.chess.board;

import merboxel.chess.board.piece.type.ChessPieceType;

public class DefaultMoveFactory implements MoveFactory {
    public Move parseInputToMove(String moveInput) {
        if(moveInput.length() != 6)
            throw new RuntimeException();

        ChessPieceType chessPieceType;

        switch (moveInput.charAt(0)) {
            case 'R' ->
                    chessPieceType = ChessPieceType.ROOK;
            case 'Q' ->
                    chessPieceType = ChessPieceType.QUEEN;
            case 'K' ->
                    chessPieceType = ChessPieceType.KING;
            case 'P' ->
                    chessPieceType = ChessPieceType.PAWN;
            case 'B' ->
                    chessPieceType = ChessPieceType.BISHOP;
            case 'L' ->
                    chessPieceType = ChessPieceType.KNIGHT;
            default ->
                    throw new RuntimeException();
        }

        Point start = parseInputToPoint(moveInput.substring(1,3));
        Point end = parseInputToPoint(moveInput.substring(4,6));

        return new Move(chessPieceType,start,end);
    }

    private Point parseInputToPoint(String input) {
        if(input.length() != 2)
            throw new RuntimeException();

        int x = Character.toUpperCase(input.charAt(0)) - 'A';
        int y = input.charAt(1) - '1';

        if(x < 0 || x > 7 || y < 0 || y > 7)
            throw new RuntimeException();

        return new Point(x,y);
    }
}
