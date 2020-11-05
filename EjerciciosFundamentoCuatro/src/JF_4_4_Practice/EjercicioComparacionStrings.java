package JF_4_4_Practice;

public class EjercicioComparacionStrings {

    public static void main(String[] args) {

        String s1 = "ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";
        s1.compareTo(s2);
        s2.equals(s3);
        s2.compareTo(s3);
        s3.equals(s1);

        System.out.println("El resultado es: " + s1.compareTo(s2));
        System.out.println("El resultado es: " + s2.equals(s3));
        System.out.println("El resultado es: " + s2.compareTo(s3));
        System.out.println("El resultado es: " + s3.equals(s1));
    }
}