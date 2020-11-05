package EjerciciosGrafica;

import javax.swing.JPanel;
import java.awt.Graphics;

public class PanelDibujo extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int anchura = getWidth();
        int altura = getHeight();


            g.drawLine(0, 0, anchura, altura);

            g.drawLine(0, anchura, altura, 0);



    }
}