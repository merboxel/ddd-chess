package merboxel.chess.board.piece;

import merboxel.chess.board.Color;
import merboxel.chess.board.piece.type.ChessPieceType;

public class ChessPiece {

    private final Color color;
    private final ChessPieceType chessPieceType;

    public ChessPiece(Color color, ChessPieceType chessPieceType) {
        this.color = color;
        this.chessPieceType = chessPieceType;
    }

    public boolean isChessPieceType(ChessPieceType chessPieceType) {
        return this.chessPieceType.equals(chessPieceType);
    }

    public boolean isColor(Color color) {
        return this.color.equals(color);
    }

    public boolean isValidChessPieceMove() {
        return false;
    }

    public char chessPieceAbbreviation() {
        if(null == chessPieceType)
            return '.';
        return chessPieceType.chessPieceTypeAbbreviation();
    }
}
