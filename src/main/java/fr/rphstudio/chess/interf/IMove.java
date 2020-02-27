package fr.rphstudio.chess.interf;

import fr.rphstudio.chess.game.Board;

import java.util.List;

public interface IMove {

    Board board = new Board();

    public List<IChess.ChessPosition> getPossibleMove(Board board, IChess.ChessPosition position);

    /**
     * Class used for chess piece positions.
     * It simply contains two public fields for X and Y coordinates.
     */
    public class ChessMoveNumber {
        /**
         * Integer that count the number of moves
         */
        public int nb;

        /**
         * Creates a default position object.
         * The default value is 0
         */
        public ChessMoveNumber() {
            this.nb = 0;
        }
    }
}
