package Inventarios;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MainInventario{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxsize = 0;
        String texto;

        System.out.println("Ingrese la cantidad de productos que le gustaría agregar " +
                "\n Ingrese 0 (cero) si no desea agregar productos: ");

        do {
            try {
                texto = sc.nextLine();
                maxsize = Integer.parseInt(texto);

                if (maxsize < 0) {
                    System.out.println(" numero no valido, introduce otro valor");
                }

            } catch (NumberFormatException e) {
                System.out.println("No es un valor numerico " + e);
            }

        } while (maxsize < 0);


        String[] array = new String[maxsize];

        if (maxsize == 0) {
            System.out.println("no se requieren productos");

        } else {

            for (int i = 0; i < array.length; i++) {

                System.out.println("Ingrese la cantidad");
                array[i] = sc.nextLine();

                System.out.println("Ingrese el precio");
                array[i] = String.valueOf(sc.nextDouble());

                System.out.println("Ingrese el numero del producto");
                array[i] = String.valueOf(sc.nextDouble());
            }
        }

        int j=0;

        while( j <= maxsize){
            System.out.println(""+ array[j]);
            j++;
        }
    }
}


            /*for (int i = 0; i <= maxsize; i++) {

                System.out.println("Ingrese la cantidad");
                cantidad = sc.nextInt();
                inventario[i] = cantidad;

                System.out.println("Ingrese el precio");
                precio = sc.nextDouble();
                inventario[i] = (int) precio;

                System.out.println("Ingrese el numero del producto");
                numeroElemento = sc.nextDouble();
                inventario[i] = (int) numeroElemento;
            }

            for  (int x=0; x<inventario.length; x++)
                System.out.println(inventario);*/