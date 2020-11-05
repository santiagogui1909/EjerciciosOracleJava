/*Escriba un programa que tome la base y altura de un triángulo y calcule
y muestre la superficie de este utilizando la fórmula a continuación.*/

package EjerciciosMatematicos;

import java.util.Scanner;

public class Triangulo {

public static void main (String [] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("ingrese el valor de la base del triangulo");
    double base = sc.nextDouble();

    System.out.println("ingrese el valor de la altura del triangulo");
    double altura = sc.nextDouble();

    double superficie = (base * altura) / 2;  //formula para hallar el area o superficie de un triangulo

    System.out.println("la superficie del triangulo vale: " + superficie + " m2");

   }
}
