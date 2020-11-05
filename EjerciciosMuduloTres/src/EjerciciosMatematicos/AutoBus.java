/*Un autobús lleva 45 personas. El colegio solo utilizará el autobús si puede llenarlo del tod
El resto de personas irá en furgonetas. Escriba un programa que registre el número de
personas que se han apuntado para ir de viaje.Haga que el programa muestre el                ||
número necesario de autobuses y, después, el número total de personas que tendrá que viajar en furgonetas.*/

package EjerciciosMatematicos;

import java.util.Scanner;

public class AutoBus {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el total de personas que se apuntaron al viaje: ");
        int numPersonas = sc.nextInt();


        if (numPersonas == 45) {
            System.out.println("se uso 1 autobus, el autobus esta cargado con 45 personas");

        } else if (numPersonas == 90) {
            System.out.println("se uso 2 autobuses,los autobuses estan cargados con 90 personas");
        }


        if (numPersonas <= 22) {
            System.out.println("un total de " + numPersonas + " se fueron en furgoneta y no se uso autobuses" );

        } else if (numPersonas > 23 && numPersonas <= 44) {
            System.out.println("un total de " + numPersonas + " se fueron en 2 fugonetas, no se usaron autobuses");

        } else if (numPersonas > 46 && numPersonas <= 67)  {

            int furgoneta= numPersonas-45;

            System.out.println("se uso en una furgoneta con " + furgoneta + " pasajeros y un autobus");

        }else if (numPersonas > 67 && numPersonas <= 89) {

            int furgoneta= numPersonas-45;

            System.out.println("se uso 2 furgonetas con " + furgoneta + " pasajeros y un autobus");

        }else if (numPersonas > 90 && numPersonas <= 100) {

            int furgoneta = numPersonas-90;

            System.out.println("se uso 1 furgonetas con " + furgoneta + " pasajeros y 2 autobuses");

        }

        System.out.println("un total de " + numPersonas + " personas viajaron ");
    }
}

