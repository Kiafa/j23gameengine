package gameobjects;

import java.awt.Graphics2D;
import java.io.IOException;
import static java.lang.Thread.sleep;

/**
 *
 * @author Kiafa
 */
public class Enemigo4 extends Enemigo implements Runnable, EnemigoInterface{

    public Enemigo4(int vida, int xPos, int yPos, String imagen) throws IOException {
        super(vida, xPos, yPos, imagen);
        new Thread(this).start();
    }

    @Override
    public void recibirDisparo(int xCoordenadas_disparo, int yCoordenadas_disparo) {
        
    }

    @Override
    public void atacar() {
        
    }

    @Override
    public void moverEnemigo() {
        this.xPos++;
        this.yPos++;
    }

    @Override
    public Object posicionEnemigo() {
        return new Object();
    }
    
    @Override
    public void run(){
        while(true){
            try {
                moverEnemigo();
                sleep(100);
                
            } catch (InterruptedException ex) {
            }
        }
    }

    @Override
    public void dibujate(Graphics2D g2d) {
        g2d.drawImage(imgEnemigo, xPos, yPos, null);
    }
    
}
