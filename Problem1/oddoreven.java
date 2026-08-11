import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        n= input.nextInt();
        if(n%2 == 0) {
            System.out.println("it is an even number.");
        }
        else {
            System.out.println("it is an odd number.");
        }
        input.close();
    }
}
