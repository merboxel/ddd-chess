package merboxel.chess.board;

import merboxel.chess.board.piece.ChessPiece;
import merboxel.chess.board.piece.type.ChessPieceType;

import java.util.Arrays;

public class BoardFactory {

    public static Board createDefaultBoardSetup() {

        Square[][] squares = new Square[8][8];
        for (int i = 0; i < squares.length; i++) {
            for(int j = 0; j < squares[i].length; j++) {
                squares[i][j] = new Square();
            }
         }

        squares[0][0].setChessPiece(new ChessPiece(Color.WHITE, ChessPieceType.ROOK));
        squares[0][1].setChessPiece(new ChessPiece(Color.WHITE,ChessPieceType.KNIGHT));
        squares[0][2].setChessPiece(new ChessPiece(Color.WHITE,ChessPieceType.BISHOP));
        squares[0][3].setChessPiece(new ChessPiece(Color.WHITE,ChessPieceType.QUEEN));
        squares[0][4].setChessPiece(new ChessPiece(Color.WHITE,ChessPieceType.KING));
        squares[0][5].setChessPiece(new ChessPiece(Color.WHITE,ChessPieceType.BISHOP));
        squares[0][6].setChessPiece(new ChessPiece(Color.WHITE,ChessPieceType.KNIGHT));
        squares[0][7].setChessPiece(new ChessPiece(Color.WHITE,ChessPieceType.ROOK));
        for(Square square : squares[1]) {
            square.setChessPiece(new ChessPiece(Color.WHITE,ChessPieceType.PAWN));
        }

        squares[7][0].setChessPiece(new ChessPiece(Color.BLACK,ChessPieceType.ROOK));
        squares[7][1].setChessPiece(new ChessPiece(Color.BLACK,ChessPieceType.KNIGHT));
        squares[7][2].setChessPiece(new ChessPiece(Color.BLACK,ChessPieceType.BISHOP));
        squares[7][3].setChessPiece(new ChessPiece(Color.BLACK,ChessPieceType.QUEEN));
        squares[7][4].setChessPiece(new ChessPiece(Color.BLACK,ChessPieceType.KING));
        squares[7][5].setChessPiece(new ChessPiece(Color.BLACK,ChessPieceType.BISHOP));
        squares[7][6].setChessPiece(new ChessPiece(Color.BLACK,ChessPieceType.KNIGHT));
        squares[7][7].setChessPiece(new ChessPiece(Color.BLACK,ChessPieceType.ROOK));
        for(Square square : squares[6]) {
            square.setChessPiece(new ChessPiece(Color.BLACK,ChessPieceType.PAWN));
        }

        return Board.builder()
                .squares(squares)
                .build();
    }


    private void defaultBoardSetupWhite() {

    }

    private void defaultBoardSetupBlack() {

    }
}
