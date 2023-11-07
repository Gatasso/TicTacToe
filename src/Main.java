import galasso.java.dev.estudos.Game;
import galasso.java.dev.estudos.Table;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Table[][] table = new Table[3][3];
        Game ticTacToe = new Game();
        Table.startTable(table);
        while(ticTacToe.isMatch()){
            Table.refreshTable(table);
            //Game.winCondition(table);
            if(!Game.winCondition().equals(" ")){
                System.out.println("Jogador %s venceu");
                break;
            }
            try{
                if(Game.checkPlay(table, Game.play(scan, ticTacToe.getStartChar()), ticTacToe.getStartChar()))
                    if (ticTacToe.getStartChar() == 'x') {
                        ticTacToe.setStartChar('o');
                    } else ticTacToe.setStartChar('x');
            }catch(Exception e){
                System.out.println("ERRO");
            }
        }
        System.out.println("Fim do jogo");
    }
}