/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.moveball.view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Aarón Galagarza
 */
public class PanelColor extends JPanel {

    private JButton btnRed;
    private JButton btnBlue;
    private JButton btnGreen;

    public PanelColor() {
        this.btnRed = new JButton("Red");
        this.btnBlue = new JButton("Blue");
        this.btnGreen = new JButton("Green");

        this.setLayout(new GridLayout(1, 3));
        this.add(btnRed);
        this.add(btnBlue);
        this.add(btnGreen);
    }

    public void listenerButton(ActionListener controller) {
        this.btnBlue.addActionListener(controller);
        this.btnGreen.addActionListener(controller);
        this.btnRed.addActionListener(controller);
    }

}
