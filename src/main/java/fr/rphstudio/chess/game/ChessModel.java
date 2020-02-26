package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.EmptyCellException;
import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.OutOfBoardException;

import java.util.ArrayList;
import java.util.List;

public class ChessModel implements IChess {
    public static ChessModel instance = new ChessModel();
    private Board board;

    private ChessModel() {
        reinit();
    }

    public static ChessModel getInstance() {
        if (instance == null)
            instance = new ChessModel();

        return ChessModel.instance;
    }

    @Override
    public void reinit() {
        this.board = new Board();
    }

    @Override
    public ChessType getPieceType(ChessPosition p) throws EmptyCellException, OutOfBoardException {

        Piece type = board.getPiece(p);
        if (type != null) {
            return type.getType();
        }
        else {
            throw new EmptyCellException();
        }
    }

    @Override
    public ChessColor getPieceColor(ChessPosition p) throws EmptyCellException, OutOfBoardException {

        Piece color = board.getPiece(p);
        if (color != null) {
            return color.getColor();
        }
        else {
            throw new EmptyCellException();
        }
    }

    /**
     * Get the number of pieces with the specified color
     * @param color the requested color of the pieces to count.
     * @return
     */
    @Override
    public int getNbRemainingPieces(ChessColor color) {
        int count = board.countPieces(color);
        return count;
    }


    @Override
    public List<ChessPosition> getPieceMoves(ChessPosition p) {
        Piece piece = board.getPiece(p);
        if (piece != null) {
            return piece.getMovement(board, p);
        }
        return new ArrayList<>();
    }

    @Override
    public void movePiece(ChessPosition p0, ChessPosition p1) {

    }

    @Override
    public ChessKingState getKingState(ChessColor color) {
        return ChessKingState.KING_SAFE;
    }

    @Override
    public List<ChessType> getRemovedPieces(ChessColor color) {
        return new ArrayList<>();
    }

    @Override
    public boolean undoLastMove() {
        return false;
    }

    @Override
    public long getPlayerDuration(ChessColor color, boolean isPlaying) {
        return 0;
    }
}
