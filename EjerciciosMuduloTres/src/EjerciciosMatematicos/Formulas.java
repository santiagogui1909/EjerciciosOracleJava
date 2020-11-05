package EjerciciosMatematicos;

public class Formulas {

    public static void main (String [] args) {

        double x=2;
        double y=4;
        double z=3;

        double a = Math.sqrt(Math.pow(x,5)-6) / 4;

        double b = Math.pow(x,y)-Math.pow(6,x);

        double c = 4 * Math.cos(z/5) - Math.sin(Math.pow(x,2));

        double d = Math.pow(x,4) - (Math.sqrt(x-Math.pow(y,3)));

        double e = 1 / y - (1 / x-Math.pow(2,y));

        double f = 7*(Math.cos(Math.sqrt(5-Math.sin(Math.sqrt(3*x-4)))));


        System.out.println("resultado formula A: " + a
                           +"\nresultado formula B: " + b
                           +"\nresultado formula C: " + c
                           +"\nresultado formula D: " + d
                           +"\nresultado formula E: " + e
                           +"\nresultado formula F: " + f);



    }
}
