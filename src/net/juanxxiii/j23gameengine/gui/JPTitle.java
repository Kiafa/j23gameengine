/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.juanxxiii.j23gameengine.gui;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import net.juanxxiii.j23gameengine.GameEngine;

/**
 *
 * @author Paniagua
 */
public class JPTitle extends javax.swing.JPanel {

    /**
     * Creates new form JPTitle
     */
    public JPTitle() {
        initComponents();
        //Espera 3000 ms y lanza la Tarea de cambio de pantalla
        Timer timer = new Timer();
        timer.schedule(new Tarea(), 3000);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logotipo.jpg"))); // NOI18N
        add(jLabel1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private class Tarea extends TimerTask {
        @Override
        public void run() {
            //Obtener la referencia al JFrame padre
            GameEngine topFrame = (GameEngine)SwingUtilities.getWindowAncestor(JPTitle.this);
            topFrame.comenzarJuego(); 
        }
    }
}
