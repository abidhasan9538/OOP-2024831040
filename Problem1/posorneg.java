import java.util.Scanner;


public class posorneg {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        n = input.nextInt();
        if(n<0) {
            System.out.println("it is a negative number.");
        }
        else {
            System.out.println("it is a positive number.");
        }
        input.close();
    }
}
