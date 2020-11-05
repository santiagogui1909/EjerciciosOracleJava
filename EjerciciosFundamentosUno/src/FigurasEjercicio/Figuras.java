package FigurasEjercicio;

import javax.swing.*;
import java.awt.*;

public class Figuras extends JPanel {

private int opcion; //opcion del usuario acerca de cual figura dibujar

    //el constructor establece la opcion del usuario

    public Figuras (int opcionUsuario) {
        opcion = opcionUsuario;
    }

    //dibuja una cascada de figuras, empezando desde la esquina superior izquierda

public void paintComponent (Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 10; i++) {

             switch (opcion) {

                 case 1:
                     g.drawRect(10 + i * 10, 10 + i * 10 ,
                             50 + i * 10, 50 + i * 10);
                     break;

                 case 2:
                     g.drawOval(10 + i * 10, 10 + i * 10 ,
                             50 + i * 10, 50 + i * 10);
                     break;
             }
        }
   }
}
