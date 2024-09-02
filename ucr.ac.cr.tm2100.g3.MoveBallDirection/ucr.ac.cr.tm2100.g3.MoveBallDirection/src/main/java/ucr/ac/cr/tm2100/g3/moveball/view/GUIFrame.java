/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.moveball.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aarón Galagarza
 */
public class GUIFrame extends JFrame {

    private PanelCanvas panelCanvas;
    private PanelColor panelColor;
    private PanelMove panelMove;

    public GUIFrame() {
        this.panelCanvas = new PanelCanvas();
        this.panelColor = new PanelColor();
        this.panelMove = new PanelMove();

        // Configurar el layout principal del frame
        this.setLayout(new BorderLayout());
        this.add(panelCanvas, BorderLayout.CENTER);
        this.add(panelMove, BorderLayout.NORTH);
        this.add(this.panelColor, BorderLayout.SOUTH);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public PanelCanvas getPanelCanvas() {
        return this.panelCanvas;
    }

    public PanelColor getPanelColor() {
        return this.panelColor;
    }

    public PanelMove getPanelMove() {
        return this.panelMove;
    }
}
