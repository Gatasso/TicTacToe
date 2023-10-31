import galasso.java.dev.estudos.Game;
import galasso.java.dev.estudos.Table;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Table[][] table = new Table[3][3];
        Game ticTacToe = new Game(true, 'X');
        while(ticTacToe.isMatch()){
            Table.refreshTable(table);

        }

    }
}