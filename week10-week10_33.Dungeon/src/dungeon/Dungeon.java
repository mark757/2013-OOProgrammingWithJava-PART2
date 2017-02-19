package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mark Cunanan on 2/15/2017.
 */
public class Dungeon {
    int x = 0;
    int y = 0;
    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampireMoves;
    private Scanner reader = new Scanner(System.in);
    private Random r = new Random();
    private List<PlayerPoint> listOfPlayerMoves = new ArrayList<>();
    private List<VampirePoint> listOfVampMoves = new ArrayList<>();
    private GameMap gameMap = new GameMap();

    private Point point = new Point(x,y);
    private List<Point> move = new ArrayList<>();

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampireMoves = vampiresMove;

    }

    public void run() {
            display();
            String command = reader.nextLine();
            if (command.equals("s")) {
                action();
                setNewPlayerMove(x + 1, y);
                gameMap.displayMap();

            } else if (command.equals("d")) {
                action();
                setNewPlayerMove(x, y + 1);
                gameMap.displayMap();
            }

       command = reader.nextLine();
    }
    public void display(){
        System.out.println(getMoves());
        printList();
        System.out.println("type in command");

    }
    public void action(){
        gameMap.removePlayMove(x, y);
        printPlayerMoves();
        printVampMoves();
    }

    public int getMoves() {
        return moves;
    }

    public void printList() {
        createPoint();
        System.out.println();
        addPlayer(x, y);
        addVampires();
        printPlayerMoves();
        printVampMoves();
        System.out.println();
        gameMap.createMap(height + 1, length + 1);
        setInitialPlayMoves();
        setInitialVampireMoves();
        gameMap.displayMap();
    }

    public void setInitialVampireMoves() {
        for (VampirePoint p : listOfVampMoves) {
            gameMap.setVampMoves(p.x(), p.y());
        }
    }

    public void setInitialPlayMoves() {
        for (PlayerPoint p : listOfPlayerMoves) {
            gameMap.setPlayMoves(p.x(), p.y());
        }
    }

    public void setNewPlayerMove(int x, int y) {
        gameMap.setPlayMoves(x, y);
    }

    public void addNewPlayerMove(int x, int y) {
        listOfPlayerMoves.add(new PlayerPoint(x, y, "@"));
    }

    public void addPlayer(int x, int y) {
        listOfPlayerMoves.add(new PlayerPoint(0, 0, "@"));
    }

    public void addVampires() {
        for (int i = 0; i < vampires; i++) {
            listOfVampMoves.add(new VampirePoint(createXCoordinate(), createYCoordiante(), "v"));
        }
    }

    public void printPlayerMoves() {
        for (Point point : listOfPlayerMoves) {
            System.out.println(point);
        }

    }

    public void printVampMoves() {
        for (Point point : listOfVampMoves) {
            System.out.println(point);

        }

    }


    public int createXCoordinate() {
        int randX = r.nextInt((length - 0) + 1) + 0;
        return randX;
    }

    public int createYCoordiante() {
        int randY = r.nextInt((height - 0) + 1) + 0;
        return randY;
    }

    public void createPoint(){
        PlayerPoint p = new PlayerPoint(x,y,"@");
        for (int i = 0; i < vampires; i++) {
            VampirePoint v = new VampirePoint(createXCoordinate(), createYCoordiante(), "v");
            move.add(v);
        }

        System.out.println(point.location());
        point.move(5,1);
        System.out.println(point.location());
        move.add(point);

        point.move(3,1);
        System.out.println(move);
        move.add(p);
        System.out.println(move);
        p.move(3,9);
        for (Point e : move){
            System.out.println(e);
        }
       // System.out.println(v);
    }




}
