package DiapositivasArreglos2;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

    public class DibujoArcoiris extends JPanel {
        final Color VIOLETA = new Color(128, 0, 128);
        final Color INDIGO = new Color(75, 0, 130);
        private Color[] colores;

        public DibujoArcoiris() {
            this.colores = new Color[]{Color.white, Color.white, this.VIOLETA, this.INDIGO, Color.blue, Color.green, Color.yellow, Color.orange, Color.red};
        }

        public void DibujoArcoIris() {
            this.setBackground(Color.white);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int radio = 20;
            int centroX = this.getWidth() / 20;
            int centroY = this.getHeight() - 10;

            for(int contador = this.colores.length; contador > 0; --contador) {
                g.setColor(this.colores[contador - 1]);
                g.fillArc(centroX - contador * radio, centroY - contador * radio, contador * radio * 2, contador * radio * 2, 0, 180);
            }

        }
    }
