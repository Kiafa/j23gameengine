package gameobjects;

import java.awt.Graphics2D;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.PropertiesMegaman;

/**
 *
 * @author Kiafa
 */
public class JefeFinal extends Enemigo implements EnemigoInterface, Runnable{
    
    private static int img_width;
    private static int img_height;
    private static int count;
    int frameX=0;
    int countp=0;

    public JefeFinal(int vida, int xPos, int yPos, String imagen) throws IOException {
        super(vida, xPos, yPos, imagen);
        new Thread(this).start();
        PropertiesMegaman pm = new PropertiesMegaman();
        pm.loadProperties();
    }

    @Override
    public void recibirDisparo(int xCoordenadas_disparo, int yCoordenadas_disparo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar(){
        
    }

    @Override
    public void moverEnemigo() {
        xPos++;
    }

    @Override
    public Object posicionEnemigo() {
        return null;
    }

    @Override
    public void dibujate(Graphics2D g2d) {
        
        g2d.drawImage(imgEnemigo, xPos, yPos, xPos+160, yPos+160, frameX*img_width, 0, img_width*(frameX+1), img_height, null);
        
        countp++;
        if(countp%9==0){
            frameX++;
            countp=0;
        }
        if(frameX>2){
            frameX=0;
        }
        
    }

    @Override
    public void run() {
        while(true){
            try {
                moverEnemigo();
                sleep(100);
                
            } catch (InterruptedException ex) {
            }
        }
    }
    
    public static void setWidth(int width){
        JefeFinal.img_width = width;
    }
    
    public static void setHeigth(int height){
        JefeFinal.img_height=height;
    }
    
    public static void setCount(int count){
        JefeFinal.count=count;
    }
    
}
