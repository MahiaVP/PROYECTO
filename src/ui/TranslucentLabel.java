package ui;

import javax.swing.*;
import java.awt.*;

public class TranslucentLabel extends JLabel {

    public TranslucentLabel() {
        setOpaque(false); // clave: Swing repinta el fondo de atrás
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(0, 0, 0, 255));
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g); // dibuja el texto encima
    }
}
