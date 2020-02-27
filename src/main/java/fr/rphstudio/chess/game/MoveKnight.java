package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class MoveKnight implements IMove {
    @Override
    public List<IChess.ChessPosition> getPossibleMove(Board board, IChess.ChessPosition position) {

        List<IChess.ChessPosition> list = new ArrayList<>();
        IChess.ChessPosition nextPosition = null;

/**
 *  |||  |||  |||
 *  |||  |||  |||
 *  |||  |||  |||
 *  |||  |||  |||
 *  |||  |||  |||
 *    |||||||||
 */
        /**
         * TOP
         */
        nextPosition = new IChess.ChessPosition(position.x - 1, position.y - 2);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_WHITE && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_BLACK) {
                list.add(nextPosition);
            }
        }

        nextPosition = new IChess.ChessPosition(position.x + 1, position.y - 2);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_WHITE && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_BLACK) {
                list.add(nextPosition);
            }
        }

        /**
         * BOT
         */
        nextPosition = new IChess.ChessPosition(position.x - 1, position.y + 2);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_WHITE && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_BLACK) {
                list.add(nextPosition);
            }
        }

        nextPosition = new IChess.ChessPosition(position.x + 1, position.y + 2);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_WHITE && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_BLACK) {
                list.add(nextPosition);
            }
        }

        /**
         * LEFT
         */
        nextPosition = new IChess.ChessPosition(position.x - 2, position.y - 1);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_WHITE && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_BLACK) {
                list.add(nextPosition);
            }
        }

        nextPosition = new IChess.ChessPosition(position.x - 2, position.y + 1);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_WHITE && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_BLACK) {
                list.add(nextPosition);
            }
        }

        /**
         * RIGHT
         */
        nextPosition = new IChess.ChessPosition(position.x + 2, position.y - 1);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_WHITE && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_BLACK) {
                list.add(nextPosition);
            }
        }

        nextPosition = new IChess.ChessPosition(position.x + 2, position.y + 1);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_WHITE && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_BLACK) {
                list.add(nextPosition);
            }
        }

        /**
         *  |||||||||
         *  |||    |||
         *  |||    |||
         *  ||||||||
         *  |||    |||
         *  ∫∫∫    |||
         *  ∫∫∫∫∫∫∫∫∫
         */
        nextPosition = new IChess.ChessPosition(position.x - 1, position.y - 2);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_BLACK && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_WHITE) {
                list.add(nextPosition);
            }
        }

        nextPosition = new IChess.ChessPosition(position.x + 1, position.y - 2);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_BLACK && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_WHITE) {
                list.add(nextPosition);
            }
        }

        /**
         * BOT
         */
        nextPosition = new IChess.ChessPosition(position.x - 1, position.y + 2);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_BLACK && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_WHITE) {
                list.add(nextPosition);
            }
        }

        nextPosition = new IChess.ChessPosition(position.x + 1, position.y + 2);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_BLACK && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_WHITE) {
                list.add(nextPosition);
            }
        }

        /**
         * LEFT
         */
        nextPosition = new IChess.ChessPosition(position.x - 2, position.y - 1);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_BLACK && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_WHITE) {
                list.add(nextPosition);
            }
        }

        nextPosition = new IChess.ChessPosition(position.x - 2, position.y + 1);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_BLACK && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_WHITE) {
                list.add(nextPosition);
            }
        }

        /**
         * RIGHT
         */
        nextPosition = new IChess.ChessPosition(position.x + 2, position.y - 1);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_BLACK && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_WHITE) {
                list.add(nextPosition);
            }
        }

        nextPosition = new IChess.ChessPosition(position.x + 2, position.y + 1);
        if ( board.getPiece(position).getColor() == IChess.ChessColor.CLR_BLACK && (nextPosition.x >= 0 && nextPosition.y >= 0) && (nextPosition.x <= 7 && nextPosition.y <= 7) ) {
            if (board.getPiece(nextPosition) == null || board.getPiece(nextPosition).getColor() == IChess.ChessColor.CLR_WHITE) {
                list.add(nextPosition);
            }
        }

        return list;
    }
}
