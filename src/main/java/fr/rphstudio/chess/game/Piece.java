package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.List;

public class Piece {
    /**
     * Attribute
     */
    private ChessModel.ChessType chessType;
    private ChessModel.ChessColor chessColor;
    private IMove move;

    /**
     * constructor
     * @param type
     * @param color
     */
    public Piece(IChess.ChessType type, IChess.ChessColor color) {
        this.chessType = type;
        this.chessColor = color;
        this.move = new MovePawn();
    }

    /**
     * Get the type of the piece
     * @return
     */
    public ChessModel.ChessType getType() {
        return this.chessType;
    }

    /**
     * Get the color of the piece
     * @return
     */
    public ChessModel.ChessColor getColor() {
        return this.chessColor;
    }

    public List<IChess.ChessPosition> getMovement(Board board, IChess.ChessPosition position) {
        return move.getPossibleMove(board, position);
    }
}
