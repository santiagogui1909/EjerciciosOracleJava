package EjerciciosPracticas3;

import java.util.Scanner;

public class pruebaLibroCalificaciones3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        libroCalificaciones3 miLibroCalificaciones = new libroCalificaciones3();

        System.out.println("El nombre inicial del curso es: " + miLibroCalificaciones.obtenerNombreDelCurso());

        System.out.println("Escriab el nombre del curso: ");
        String elNombre = entrada.nextLine();

        miLibroCalificaciones.establecerNombreDelCurso(elNombre);
        System.out.println();

        miLibroCalificaciones.mostrarMensaje();

    }
}


