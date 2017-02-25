package ch14.ex5;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Triangle();
        shape.rotate();
        shape = new Rectangle();
        shape.rotate();
        shape = new Circle();
        shape.rotate();

        Shape shape1 = new Circle();
        System.out.println(shape1);
        shape1.flag();
        System.out.println(shape1);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle.flag();
        System.out.println(rectangle);


    }
}
