package JF_4_4_Practice;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

    public class PanelTiroAlblaco  extends JPanel {

        final Color RED = new Color(7, 6, 6, 255);

        Color colores[] = {Color.WHITE, RED, Color.RED, Color.WHITE,Color.RED, Color.WHITE,

                Color.RED, Color.WHITE};

        @Override

        public void paintComponent(Graphics g) {

            super.paintComponent(g);

            int centroX = getWidth();
            int centroY = getHeight();
            int x = 10;
            int y = 10;

            for (int contador = 0; contador < colores.length; contador++) {

                g.setColor(colores[contador]);

                g.fillOval(x, y, centroX - 30, centroY - 30);

                x += 20;
                y += 20;

                centroX -= 40;
                centroY -= 40;

            }

        }

    }




