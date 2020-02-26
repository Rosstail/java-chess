package fr.rphstudio.chess.interf;

import fr.rphstudio.chess.game.Board;

import java.util.List;

public interface IMove {

    Board board = new Board();
    /**
     * ENUM th basic move
     */

    public List<IChess.ChessPosition> getPossibleMove(Board board, IChess.ChessPosition position);


}
