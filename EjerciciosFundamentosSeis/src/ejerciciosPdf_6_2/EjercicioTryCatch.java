package ejerciciosPdf_6_2;

public class EjercicioTryCatch {

    public static void main(String[] args) {

        int i = 15;

        try {
            //i is the index of an array with lenght 10
            if (i > 9 || i < 0)

                System.out.println("Index " + i + " is out of bounds!");

        } catch (Exception e) {
            //This code will run only if the exception was thrown
            if (i > 9)
                i -= 9;
            else
                i += 9;
        }
    }
}
