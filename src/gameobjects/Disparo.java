package gameobjects;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;


/** @author Kiafa
 * Contiene los atributos minimos para crear el disparo
 * 
 */
public class Disparo {
    
    protected int velocidad;
    protected static final int FUERZA_INICIAL = 10;
    protected int fuerza;
    protected int xPos;
    protected int yPos;
    protected BufferedImage imgDisparo;
    
    /**
     * Constructor de la clase disparo que contiene los parametros necesarios para crear el disparo
     * por la pantalla.
     * 
     * @param _xPos posicion X en la pantalla del disparo.
     * @param _yPos posicion Y en la pantalla del disparo.
     * @param img imagen del disparo.
     * @throws IOException si la imagen no se encuentra.
     */
    public Disparo(int _xPos, int _yPos, String img) throws IOException{
        this.xPos = _xPos;
        this.yPos = _yPos;
        this.fuerza = FUERZA_INICIAL;
        establecerImg(img);
    }
    public Disparo(int _xPos, int _yPos, String img, Modificacion modificacion) throws IOException{
        this.xPos = _xPos;
        this.yPos = _yPos;
        this.fuerza = FUERZA_INICIAL + modificacion.getFuerza();
        establecerImgModificada(modificacion.getDisparo_modificacion());
    }
    
    public void desplazarX(int desplazamiento){
        this.xPos += desplazamiento;
    }
    
    public void desplazarY(int desplazamiento){
        this.yPos += desplazamiento;
    }
    
    public void establecerVelocidad(int _vel){
        this.velocidad = _vel;
    }
    
    private void establecerImg(String img) throws IOException{
        this.imgDisparo = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/"+img));
    }
    
    private void establecerImgModificada(String img) throws IOException{
        this.imgDisparo = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/"+img));
    }
}
