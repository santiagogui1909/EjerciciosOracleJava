package DiapositivasArreglos;

public class IniciarArreglosUno {

    public IniciarArreglosUno() {
}

    public static void main(String[] args) {
        boolean LONGITUD_ARREGLO = true;
        int[] arreglo = new int[10];

        int contador;
        for(contador = 0; contador < arreglo.length; ++contador) {
            arreglo[contador] = 2 + 2 * contador;
        }

        System.out.printf("%s%8s\n", "Indice", "Valor");

        for(contador = 0; contador < arreglo.length; ++contador) {
            System.out.printf("%5d%8d\n", contador, arreglo[contador]);
        }

    }
}
