package merboxel.chess.board.piece.type;

public enum ChessPieceType {
    PAWN('P'),
    ROOK('R'),
    KNIGHT('L'),
    BISHOP('B'),
    KING('K'),
    QUEEN('Q');

    char abbreviation;

    ChessPieceType(char c) {
        this.abbreviation = c;
    }

    public char chessPieceTypeAbbreviation() {
        return this.abbreviation;
    }
}
