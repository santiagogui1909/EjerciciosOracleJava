package EjerciciosJF_1.Ejercicios;

import java.util.Scanner;

public class EjercicioOcho {

        static int[][] matrizA = new int[2][2];
        static int[][] matrizB = new int[2][2];
        static int[][] resultado = new int[2][2];
        static Scanner sc = new Scanner(System.in);
        static int valores;
        static String opcion;
        static boolean opcionesOn = true;

        public static void main(String[] args) {

            matrizA[0][0] = 3; 
            matrizA[0][1] = 4;
            matrizA[1][0] = 5;
            matrizA[1][1] = 6;

            matrizB[0][0] = 1;
            matrizB[0][1] = 0;
            matrizB[1][0] = -2;
            matrizB[1][1] = 3;


            while (opcionesOn){
                System.out.println("Seleccione la opcion que desea realizar");
                System.out.println("A. Ingresar matriz A" +
                        "\nB. Ingresar matriz B" +
                        "\nC. Mostrar A + B" +
                        "\nD. Mostrar A - B" +
                        "\nE. Mostrar A * B" +
                        "\nF. Salir");

                opcion = sc.nextLine().toLowerCase();
                switch (opcion) {
                    case "a":
                        for (int f = 0; f < 2; ++f) {
                            for (int c = 0; c < 2; ++c) {
                                System.out.println("Ingrese un valor a la matriz A en la posicion FILA:[" + f + "] COLMUNA:[" + c + "]");
                                valores = sc.nextInt();
                                matrizA[f][c] = valores;
                            }
                        }
                        break;

                    case "b":
                        for (int f = 0; f < 2; ++f) {
                            for (int c = 0; c < 2; ++c) {
                                System.out.println("Ingrese un valor a la matriz B en la posicion FILA:[" + f + "] COLMUNA:[" + c + "]");
                                valores = sc.nextInt();
                                matrizB[f][c] = valores;
                            }
                        }
                        break;

                    case "c":
                        for (int f = 0; f < 2; ++f) {
                            for (int c = 0; c < 2; ++c) {
                                resultado[f][c] += matrizA[f][c] + matrizB[f][c];
                            }
                        }
                        break;

                    case "d":

                        for (int f = 0; f < 2; ++f) {
                            for (int c = 0; c < 2; ++c) {
                                resultado[f][c] = matrizA[f][c] - matrizB[f][c];
                            }
                        }
                        break;

                    case "e":
                        for (int f = 0; f < matrizA.length; f++) {
                            for (int c = 0; c < matrizB[0].length; c++) {
                                for (int k = 0; k < matrizA[0].length; k++) {
                                    resultado[f][c] += matrizA[f][k] * matrizB[k][c];
                                }
                            }
                        }
                        break;

                    case "f":
                        opcionesOn = false;
                        break;

                    default:
                        opcionesOn = false;
                        break;
                }

                System.out.println("RESULTADO");

                for (int f = 0; f < 2; ++f){
                    for (int c = 0; c < 2; ++c){
                        System.out.print(resultado[f][c] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("------------------------------------------------------");
            }
        }
    }
