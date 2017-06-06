/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

import java.awt.Graphics2D;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam
 */
public class Enemigo2 extends Enemigo implements Runnable, EnemigoInterface{

    private static String imgEnemigo2="enemigo2.png";

    public Enemigo2(int vida, int xPos, int yPos, String imagen) throws IOException {
        super(vida, xPos, yPos, imagen);
    }
    
    public void recibirDisparo(Object coordenadas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moverEnemigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object posicionEnemigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        while(true){
            try {
               
                xPos= xPos+1;
                sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Enemigo2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void recibirDisparo(int xCoordenadas_disparo, int yCoordenadas_disparo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dibujate(Graphics2D g2d) {
        g2d.drawImage(imgEnemigo, xPos, yPos, null);
    }
    
}
