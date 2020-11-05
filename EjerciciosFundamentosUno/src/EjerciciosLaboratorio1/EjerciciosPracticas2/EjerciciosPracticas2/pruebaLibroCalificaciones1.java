package EjerciciosPracticas2;

import java.util.Scanner;

public class pruebaLibroCalificaciones1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        LibroCalificacion1 miLibroCalificaciones = new LibroCalificacion1();

        System.out.println("Escriba el nombre del curso");
        String nombreDelCurso = entrada.nextLine();
        System.out.println();

        miLibroCalificaciones.mostrarMensaje(nombreDelCurso);
    }
}
