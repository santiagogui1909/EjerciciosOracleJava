package ejercicicosPracticas;
import java.util.Scanner;

public class EjercicioIf {


        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("ingrese un valor: ");
            int N = entrada.nextInt();

            if (N % 2 == 0) {
                System.out.println("Not Weird");

            } else {
                    System.out.println("Weird");
                }
            }

        }




// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
// if (N%2!=0) {
//                System.out.println("Weird");
//
//            }else if(N > 2 && N < 5){
//                //if (N%2==0) {
//                System.out.println("Not Weird");
//
//            } else if(N > 6 && N < 20){
//                System.out.println("Weird");
//
//            } else if (N>20){
//                System.out.println("Not Weird");
//            }
//
//        }