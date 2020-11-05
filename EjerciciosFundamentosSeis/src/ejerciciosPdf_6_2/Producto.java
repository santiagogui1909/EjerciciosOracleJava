package ejerciciosPdf_6_2;
//este programa esta desiñado para calcular el producto de 3 numeros

import jdk.nashorn.internal.objects.NativeUint8Array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Producto {

    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);

        int x;
        int y;
        int z;
        int numero = 0;
        int resultado = 0;

        System.out.println("ingrese el primer entero");
        x = entrada.nextInt();

        System.out.println("ingrese el segundo entero");
        y = entrada.nextInt();

        System.out.println("ingrese el tercer entero");
        z = entrada.nextInt();

        resultado = x * y * z;


        do {
            try {
                System.out.println("Ingrese un numero entero > 0: ");
                numero = entrada.nextInt();

                System.out.println("Numero introducido: " + numero);

            }catch (InputMismatchException e){
                entrada.nextLine();
                numero = 0;

                System.out.println("Debe introducir un numero entero " + e.toString());
            }
        }while (numero <= 0);

        if (x > y || y < z) {
            System.out.println("todos los numeros son iguales");
        } else {
            System.out.println("ninguno de los numeros son iguales");
        }

        System.out.println("El resultado es: " +  resultado);

    }
}
