package ch18.ex17;

import net.mindview.util.TextFile;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();

        String s = TextFile.read("src/ch18/ex17/file.txt");

        for(char c : s.toCharArray()){
            Integer temp = map.get(c);
            if(temp == null){
                map.put(c,1);
            }else {
                map.put(c,++temp);
            }

        }
        Set keys = map.keySet();
        for(Object c:keys) {
            Character q = (Character) c;
            System.out.println(q + " : " + map.get(c));
        }

    }
}
