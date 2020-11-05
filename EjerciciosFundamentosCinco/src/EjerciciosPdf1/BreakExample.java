package EjerciciosPdf1;

import java.util.Scanner;

public class BreakExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numInputs = 10;
        int input = 0;
        int sum = 0;
        int stopLoop = 999;

        for(int i = 0; i < numInputs; ++i) {
            input = in.nextInt();
            if (input >= stopLoop) {
                break;
            }

            sum += input;
        }

        System.out.println("The sum of the numbers entered is: " + sum);
    }
}
