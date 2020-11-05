import java.util.Scanner;

public class pruebaCuenta {

    public static void main (String [] args) {

           ejercicioCuentas cuenta1 = new ejercicioCuentas(50.00);
           ejercicioCuentas cuenta2 = new ejercicioCuentas(7.53);

           System.out.println("saldo de cuenta 1 : " + cuenta1.obtenerSaldo());
           System.out.println("saldo de cuenta 2 : " + cuenta2.obtenerSaldo());

        Scanner entrada = new Scanner(System.in);

        double montoDeposito;

        System.out.println("escriba el monto a depositar para la cuenta 1: ");
        montoDeposito = entrada.nextDouble();

        System.out.println("\n sumando %.2f al saldo de la cuenta 1 " + montoDeposito);
        cuenta1.abonar(montoDeposito);

         //muestra los saldos cuenta 1

        System.out.println("Saldo de cuenta 1: " + cuenta1.obtenerSaldo());
        System.out.println("saldo de cuenta 2: " + cuenta2.obtenerSaldo());

        System.out.println("escriba el monto a depositar para la cuenta 2: ");
        montoDeposito = entrada.nextDouble();

        System.out.println("\nsumando %.2f al saldo de cuenta 2: " + montoDeposito);
        cuenta2.abonar(montoDeposito);

        //muestra los saldos cuenta 2

        System.out.println("Saldo de cuenta 1: " + cuenta1.obtenerSaldo());
        System.out.println("saldo de cuenta 2: " + cuenta2.obtenerSaldo());

    }

}
