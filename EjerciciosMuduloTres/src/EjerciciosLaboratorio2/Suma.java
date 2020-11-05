package EjerciciosLaboratorio2;

public class Suma {

    public static void main (String args []) {

        int total=0;  //inicializa el total

        //total de los enteros pares del 2 al 20
        for (int numero = 2; numero <= 10; numero += 2)

        total += numero;

        System.out.println("la suma es: " + total);
    }
}
