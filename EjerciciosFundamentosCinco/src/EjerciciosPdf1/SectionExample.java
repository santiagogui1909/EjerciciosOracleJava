package EjerciciosPdf1;

import java.util.Scanner;

public class SectionExample {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            boolean quit = false;
            int num1 = 10;
            int num2 = 6;
            int answer = 0;

            do {
                System.out.println("Please enter a mathematical operand");
                String input = in.next();
                char operand = input.charAt(0);
                switch(operand) {
                    case '*':
                        System.out.println(num1 * num2);
                        break;
                    case '+':
                        System.out.println(num1 + num2);
                        break;
                    case '-':
                        System.out.println(num1 - num2);
                    case '/':
                        System.out.println(num1 / num2);
                    case ',':
                    case '.':
                    default:
                        System.out.println("Invalid input");
                }

                System.out.println("Quit? Y/N");
                if (in.next().equalsIgnoreCase("Y")) {
                    quit = true;
                }
            } while(!quit);

        }
    }
