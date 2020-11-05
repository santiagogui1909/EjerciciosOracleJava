

/**Declare e instancie dos objetos de cadena independientes; a continuación, concaténelos y asígneles un tercer
 objeto de cadena arbitrario*/

package JF_4_4_Practice;

import java.util.ArrayList;
import java.util.List;

public class EjercicioDeclaracionDeVariables {

    public static void main (String [] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        System.out.println(list);
        add(list);
        System.out.println(list);
    }

    public static void add(List<String> list) {

        list.add("d");
        list.add("c");
    }
}
