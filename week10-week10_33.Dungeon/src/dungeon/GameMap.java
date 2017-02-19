package dungeon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark Cunanan on 2/17/2017.
 */
public class GameMap {
    private List<List<String>> array;
    public GameMap(){
        this.array = new ArrayList<>();
    }

    public void createMap(int height, int length){
        for (int i = 0; i < length; i++){
            //add row
            List<String> list = new ArrayList<>();
            array.add(list);
            for (int j = 0; j < height; j++){
                //add column
                list.add(".");
            }
        }

    }

    public void displayMap(){
        for (List i : array){
            System.out.println(i.toString().replace("[","").replace("]","").replace(",", "") );
        }
    }

    public void setVampMoves(int x, int y){
        array.get(x).set(y, "v");
    }

    public void setPlayMoves(int x, int y){
        array.get(x).set(y, "@");
    }
    public void removePlayMove(int x, int y){
        array.get(x).set(y, ".");
    }




}
