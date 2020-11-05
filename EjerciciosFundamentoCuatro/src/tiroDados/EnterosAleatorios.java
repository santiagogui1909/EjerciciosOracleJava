package tiroDados;

import java.util.Random;

public class EnterosAleatorios {

    public static void main (String [] args) {

        Random numerosAleatorios = new Random(); //genera numeros aleatorios
        int cara; // almacena cada entero aleatorio

        //itera 20 times
        for (int contador = 1; contador <= 20; contador++) {

            cara = 1 + numerosAleatorios.nextInt (6);

            System.out.println("lado " + cara); //muestra el valor generado

            //si contador es divisible entre 5, empieza una nueva linea de salida
            if (contador % 5 == 0)
                System.out.println();
        }
    }
}
