package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

public class Board {

    public void defaultBoard(){
        int A;
        int B;

        for (int j = 0; j <= 7; j++) {
            if (j <= 3) {
                System.out.println("BLANC");
            }
            else {
                System.out.println("NOIR");
            }
            for (int i = 0; i <= 7; i++)
            {
                if (j == 1 || j == 6 ) {
                    System.out.println("TROUFION");
                    //CREER LA PIECE
                }
                else if (j == 0 || j == 7) {
                    if (i == 0 || i == 7)
                        System.out.println("TOUR");
                    else if (i == 1 || i == 6)
                        System.out.println("CAVALIER");
                    else if (i == 2 || i == 5)
                        System.out.println("FOU");
                    else if (i == 4)
                        System.out.println("REINE");
                    else
                        System.out.println("ROI");
                    //CREER LA PIECE
                }
            }
        }
    }
}
