package EjerciciosPdf1;

import java.util.Scanner;

public class ContinueExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numInputs = 10;
        int input = 0;

        for(int i = 0; i < numInputs; ++i) {
            input = in.nextInt();
            if (input % 2 == 0) {
                continue;
            }
            System.out.println("That number was odd " + input);
        }
    }
}


