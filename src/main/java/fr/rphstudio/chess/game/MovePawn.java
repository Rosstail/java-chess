package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class MovePawn implements IMove {

    @Override
    public List<IChess.ChessPosition> getPossibleMove(Board board, IChess.ChessPosition position) {

        List<IChess.ChessPosition> list = new ArrayList<>();
        IChess.ChessPosition nextPosition;

        nextPosition = new IChess.ChessPosition(position.x, position.y - 1);
        list.add(nextPosition);
        nextPosition = new IChess.ChessPosition(position.x, position.y + 1);
        list.add(nextPosition);

        return list;
    }

}
