package ejerciciosCapituloDos;

import javax.swing.*;
import java.util.Scanner;

public class EjercicioMostrarMensajes {

    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("escriba un entero: ");
        b = entrada.nextInt();

        System.out.println("escriba un entero: ");
        c = entrada.nextInt();

        a = b * c;

        System.out.println("el resultado es: " + a);

        JOptionPane.showMessageDialog(null,"este programa realizara un calculo de nomina");





    }
}
