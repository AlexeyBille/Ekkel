package ch13.ex7;

public class Main {
    boolean test(String s){
        if(s.matches("[A-Z].+\\.")) return true;
        return false;

    }
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.test("Ssdhasudhasd."));
        System.out.println(m.test("Asdjfgjdgndnfg sdfn asd skajd ."));
        System.out.println(m.test("Asdjfgjdgndnfg sdfn asd skajd "));
        System.out.println(m.test("Asdjfgjdgndnfg sdfn asd skajd . "));
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
