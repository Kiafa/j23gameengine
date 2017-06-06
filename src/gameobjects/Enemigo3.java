/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.GameEngine;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;

/**
 *
 * @author Asier
 */
public class Enemigo3 extends Enemigo implements Runnable, EnemigoInterface {

    private BufferedImage enem3;

    public Enemigo3(int vida, int xPos, int yPos, String imagen) throws IOException {
        super(vida, xPos, yPos, imagen);
        enem3 = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/enemigos/Enemigo3.png"));
        xPos = (GameEngine.screenWidth - enem3.getWidth()) / 2;
        yPos = 50;

    }

    @Override
    public void recibirDisparo(int xCoordenadas_disparo, int yCoordenadas_disparo) {
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

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void run() {
        Enemigo3 e3 = null;

        xPos = xPos + 1;
        yPos = 50;

        while (true) {
            try {
                xPos = xPos + 1;
                yPos = 50;
                sleep(10);
            } catch (InterruptedException ex) {

            }
        }
    }

    @Override
    public void dibujate(Graphics2D g2d) {
        g2d.drawImage(imgEnemigo, xPos, yPos, null);
    }
}
