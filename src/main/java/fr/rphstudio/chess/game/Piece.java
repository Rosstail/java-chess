package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

public class Piece {
    /**
     * Attribute
     */
    private ChessModel.ChessType chessType;
    private ChessModel.ChessColor chessColor;

    /**
     * constructor
     * @param type
     * @param color
     */
    public Piece(IChess.ChessType type, IChess.ChessColor color) {
        this.chessType = type;
        this.chessColor = color;
    }

    public ChessModel.ChessType getType() {
        return this.chessType;
    }

    public ChessModel.ChessColor getColor() {
        return this.chessColor;
    }

}
