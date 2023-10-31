package galasso.java.dev.estudos;

public class Table {
    protected char userSimbol; //defines the char to use "X"or"O"

    //creates the constructor "Table" and set all the fields as void
    public Table(){
        this.userSimbol = ' ';
    }

    public static void refreshTable(Table[][] board){
        System.out.println("    0       1       2");
        System.out.printf("0    %c   |   %c   |   %c", board[0][1].getUserSimbol(),board[0][1].getUserSimbol(),board[0][2].getUserSimbol());
        System.out.println("-----------------------------");
        System.out.printf("1    %c   |   %c   |   %c", board[1][1].getUserSimbol(),board[1][1].getUserSimbol(),board[1][2].getUserSimbol());
        System.out.println("-----------------------------");
        System.out.printf("2    %c   |   %c   |   %c", board[2][1].getUserSimbol(),board[2][1].getUserSimbol(),board[2][2].getUserSimbol());
    }

    public static void cleanTable(){
        for (int i = 0; i < 200; i++) {
            System.out.println(" ");
        }
    }
//getters & setters
    public char getUserSimbol() {
        return userSimbol;
    }

    public void setUserSimbol(char userSimbol) {
        if(this.userSimbol == ' ') this.userSimbol = userSimbol;
        else System.out.println("Field already setted. Play in an empty field");
            }
}
