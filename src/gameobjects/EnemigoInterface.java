/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

import java.awt.Graphics2D;

/**
 *
 * @author Kiafa
 */
public interface EnemigoInterface {
    
    public void dibujate(Graphics2D g2d);
    
    public abstract void atacar();
    
    public abstract void moverEnemigo();
}
