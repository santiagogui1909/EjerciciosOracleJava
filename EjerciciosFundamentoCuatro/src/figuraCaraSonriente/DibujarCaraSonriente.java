package figuraCaraSonriente;

import javax.swing.*;
import java.awt.*;

public class DibujarCaraSonriente extends JPanel {

    public void paintComponent (Graphics g) {

        super.paintComponent(g);

        //dibuja la cara
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        //dibuja los ojos
        g.setColor(Color.BLACK);
        g.fillRect(55 , 65, 30, 30);
        g.fillRect(135, 65, 30, 30);

        //dibuja la boca
        //g.fillRect(50, 110, 80, 60);

        //convierte la boca en una sonrisa
        g.setColor(Color.black);
        //g.fillOval(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
}
