import java.util.Scanner;
public class CircleMain {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    Circle c = new Circle();
    System.out.print("Enter radius: ");
    double r = input.nextDouble();
    c.setRadius(r);
    System.out.println("Radius: " + c.getRadius());
    System.out.println("Area of Circle: " + c.computeArea());
    }
}
