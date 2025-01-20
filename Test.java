package LPU_java;
import java.util.Scanner;

abstract class shape{
    public abstract void draw();
}
 class Circle extends shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Test {
    public static void main(String[] args) {
        shape circle= new Circle();
        shape rectangle=new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}
