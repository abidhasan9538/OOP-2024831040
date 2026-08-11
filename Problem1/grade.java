import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the obtained mark: ");
        n = input.nextInt();
        if(n>=90) {
            System.out.println("A+");
        }
        else if(n<90 && n>=80) {
            System.out.println("A");

        }
        else if(n<80 && n>=70) {
            System.out.println("A-");
        }
        else if(n<70 && n>=60){
            System.out.println("B");
        }
        else if(n<60 && n>=40){
            System.out.println("C+");

        }
        else {
            System.out.println("F");
        }
        input.close();
    }
}
