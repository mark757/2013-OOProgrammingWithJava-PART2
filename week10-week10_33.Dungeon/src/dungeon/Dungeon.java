package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mark Cunanan on 2/15/2017.
 */
public class Dungeon {
    int x ;
    int y ;
    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampireMoves;
    private Scanner reader = new Scanner(System.in);
    private Random r = new Random();


    private List<Point> moveList = new ArrayList<>();

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampireMoves = true;
    }

    public void run() {
        GameMap gameMap = new GameMap(length, height);
        gameMap.createMap(length, height);
        gameMap.printMap();
      /*  gameMap.createMap(height + 1, length + 1); //generate map
        PlayerPoint p = new PlayerPoint(x, y, "@");
        moveList.add(p);
        gameMap.setLocation(p, "@");

        String buffer = "";

        display();
        int counter = 0;

        String command = reader.nextLine();
        buffer += command;

        while (true) {


            if (command.contains("s")) {
                counter = 0;

                for (int i = 0; i < command.length(); i++) {
                    if (buffer.charAt(i) == 's') {
                        counter++;
                    }
                }

                p.move(2, 3);
                System.out.println(p.location());
                //move character down

                gameMap.moveDown(p, counter);
                System.out.println(moveList);

            }

            if (command.contains("d")) {
                counter = 0;

                for (int i = 0; i < command.length(); i++) {
                    if (buffer.charAt(i) == 'd') {
                        counter++;
                    }
                }
                gameMap.moveRight(p, counter);
            }


            gameMap.displayMap();

            command = reader.nextLine();
        }
*/
    }

    public void display() {

        System.out.println(getMoves()); //print current moves
        createPoint(); //create initial points
        displayList(); // display list of initial points
        //gameMap.displayMap(length,height); //display the map
    }

    public int getMoves() {
        return moves;
    }

    public int createXCoordinate() {
        int randX = r.nextInt((length - 0) + 1) + 0;
        return randX;
    }

    public int createYCoordiante() {
        int randY = r.nextInt((height - 0) + 1) + 0;
        return randY;
    }

    public void createPoint() {

        for (int i = 0; i < vampires; i++) {
            VampirePoint v = new VampirePoint(createXCoordinate(), createYCoordiante(), "v");
           // gameMap.setLocation(v, "v");
            moveList.add(v);
        }
    }

    public void displayList() {
        for (Point e : moveList) {
            System.out.println(e);
        }
    }


}
