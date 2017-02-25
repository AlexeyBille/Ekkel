package ch18.ex19;

import net.mindview.util.BinaryFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Byte,Integer> map = new TreeMap<>();

        try {
            byte[] bytes = BinaryFile.read("src/ch18/ex19/file.txt");

            for(byte b:bytes) {
                Integer temp = map.get(b);
                if(temp == null) {
                    map.put(b,1);
                }else{
                    map.put(b,++temp);
                }
            }
            Set keys = map.keySet();

            for(Object k:keys) {
                System.out.println(k + " : " + map.get(k));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
