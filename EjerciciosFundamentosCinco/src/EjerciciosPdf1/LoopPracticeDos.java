package EjerciciosPdf1;

import java.util.Scanner;

public class LoopPracticeDos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int repeat = 0;
        int sum=0;

        do {
            System.out.println("Enter a number");
            int input = in.nextInt();
            sum += input;
            System.out.println("Do you want to enter another number?");
            System.out.println("Enter 1 for yes or 2 for no: ");
            repeat = in.nextInt();
        } while(repeat == 1);

        System.out.println("The sum of the numbers is: " + sum);
    }
}
