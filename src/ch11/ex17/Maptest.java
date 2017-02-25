package ch11.ex17;
import ch11.ex1.*;

import java.util.HashMap;
import java.util.Random;

public class Maptest {
    public static void main(String[] args) {
        HashMap<String,Gerbil> map = new HashMap<>();
        Random rnd = new Random();
        for(int i = 0; i < 20; i++){
            Integer tempInt = rnd.nextInt(30);
            Gerbil temp = new Gerbil(tempInt);
            map.put(temp.toString(),temp);
        }
        for(String key:map.keySet()){
            System.out.print(key + " : ");
            map.get(key).hop();
        }
    }
}
