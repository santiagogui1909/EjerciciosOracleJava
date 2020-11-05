package FigurasEjercicio;

import javax.swing.*;
import java.awt.*;

public class CirculosReto extends JPanel {

    public  void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 1; i <= 15; ++i) {

            int width = getWidth();
            int heigth = getHeight();


            g.drawOval(width / 2 - 10 * i, heigth / 2 - 10 * i, width=20 * i, heigth=20 * i);
        }

    }

    public static void main (String [] args) {

        CirculosReto pane = new CirculosReto();
        JFrame aplicacion = new JFrame("circulos reto");

        aplicacion.add(pane);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(500,500);
    }
}
