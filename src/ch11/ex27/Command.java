package ch11.ex27;

public class Command {
    String string = "";
    Command(String string){
        this.string = string;
    }
    public void opetaion(){
        System.out.println(string);
    }
}
