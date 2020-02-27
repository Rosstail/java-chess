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
    //private ChessModel.ChessNumbMove chessNumbMove;
    private IMove move;

    /**
     * constructor
     * @param type
     * @param color
     */
    public Piece(IChess.ChessType type, IChess.ChessColor color) {
        this.chessType = type;
        this.chessColor = color;
        switch (type) {
            case TYP_KING: this.move = new MoveKing();
                            break;
            case TYP_QUEEN: this.move = new MoveQueen();
                            break;
            case TYP_BISHOP: this.move = new MoveBishop();
                break;
            case TYP_KNIGHT: this.move = new MoveKnight();
                break;
            case TYP_ROOK: this.move = new MoveRook();
                            break;
            default: this.move = new MovePawn();
                        break;
        }
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

    /**
     * Check the possible positions for a specified piece
     * @param board
     * @param position
     * @return
     */
    public List<IChess.ChessPosition> getMovement(Board board, IChess.ChessPosition position) {
        return move.getPossibleMove(board, position);
    }
}
