package EjerciciosPdfPracticas;

import java.util.Scanner;

public class MensajeCodificado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        String uno = "D";
        String dos = "W";
        String tres = "E";
        String cuatro = "L";
        String cinco = "H";
        String seis = "O";
        String siete = "R";
        String mensaje = new String();

        System.out.println("Decifremos el mensaje"
                + "\n ingresa 10 numeros de 1-10");

        while (true) {

            for (int i = 0; i <= 10; ++i) {

                numero = entrada.nextInt();

                switch (numero) {
                    case 1:
                        mensaje += uno;
                        continue;
                    case 2:
                        mensaje += dos;
                        continue;
                    case 3:
                        mensaje += tres;
                        continue;
                    case 4:
                        mensaje += cuatro;
                        continue;
                    case 5:
                        mensaje += cinco;
                        continue;
                    case 6:
                        mensaje += seis;
                        continue;
                    case 7:
                        mensaje += siete;
                        continue;

                    default:
                        System.out.println("Numero invalido");
                        break;
                }
            }
            System.out.println(mensaje);
        }
    }
}

