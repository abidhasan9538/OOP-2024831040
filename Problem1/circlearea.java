import java.util.Scanner;

public class circlearea {
    public static void main(String[] args) {
        double pi = 3.1416;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");

        double radius;
        radius = input.nextDouble();
        double ans = pi*radius*radius;
        System.out.println("The area of the circle is: " + ans);
        input.close();
    }
}
