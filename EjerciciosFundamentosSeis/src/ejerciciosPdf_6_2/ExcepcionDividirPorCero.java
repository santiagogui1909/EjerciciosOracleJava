package ejerciciosPdf_6_2;

import java.util.Scanner;

public class ExcepcionDividirPorCero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        float division = 0;

        System.out.println("ingrese el primer entero");
        num1 = entrada.nextInt();

        System.out.println("ingrese el segundo entero");
        num2 = entrada.nextInt();

        try {
            division = num1 / num2;
        } catch (ArithmeticException e) {
            division = 0;
            System.out.println("No se puede dividir por 0 " + e.toString());
        }

        System.out.println("resultado de la division: " + division);

    }
}