package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class MovePawn implements IMove {

    /**
     * Return every possibilities of moves for every pawns
     * ATM WORKS FOR EVERYTHING, MUST BE CHANGED.
     * @param board
     * @param position
     * @return
     */
    @Override
    public List<IChess.ChessPosition> getPossibleMove(Board board, IChess.ChessPosition position) {

        List<IChess.ChessPosition> list = new ArrayList<>();
        IChess.ChessPosition nextPosition;

        /**
         * DEFAULT MOVEMENTS
         */
        nextPosition = new IChess.ChessPosition(position.x, position.y - 1);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_WHITE && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null) {
                list.add(nextPosition);

                /**
                 * CHARGE MOVEMENT
                 */
                nextPosition = new IChess.ChessPosition(position.x, position.y - 2);
                if (position.y == 6 && board.getPiece(position).getColor() == IChess.ChessColor.CLR_WHITE && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7)) {
                    if (board.getPiece(nextPosition) == null) {
                        list.add(nextPosition);
                    }
                }
            }
        }

        nextPosition = new IChess.ChessPosition(position.x, position.y + 1);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_BLACK && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null) {
                list.add(nextPosition);

                /**
                 * CHARGE MOVEMENT
                 */
                nextPosition = new IChess.ChessPosition(position.x, position.y + 2);
                if (position.y == 1 && board.getPiece(position).getColor() == IChess.ChessColor.CLR_BLACK && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7)) {
                    if (board.getPiece(nextPosition) == null) {
                        list.add(nextPosition);
                    }
                }

            }
        }


        /**
         * TAKING ANOTHER PIECE
         */
        nextPosition = new IChess.ChessPosition(position.x - 1, position.y - 1);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_WHITE && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) != null) {
                if (board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_BLACK) {
                    list.add(nextPosition);
                }
            }
        }

        nextPosition = new IChess.ChessPosition(position.x + 1, position.y - 1);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_WHITE && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) != null) {
                if (board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_BLACK) {
                    list.add(nextPosition);
                }
            }
        }

        nextPosition = new IChess.ChessPosition(position.x - 1, position.y + 1);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_BLACK && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) != null) {
                if (board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_WHITE) {
                    list.add(nextPosition);
                }
            }
        }

        nextPosition = new IChess.ChessPosition(position.x + 1, position.y + 1);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_BLACK && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) != null) {
                if (board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_WHITE) {
                    list.add(nextPosition);
                }
            }
        }

        return list;
    }

}
