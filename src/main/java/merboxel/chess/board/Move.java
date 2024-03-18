package merboxel.chess.board;


import merboxel.chess.board.piece.type.ChessPieceType;

public class Move {

    ChessPieceType chessPieceType;
    Point start;
    Point end;

    public Move(ChessPieceType chessPieceType, Point start, Point end) {
        this.chessPieceType = chessPieceType;
        this.start = start;
        this.end = end;
    }
}
