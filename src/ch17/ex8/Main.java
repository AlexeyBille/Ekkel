package ch17.ex8;

public class Main {

    public static void main(String[] args) {
        SList<Integer> sList = new SList<>();

        SListIterator iterator = sList.iterator();

        iterator.add(1);
        System.out.println(sList);
        iterator.add(2);
        System.out.println(sList);
        iterator.add(3);
        System.out.println(sList);
        iterator.add(4);
        System.out.println(sList);
        iterator.add(5);
        System.out.println(sList);
        iterator.add(6);
        System.out.println(sList);




    }
}
