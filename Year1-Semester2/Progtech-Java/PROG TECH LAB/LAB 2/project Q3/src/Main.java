import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Point A: ");
        double pointAX = input.nextDouble();
        double pointAY = input.nextDouble();
        Point pointA = new Point(pointAX, pointAY);

        System.out.print("Point B: ");
        double pointBX = input.nextDouble();
        double pointBY = input.nextDouble();
        Point pointB = new Point(pointBX, pointBY);

        System.out.println("A = " + pointA + " B = " + pointB + " Distance = " + pointA.distance(pointB));

        System.out.print("Move the points: ");
        double moveX = input.nextDouble();
        double moveY = input.nextDouble();
        pointA.translate(moveX, moveY);
        pointB.translate(moveX, moveY);

        System.out.println("A = " + pointA + " B = " + pointB + " Distance = " + pointA.distance(pointB));

        if (pointA.equals(pointB)) {
            System.out.println("A and B are at the same position.");
        } else {
            System.out.println("A and B are not at the same position.");
        }
    }
}