package EjerciciosCuenta;

public class CuentaApp {

    public static void main(String[] args) {

        Cuenta cuenta_1 = new Cuenta("santiago");
        Cuenta cuenta_2 = new Cuenta("Fernando");

        //Ingresa dinero en las cuentas
        cuenta_1.ingresar(0);                       //mejorar ojo
        cuenta_2.ingresar(400);

        //Retiramos dinero en las cuentas
        cuenta_1.retirar(500);
        cuenta_2.retirar(100);

        //Muestro la informacion de las cuentas
        cuenta_1.mostrarOperacion();
        cuenta_2.mostrarOperacion();
    }


}





//opcion 2

 /*
 System.out.println("por favor ingrese el nombre del titular");
       Cuenta.titular = usuarios.next();

 System.out.println("si desea ingresar dinero ingrese (1), si desea realizar un retiro ingrese (2), si no escriba desea realizar " +
         "ninguna de estas operaciones ingrese (3)");
         int opcion = usuarios.nextInt();

         switch (opcion) {

         case 1:
         usuario.ingresar();
         System.out.println("ingrese la cantidad a depositar");
         Cuenta.cantidad = usuarios.nextDouble();
         break;

         case 2:
         usuario.retirar();
         System.out.println("ingrese la cantidad a retirar");
         Cuenta.cantidad = usuarios.nextDouble();
         break;

         case 3:
         System.out.println("gracias por preferirnos tenga buen dia");
         break;
         }

  */