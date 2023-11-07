package galasso.java.dev.estudos;
import java.util.Scanner;

public class Game {
    public char startChar,gameChar;


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

    public static String winCondition(){
        return " ";
    }


    public void setStartChar(char startChar) {
        this.startChar = startChar;
    }

    public char getStartChar() {
        return startChar;
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


