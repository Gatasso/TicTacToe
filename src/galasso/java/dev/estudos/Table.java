package galasso.java.dev.estudos;

public class Table extends Game {

    //creates the constructor "Table" and set all the fields as void
    public Table() {
    }

    public static void startTable(Table[][] table) {
        Table.cleanTable();
        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 3; column++) {
                table[line][column] = new Table();
            }
        }
    }

    public static void refreshTable(Table[][] board) {
        System.out.println("     0       1        2");
        System.out.printf("0    %c   |   %c   |   %c%n", board[0][0].getGameChar(), board[0][1].getGameChar(), board[0][2].getGameChar());
        System.out.println("   ---------------------    ");
        System.out.printf("1    %c   |   %c   |   %c%n", board[1][0].getGameChar(), board[1][1].getGameChar(), board[1][2].getGameChar());
        System.out.println("   ---------------------    ");
        System.out.printf("2    %c   |   %c   |   %c%n", board[2][0].getGameChar(), board[2][1].getGameChar(), board[2][2].getGameChar());
    }

    public static void cleanTable() {
        for (int i = 0; i < 100; i++) {
            System.out.println(" ");
        }
    }
}

