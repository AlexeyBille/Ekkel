package ch12.ex4;

public class ExceptionImpl extends Exception {
    String string = "";
    public ExceptionImpl(){}
    ExceptionImpl(String string){
        this.string = string;
    }
    void print(){
        System.err.println(string);
    }
}
