import java.util.Scanner;
class trianglearea {
    public static void main(String[] args){
        double base, height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base and height: ");
        base = input.nextDouble();
        height = input.nextDouble();
        double ans = base*height;
        System.out.println("The area of the triangle is: " + ans);
        input.close();

    }
}