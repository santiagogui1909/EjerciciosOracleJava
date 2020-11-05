package ejerciciosCapituloDos;

public class CorreccionErrorIf {
    public static void main (String [] args) {

        int c=4;

        if (c < 7) { //error se encontraba en que habia un ";" en ves de un "{".
            System.out.println("c es menor que 7");
        }

        if (c >= 4) {  // estaba de esta forma => y el signo "< o >" va antes del signo igual "<= y >=".
            System.out.println("c es igual o mayor que 7");

            
        }
    }

}
