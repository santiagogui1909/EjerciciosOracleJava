import java.util.HashSet;

public class EjercicioHst {

        public static void main(String args[]) {

            HashSet<String> hset = new HashSet<String>();

            // Añadiendo elementos al hset
            hset.add("manzana");
            hset.add("Mango");
            hset.add("uvas");
            hset.add("naranjas");
            
            hset.add("manzana");
            hset.add("uvas");



            //añademos nuevos valores
            hset.add("papaya");
            hset.add("sandia");


            //Visualización de elementos HashSet
            System.out.println(hset);
        }
    }