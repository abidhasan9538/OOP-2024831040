import java.util.Scanner;

public class ballvolume {
    public static void main(String[] args){
        double pi = 3.1416;
        double radius;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the radius of the ball: ");
        radius = input.nextDouble();
        double ans = (4/3)*pi*radius*radius*radius;
        System.out.println("The volume of the ball is: " + ans);
        input.close();
    }
    
}
