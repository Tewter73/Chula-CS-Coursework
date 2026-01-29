import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First point : ");
        double firstX = input.nextDouble();
        double firstY = input.nextDouble();
        System.out.print("Second point : ");
        double secondX = input.nextDouble();
        double secondY = input.nextDouble();
        System.out.print("Third point : ");
        double thirdX = input.nextDouble();
        double thirdY = input.nextDouble();
        System.out.print("Fourth point : ");
        double fourthX = input.nextDouble();
        double fourthY = input.nextDouble();
        double centroidX = (firstX + secondX + thirdX + fourthX) / 4;
        double centroidY = (firstY + secondY + thirdY + fourthY) / 4;
        System.out.println("The centroid is ( " + centroidX + ", " + centroidY + " ).");
        double firstDistance = Math.sqrt((Math.pow((centroidX - firstX), 2)) + (Math.pow((centroidY - firstY), 2)));
        double secondDistance = Math.sqrt((Math.pow((centroidX - secondX), 2)) + (Math.pow((centroidY - secondY), 2)));
        double thirdDistance = Math.sqrt((Math.pow((centroidX - thirdX), 2)) + (Math.pow((centroidY - thirdY), 2)));
        double fourthDistance = Math.sqrt((Math.pow((centroidX - fourthX), 2)) + (Math.pow((centroidY - fourthY), 2)));
        double sumDistance = firstDistance + secondDistance + thirdDistance + fourthDistance;
        System.out.println("Sum of distance is " + sumDistance + ".");
        double minDistance = Math.min(Math.min(firstDistance,secondDistance),Math.min(thirdDistance,fourthDistance));
        System.out.println("Shortest distance is " + minDistance + ".");
        double maxDistance = Math.max(Math.max(firstDistance,secondDistance),Math.max(thirdDistance,fourthDistance));
        System.out.println("Longest distance is " + maxDistance + ".");
    }
}