package EjerciciosLaboratorio2;

public class PruebaDoWhile {

    public static void main (String args[]) {

        int contador = 1; // inicializa el contador

        do {
            System.out.println(contador);
            ++contador;
        } while (contador <= 10); //fin de do...while

        System.out.println(); // imprime una nueva linea
    }
}
