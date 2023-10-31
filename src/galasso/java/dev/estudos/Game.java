package galasso.java.dev.estudos;

public class Game {
    protected boolean match;
    protected char startChar;
    protected char userSimbol; //defines the char to use "X"or"O"

    public Game(boolean match,char startChar) {
    }

    public boolean checkPlay(Table[][] board, int p[],char nowSimbol) {
        if(board [p[0]] [p[1]].getUserSimbol() == ' '){
            board [p[0]] [p[1]].setUserSimbol(nowSimbol);
            return true;
        }else{
            return false;
        }
    }

    /*public static String winCondition(){
        if(Table.bo

        }
    }*/


    public boolean isMatch() {
        return match;
    }

    public char getStartChar() {
        return startChar;
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

