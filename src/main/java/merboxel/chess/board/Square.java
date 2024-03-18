package merboxel.chess.board;

import merboxel.chess.board.piece.ChessPiece;
import merboxel.chess.board.piece.type.ChessPieceType;

public class Square {

    private ChessPiece chessPiece;

    public ChessPiece getChessPiece() {
        return chessPiece;
    }

    public void setChessPiece(ChessPiece chessPiece) {
        this.chessPiece = chessPiece;
    }

    public boolean containsChessPieceType(ChessPieceType chessPieceType) {

        return containsChessPiece() && chessPiece.isChessPieceType(chessPieceType);
    }

    public void chessPieceMovedToCurrentSquare(Square that) {

        this.setChessPiece(that.chessPiece);
        that.setChessPiece(null);
    }

    public boolean containsChessPiece() {
        return null != chessPiece;
    }

    public char printSquare() {
        if(null == chessPiece)
            return '-';
        return chessPiece.chessPieceAbbreviation();
    }
}