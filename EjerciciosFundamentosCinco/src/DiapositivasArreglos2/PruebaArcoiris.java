package DiapositivasArreglos2;

import javax.swing.*;

public class PruebaArcoiris {

    public static void main (String args []) {

        DibujoArcoiris panel = new DibujoArcoiris();
        JFrame aplicacion = new JFrame();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(400 , 250);
        aplicacion.setVisible(true);
    }
}
