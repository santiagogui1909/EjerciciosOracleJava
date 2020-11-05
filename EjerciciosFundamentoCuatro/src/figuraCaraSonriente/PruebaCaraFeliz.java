package figuraCaraSonriente;

import javax.swing.*;

public class PruebaCaraFeliz {

    public static void main (String[] args) {

        DibujarCaraSonriente panel = new DibujarCaraSonriente();
        JFrame aplicacion = new JFrame();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(230,250);
        aplicacion.setVisible(true);
    }
}
