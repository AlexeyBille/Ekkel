package ch11.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Gerbil {
    int gerbilNumver;
    public Gerbil(int gerbilNumver){
        this.gerbilNumver = gerbilNumver;
    }
    public void hop(){
        System.out.println(gerbilNumver + " message");
    }
    public String toString(){
        return this.getClass().getName() + " number " + gerbilNumver ;
    }


    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilList = new ArrayList<>();
        Random rnd = new Random();
        for(int i = 0; i < 10;i++){
            gerbilList.add(new Gerbil(rnd.nextInt()));
        }
        Iterator<Gerbil> gerbilIterator = gerbilList.iterator();
        while (gerbilIterator.hasNext()){
            Gerbil temp = gerbilIterator.next();
            temp.hop();
        }
    }
}
