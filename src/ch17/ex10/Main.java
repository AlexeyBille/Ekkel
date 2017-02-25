package ch17.ex10;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> set = new SortedSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(10);
        set.add(9);

        for(int i:set){
            System.out.println(i);
        }

    }
}
