package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

public class Board {

    private Piece[][] piece = new Piece[8][8];

    /**
     * Return the position of the selected piece.
     * MUST BE FIXED: CLICK OUT THE BOARD MAKE A CRACH BECAUSE OoB EXCEPTIONS
     * @param p
     * @return
     */
    public Piece getPiece(IChess.ChessPosition p) {
        if ( (p.x >= 0 && p.y >= 0) && (p.x <= 7 && p.y <= 7) ) {
            return piece[p.x][p.y];
        }
        return null;
    }

    /**
     * Return the position of the selected piece.
     * MUST BE FIXED: CLICK OUT THE BOARD MAKE A CRACH BECAUSE OoB EXCEPTIONS
     * @param x
     * @param y
     * @return
     */
    public Piece getPiece(int x, int y) {
        if (x >= 0 && y >= 0 && x <= 7 && y <= 7) {
            return piece[x][y];
        }
        return null;
    }

    /**
     * Set the all the pieces on the board before the start of the game
     */
    public Board(){
        IChess.ChessType type;
        IChess.ChessColor color;

        /**
         * J represents the LINES
         */
        for (int j = 0; j <= 7; j++) {
            /**
             * Determine the color depending of the LINE
             */
            if (j <= 3) {
                color = IChess.ChessColor.CLR_BLACK;
            }
            else {
                color = IChess.ChessColor.CLR_WHITE;
            }
            /**
             * I represents the COLUMNS
             */
            for (int i = 0; i <= 7; i++)
            {
                /**
                 * SET the TYPE as PAWN if the unit are in the nearest LINES of their enemies
                 */
                if (j == 1 || j == 6 ) {
                    type = IChess.ChessType.TYP_PAWN;
                    piece[i][j] = new Piece(type, color);
                }
                /**
                 * SET the TYPE of the graded pieces depending of the COLUMN if they are on the extrem LINES
                 */
                else if (j == 0 || j == 7) {
                    if (i == 0 || i == 7)
                        type = IChess.ChessType.TYP_ROOK;
                    else if (i == 1 || i == 6)
                        type = IChess.ChessType.TYP_KNIGHT;
                    else if (i == 2 || i == 5)
                        type = IChess.ChessType.TYP_BISHOP;
                    else if (i == 3)
                        type = IChess.ChessType.TYP_QUEEN;
                    else
                        type = IChess.ChessType.TYP_KING;
                    piece[i][j] = new Piece(type, color);
                }
            }
        }
    }

    /**
     * Count the number of piecies for a specific color
     * @param color
     * @return
     */
    public int countPieces(IChess.ChessColor color) {
        int count = 0;
        Piece piece;
        /**
         * Checking every cases of the board
         */
        for (int j = 0; j <= 7; j++) {
            for (int i = 0; i <= 7; i++) {
                piece = getPiece(i, j);

                /**
                 * Avoid errors
                 */
                if (piece != null) {
                    if (piece.getColor() == color) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    /**
     * Move the selected piece to the destination clicked
     */
    public void doMovement(IChess.ChessPosition start, IChess.ChessPosition dest) {
        this.piece[dest.x][dest.y] = this.piece[start.x][start.y];
        this.piece[start.x][start.y] = null;


        /**
         * Check if piece is at the start/end of lines and is pawn to convert as a queen
         */
        if ((dest.y == 0 || dest.y == 7 ) && getPiece(dest).getType() == IChess.ChessType.TYP_PAWN) {
            IChess.ChessType type;
            IChess.ChessColor color;

            type = IChess.ChessType.TYP_QUEEN;
            color = getPiece(dest).getColor();
            piece[dest.x][dest.y] = new Piece(type, color);
        }
    }

}
