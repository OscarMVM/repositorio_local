/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.moveball.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.tm2100.g3.moveball.view.GUIFrame;
import ucr.ac.cr.tm2100.g3.moveball.view.PanelCanvas;
import ucr.ac.cr.tm2100.g3.moveball.view.PanelColor;
import ucr.ac.cr.tm2100.g3.moveball.view.PanelMove;

/**
 *
 * @author Aarón Galagarza
 */
public class ControllerFrame implements ActionListener {

    private GUIFrame gUIFrame;
    private PanelCanvas panelCanvas;
    private PanelColor panelColor;
    private PanelMove panelMove;

    public ControllerFrame() {
        this.gUIFrame = new GUIFrame();
        this.panelCanvas = gUIFrame.getPanelCanvas();
        this.panelColor=this.gUIFrame.getPanelColor();
        this.panelColor.listenerButton(this);
        this.panelMove=this.gUIFrame.getPanelMove();
        this.panelMove.listenerButton(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Left":
                this.panelCanvas.moveLeft();
                break;
            case "Right":
                this.panelCanvas.moveRight();
                break;
            case "Up":
                this.panelCanvas.moveUp();
                break;
            case "Down":
                this.panelCanvas.moveDown();
                break;
            case "Red":
                this.panelCanvas.changeColor(Color.red);
                break;
            case "Blue":
                this.panelCanvas.changeColor(Color.blue);
                break;
            case "Green":
                this.panelCanvas.changeColor(Color.green);
                break;
        }
    }

}
