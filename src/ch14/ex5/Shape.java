package ch14.ex5;

public class Shape {
    private boolean flag = false;
    void rotate(){
        if(this instanceof Circle){
            System.out.println("Круг нет смысла поворачивать");
        }else {
            System.out.println("Rotate");
        }
    }
    void flag(){
        flag = ! flag;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Флаг = " + flag;
    }
}
