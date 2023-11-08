package galasso.java.dev.estudos;
import java.util.Scanner;

public class Game {
    public char startChar,gameChar, finalChar;


    public Game(){
        this.gameChar = ' ';
        this.startChar = 'x';
    }

    public static int[] play(Scanner scan, char nowSymbol){
        int[] coordsTable = new int[2];
        System.out.printf("Turn to play: %c%n",nowSymbol);
        System.out.print("Which line?");
        coordsTable[0]= scan.nextInt();
        System.out.print("Which column?");
        coordsTable[1]= scan.nextInt();
        return coordsTable;
    }

    public static boolean checkPlay(Table[][] board, int[] coordsTable, char nowSymbol) {
        if(board[coordsTable[0]][coordsTable[1]].getGameChar() == ' '){
            board[coordsTable[0]][coordsTable[1]].setGameChar(nowSymbol);
            return true;
        }else{
            System.out.println("Field already setted. Play in an empty field");
            return false;
        }
    }

    public static String winCondition(Table[][] board, char nowSymbol){
        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 3; column++) {
                if (board[line][0].getGameChar() == 'x' && board[line][1].getGameChar()== 'x' && board[line][2].getGameChar()== 'x'||
                    board[0][column].getGameChar() == 'x' && board[1][column].getGameChar()== 'x' && board[2][column].getGameChar()== 'x'||
                    board[0][0].getGameChar() == 'x' && board[1][1].getGameChar()== 'x' && board[2][2].getGameChar()== 'x'||
                    board[0][2].getGameChar() == 'x' && board[1][1].getGameChar()== 'x' && board[2][0].getGameChar()== 'x'){
                        return "x";
                }else
                if (board[line][0].getGameChar() == 'o' && board[line][1].getGameChar()== 'o' && board[line][2].getGameChar()== 'o'||
                    board[0][column].getGameChar() == 'o' && board[1][column].getGameChar()== 'o' && board[2][column].getGameChar()== 'o'||
                    board[0][0].getGameChar() == 'o' && board[1][1].getGameChar()== 'o' && board[2][2].getGameChar()== 'o'||
                    board[0][2].getGameChar() == 'o' && board[1][1].getGameChar()== 'o' && board[2][0].getGameChar()== 'o')
                        return "o";
            }
        } return " ";
    }

    public void setStartChar(char startChar) {
        this.startChar = startChar;
    }

    public char getStartChar() {
        return startChar;
    }

    public char getFinalChar() {
        return finalChar;
    }

    public void setFinalChar(char finalChar) {
        this.finalChar = finalChar;
    }

    public char getGameChar() {
        return this.gameChar;
    }

    public void setGameChar(char gameChar) {
        if(this.gameChar == ' ') this.gameChar = gameChar;
    }

    public boolean isMatch() {
        return true;
    }

}


