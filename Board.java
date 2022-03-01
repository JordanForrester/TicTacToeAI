import java.awt.*;

public class Board { // Class for the gamespace

    private int[][] gameSpace;// 1 indicates the player 0 indicates the AI

    private JFrame view;

    Board() {
        gameSpace = new int[3][3];
    }

    public void playSpot(int x, int y, int symbl) {// Method to play a spot on the game board
        gameSpace[x][y] = symbl;

    }

    public String toString() {

        return 
    }
}