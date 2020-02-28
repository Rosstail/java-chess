package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class MoveRook implements IMove {
    @Override
    public List<IChess.ChessPosition> getPossibleMove(Board board, IChess.ChessPosition position) {

        List<IChess.ChessPosition> list = new ArrayList<>();
        IChess.ChessPosition nextPosition = null;


        /**
         * Return every possibilities of moves for every rooks
         * ATM WORKS FOR EVERYTHING, MUST BE CHANGED.
         * @param board
         * @param position
         * @return
         */
        /**
         * PREPARE THE MOVES FOR WHITE
         */
        if (board.getPiece(position).getColor() == IChess.ChessColor.CLR_WHITE) {

            nextPosition = new IChess.ChessPosition(position.x, position.y + 1);

            while (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7
                    && board.getPiece(nextPosition) == null) {
                list.add(nextPosition);
                nextPosition = new IChess.ChessPosition(nextPosition.x, nextPosition.y + 1);
            }
            if (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7) {
                if (board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_BLACK) {
                    list.add(nextPosition);
                }
            }

            nextPosition = new IChess.ChessPosition(position.x - 1, position.y);

            while (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7
                    && board.getPiece(nextPosition) == null) {
                list.add(nextPosition);
                nextPosition = new IChess.ChessPosition(nextPosition.x - 1, nextPosition.y);
            }
            if (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7) {
                if (board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_BLACK) {
                    list.add(nextPosition);
                }
            }

            nextPosition = new IChess.ChessPosition(position.x + 1, position.y);

            while (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7
                    && board.getPiece(nextPosition) == null) {
                list.add(nextPosition);
                nextPosition = new IChess.ChessPosition(nextPosition.x + 1, nextPosition.y);
            }
            if (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7) {
                if (board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_BLACK) {
                    list.add(nextPosition);
                }
            }

            nextPosition = new IChess.ChessPosition(position.x, position.y - 1);

            while (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7
                    && board.getPiece(nextPosition) == null) {
                list.add(nextPosition);
                nextPosition = new IChess.ChessPosition(nextPosition.x, nextPosition.y - 1);
            }
            if (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7) {
                if (board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_BLACK) {
                    list.add(nextPosition);
                }
            }

        }

        /**
         * PREPARE THE MOVES FOR NIGGAS
         */
        if (board.getPiece(position).getColor() == IChess.ChessColor.CLR_BLACK) {

            nextPosition = new IChess.ChessPosition(position.x, position.y + 1);

            while (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7
                    && board.getPiece(nextPosition) == null) {
                list.add(nextPosition);
                nextPosition = new IChess.ChessPosition(nextPosition.x, nextPosition.y + 1);
            }
            if (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7) {
                if (board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_WHITE) {
                    list.add(nextPosition);
                }
            }

            nextPosition = new IChess.ChessPosition(position.x - 1, position.y);

            while (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7
                    && board.getPiece(nextPosition) == null) {
                list.add(nextPosition);
                nextPosition = new IChess.ChessPosition(nextPosition.x - 1, nextPosition.y);
            }
            if (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7) {
                if (board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_WHITE) {
                    list.add(nextPosition);
                }
            }

            nextPosition = new IChess.ChessPosition(position.x + 1, position.y);

            while (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7
                    && board.getPiece(nextPosition) == null) {
                list.add(nextPosition);
                nextPosition = new IChess.ChessPosition(nextPosition.x + 1, nextPosition.y);
            }
            if (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7) {
                if (board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_WHITE) {
                    list.add(nextPosition);
                }
            }

            nextPosition = new IChess.ChessPosition(position.x, position.y - 1);

            while (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7
                    && board.getPiece(nextPosition) == null) {
                list.add(nextPosition);
                nextPosition = new IChess.ChessPosition(nextPosition.x, nextPosition.y - 1);
            }
            if (nextPosition.x >= 0 && nextPosition.y >= 0 && nextPosition.x <= 7 && nextPosition.y <= 7) {
                if (board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_WHITE) {
                    list.add(nextPosition);
                }
            }

        }

        return list;
    }
}
