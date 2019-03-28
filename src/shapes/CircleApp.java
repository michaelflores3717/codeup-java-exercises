package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input(scanner);
        System.out.println("Input radius.");
        int radius = input.getInt();
        Circle circle = new Circle(radius);
        System.out.println(circle.getArea(circle.getRadius()));
        System.out.println(circle.getCircumference(circle.getRadius()));
    }

}
