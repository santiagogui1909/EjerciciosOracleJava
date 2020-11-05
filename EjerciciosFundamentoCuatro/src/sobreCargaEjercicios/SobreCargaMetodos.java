package sobreCargaEjercicios;

public class SobreCargaMetodos {

    //prueba los metodos cuadrados sobrecargados
    public void probarMetodosSobrecargados() {

        System.out.println("el cuadrado del entero 7 es: " + cuadrado (7));
        System.out.println("el cuadrado del entero 7.5 es: " + cuadrado (7.5));
    }

    //Metodo cuadrado con argumento int
    public int cuadrado (int valorInt) {

        System.out.println("se llamo a cuadrado con argumentos int: " + valorInt);
        return valorInt * valorInt;
    }

    //metodo cuadrado con argumentos double
    public double cuadrado (double valorDouble) {

        System.out.println("se llamo cuadrado con argumentos doubles: " + valorDouble);
        return valorDouble * valorDouble;
    }
}