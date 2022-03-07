//import java.awt.*;
import javax.swing.*;
public class Board { // Class for the gamespace

    private int[][] gameSpace;// 1 indicates the player 0 indicates the AI

    private JFrame view;

    Board() {
        gameSpace = new int[3][3];
    }

    public void playSpot(int x, int y, int symbl) {// Method to play a spot on the game board
        if (gameSpace[x][y] == -1)
            gameSpace[x][y] = symbl;

    }

    private boolean checkWin(){

        
        return false;
    }

    public String toString() {

        return " ";
    }
}