/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;

/**
 *
 * @author Alberto
 */
public abstract class Enemigo {
    
    protected int vida;
    protected int xPos;
    protected int yPos;
    protected int velocidad;
    protected int fuerza;//
    protected BufferedImage imgEnemigo;
    
    public Enemigo(int vida, int xPos, int yPos, String imagen) throws IOException{
        this.vida = vida;
        this.xPos = xPos;
        this.yPos = yPos;
        establecerImg(imagen);
    }
    
    public abstract void recibirDisparo(int xCoordenadas_disparo, int yCoordenadas_disparo);
    //Al recibir un objeto coordenadas que contengan la "x" y la "y", debemos comparar
    //la posición de nuestro enemigo con la del disparo. Si coinciden cuenta como "recibido"
    //lo que reducirá la vida del enemigo y hara que la bala desaparezca del mapa ya por 
    //defecto los disparos no atraviesan a los enemigos.
    
    
    public abstract Object posicionEnemigo();
    
    private void establecerImg(String img) throws IOException{
        this.imgEnemigo = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/enemigos/"+img));
    }
}
