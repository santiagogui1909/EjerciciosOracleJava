package ValorMaximo;

import java.util.Scanner;

public class BuscadorMaximo {

    //obtiene tres valores de punto flotanto y determina el valor maximo
    public void determinarMaximo() {
        //crea objeto Scanner para introducir datos desde la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        System.out.println(
                "Escriba tres valores de punto flante , separados por espacios: ");

        Double numero1 = entrada.nextDouble();  //lee el primer valor double
        Double numero2 = entrada.nextDouble();  //lee el segundo valor double
        Double numero3 = entrada.nextDouble();  //lee el tercer valor double

        //determina el valor maximo
        Double resultado = maximo(numero1, numero2, numero3);

        //muestra el valor maximo
        System.out.println("el valor maximo es: " + resultado);
    }

        //devuelve el valor maximo de us stres parametros doubles
        public double maximo ( double x, double y, double z){

            double valormaximo = x; //asume que x es el valor mayor para empezar

            //determina su¿i y es el valormaximo
            if (y > valormaximo)
                valormaximo = y;
            //determina si z es mayor que valormaximo
            if (z > valormaximo)
                valormaximo = z;
            return valormaximo;

        }

}



