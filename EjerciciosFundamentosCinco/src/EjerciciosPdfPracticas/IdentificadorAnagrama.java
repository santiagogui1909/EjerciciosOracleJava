package EjerciciosPdfPracticas;

import java.util.Scanner;

public class IdentificadorAnagrama {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String palabraUno;
        String palabraDos;

        System.out.println("ingresa una palabra para determinar si es del tipo anagrama");
        palabraUno = entrada.nextLine();

        System.out.println("ingresa la otra palabra a comparar");
        palabraDos = entrada.nextLine();


        if (palabraUno.length() == palabraDos.length()) {

            for(int i = 0; i < palabraUno.length(); i++) {

                if (palabraDos.contains(String.valueOf(palabraUno.charAt(i)))) {
                    System.out.println("es un anagrama");
                    return;
                }
            }

        } else {

            System.out.println("No es un anagrama");
        }
    }
}