package dungeon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark Cunanan on 2/17/2017.
 */
public class GameMap {
   // private List<List<String>> array;
    private char board[][];
    private int height;
    private int length;

    public GameMap(int length, int height) {
       // this.array = new ArrayList<>();
        this.board = new char[length][height];
        this.height = height;
        this.length = length;
    }

    public void createMap(int height, int length) {
        for (int i = 0; i < length; i++) {
            //add row
            for (int j = 0; j < height; j++) {
                //add column
                board[i][j] = '.';
                board[0][0] = '@';
            }
        }

    }

    public void printMap(){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }




/*

    public void moveDown(PlayerPoint p, int numberOfMoves) {
        System.out.println(p);
        p.move(3, 2);

        System.out.println(p);
        //removePlayMove(p.x(),p.y());
        array.get(p.x()).set(p.y(), ".");
        array.get(p.x() + numberOfMoves).set(p.y(), "@");

    }


    public void moveRight(PlayerPoint p, int numberOfMoves) {
        System.out.println(p.x() + " " + p.y());
        // removePlayMove(p.x(),p.y());
        array.get(p.x()).set(p.y(), ".");
        array.get(p.x()).set(p.y() + numberOfMoves, "@");
    }

    public void setLocation(Point p, String s) {
        array.get(p.x()).set(p.y(), s);
    }

    public void displayMap() {
        for (List i : array) {
            System.out.println(i.toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", ""));
        }
    }

    public void removePlayMove(int x, int y) {
        array.get(x).set(y, ".");
    }

*/

}
