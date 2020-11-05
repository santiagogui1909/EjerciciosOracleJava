package EjerciciosPdf1;

import java.util.Scanner;

public class LoopPractice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numInputs = 0;
        int sum = 0,input = 0;
        
        do {
            System.out.println("Enter a number");
            input = in.nextInt();
            sum += input;
            ++numInputs;
        } while(numInputs < 10);

        System.out.println("The sum of those ten numbers is: " + sum);
    }
}

