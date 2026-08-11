import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the two nubmers: ");
        int n1;
        n1 = input.nextInt();
        int n2;
        n2 = input.nextInt();
        System.out.println("Enter the operation sign: ");

        char c;
        c = input.next().charAt(0);

        if(c=='+'){
            System.out.println("Your answer is: " + (n1+n2));
        }
        else if(c=='-'){
            System.out.println("Your answer is: " + (n1-n2));
        }
        else if(c == '*') {
            System.out.println("Your answer is: " + (n1*n2));
        }
        else if(c == '/') {
            System.out.println("Your answer is: " + (n1/n2));
        }
        input.close();



    }
}
