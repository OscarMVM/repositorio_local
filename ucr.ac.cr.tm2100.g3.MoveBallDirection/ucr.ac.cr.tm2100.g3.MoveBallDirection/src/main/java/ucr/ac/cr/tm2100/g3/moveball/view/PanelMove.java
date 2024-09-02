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
public class PanelMove extends JPanel {

    private JButton btnLeft;
    private JButton btnRight;
    private JButton btnUp;
    private JButton btnDown;

    public PanelMove() {
        this.btnLeft = new JButton("Left");
        this.btnRight = new JButton("Right");
        this.btnUp = new JButton("Up");
        this.btnDown = new JButton("Down");

        this.setLayout(new GridLayout(2, 2));
        this.add(btnUp);
        this.add(btnDown);
        this.add(btnLeft);
        this.add(btnRight);
    }
    
    public void listenerButton(ActionListener controller) {
        this.btnLeft.addActionListener(controller);
        this.btnRight.addActionListener(controller);
        this.btnUp.addActionListener(controller);
        this.btnDown.addActionListener(controller);
    }

}
