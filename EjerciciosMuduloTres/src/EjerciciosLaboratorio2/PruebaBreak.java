package EjerciciosLaboratorio2;

public class PruebaBreak {

    public static void main (String args[]) {

        int cuenta;

        for (cuenta = 1; cuenta <= 10; cuenta++) {

        if (cuenta == 5) //si cuenta es 5
            break;        //termina el ciclo

        System.out.println(cuenta);
        } //fin del for

        System.out.println("\nSalio del ciclo en cuenta = \n" + cuenta);

    }
}
