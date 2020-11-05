package JF_4_4_Practice;

import javax.swing.*;
import java.awt.*;

public class TiroAlBlanco {

    public static void main(String [] args) {

        PanelTiroAlblaco panel = new PanelTiroAlblaco();
        JFrame aplicacion = new JFrame();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(480, 480);
        aplicacion.setVisible(true);
        panel.setBounds(0, 0, aplicacion.getWidth(), aplicacion.getHeight());
        panel.setVisible(true);
        panel.setBackground(Color.white);

    }
}
