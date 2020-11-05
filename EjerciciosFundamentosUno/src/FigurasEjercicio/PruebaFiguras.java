package FigurasEjercicio;

import javax.swing.*;

public class PruebaFiguras {

    public static void main (String [] args) {

        String entrada = JOptionPane.showInputDialog(  //optiene la opcion del usuario
                "escriba 1 para dibujar rectangulos " +
                "\nescriba 2 para dibujar ovalos ");

        int opcion = Integer.parseInt(entrada); // convierte a entrada en int

        //crea el apanel con la entrada del usuario
        Figuras panel = new Figuras( opcion);

        JFrame aplicacion = new JFrame(); //crea un nuevo objeto Jframe

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel); //agrega el panel al marco
        aplicacion.setSize(300,300); //establece el tamaño deseado
        aplicacion.setVisible(true);  // muestra el marco
    }
}
