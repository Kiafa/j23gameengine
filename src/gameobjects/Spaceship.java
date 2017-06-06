package gameobjects;

import java.awt.image.BufferedImage;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import net.juanxxiii.j23gameengine.GameEngine;
import net.juanxxiii.j23gameengine.gui.JPGameScreen;
import util.PropertiesManager;

/**
 * Nave espacial
 *
 * @author Paniagua
 */
public class Spaceship implements Runnable {

    private static final int STOP = -1;
    private static final int UP = 0;
    private static final int DOWN = 1;
    private static final int RIGHT = 2;
    private static final int LEFT = 3;

    private int direccionX = STOP;
    private int direccionY = STOP;

    private BufferedImage nave;//Nave espacial
    private int xNave = 0;//Posición x de la nave
    private int yNave = 0;//Posición y de la nave
    private int speedNave = 3;//Velocidad de la nave

    public Spaceship() throws IOException {
        //Cargamos la imagen
        nave = ImageIO.read(JPGameScreen.class.getResourceAsStream("/assets/spaceship.png"));
        //Inicializamos posiciones
        xNave = (GameEngine.screenWidth - nave.getWidth()) / 2;
        yNave = GameEngine.screenHeight - nave.getHeight() * 2;
    }

    public BufferedImage getNave() {
        return nave;
    }

    public void setNave(BufferedImage nave) {
        this.nave = nave;
    }

    public int getxNave() {
        return xNave;
    }

    public void setxNave(int xNave) {
        this.xNave = xNave;
    }

    public int getyNave() {
        return yNave;
    }

    public void setyNave(int yNave) {
        this.yNave = yNave;
    }

    public int getSpeedNave() {
        return speedNave;
    }

    public void setSpeedNave(int speedNave) {
        this.speedNave = speedNave;
    }

    public void moveUp() {
        direccionY = UP;
    }

    public void moveDown() {
        direccionY = DOWN;
    }

    public void moveRight() {
        direccionX = RIGHT;
    }

    public void moveLeft() {
        direccionX = LEFT;
    }

    public void stop() {
        direccionX = STOP;
        direccionY = STOP;
    }

    @Override
    public void run() {
        float velX = 0;
        float velY = 0;
        int resX = GameEngine.screenWidth;
        int resY = GameEngine.screenHeight;
        /*System.out.println("resX: "+resX);
        System.out.println("resY: "+resY);*/
        while (true) {
            //System.out.println(direccionX);
            /*switch (direccion) {
                case UP:
                    //yNave--;
                    if (yNave > 0) {
                        if (velY > (-speedNave)) {
                            velY = velY - 0.3f;
                        }
                    } else {
                        velY = 0;
                    }
                    break;
                case DOWN:
                    //yNave++;
                    if (yNave < ((resY - 55) - nave.getHeight())) {
                        if (velY < (speedNave)) {
                            velY = velY + 0.3f;
                        }
                    } else {
                        velY = 0;
                    }
                    break;
                case RIGHT:
                    //xNave++;
                    if (xNave < (resX - nave.getWidth())) {
                        if (velX < (speedNave)) {
                            velX = velX + 0.3f;
                        }
                    } else {
                        velX = 0;
                    }
                    break;
                case LEFT:
                    //xNave--;
                    if (xNave > 0) {
                        if (velX > (-speedNave)) {
                            velX = velX - 0.3f;
                        }
                    } else {
                        velX = 0;
                    }
                    break;
                default:
                    if (velX > 0.3f || velX < -0.3f) {
                        if (velX < 0) {
                            velX = velX + 0.5f;
                        } else if (velX > 0) {
                            velX = velX - 0.5f;
                        }
                    } else {
                        velX = 0;
                    }
                    if (velY > 0.3f || velY < -0.3f) {
                        if (velY < 0) {
                            velY = velY + 0.5f;
                        } else if (velY > 0) {
                            velY = velY - 0.5f;
                        }
                    } else {
                        velY = 0;
                    }
                    break;
            }*/
            switch (direccionY) {
                case UP:
                    //yNave--;
                    if (yNave > 0) {
                        if (velY > (-speedNave)) {
                            velY = velY - 0.3f;
                        }
                    } else {
                        velY = 0;
                    }
                    break;
                case DOWN:
                    //yNave++;
                    if (yNave < ((resY - 55) - nave.getHeight())) {
                        if (velY < (speedNave)) {
                            velY = velY + 0.3f;
                        }
                    } else {
                        velY = 0;
                    }
                    break;
                default:
                    if (velY > 0.3f || velY < -0.3f) {
                        if (velY < 0) {
                            velY = velY + 0.5f;
                        } else if (velY > 0) {
                            velY = velY - 0.5f;
                        }
                    } else {
                        velY = 0;
                    }
                    break;
            }
            switch (direccionX) {
                case RIGHT:
                    //xNave++;
                    if (xNave < (resX - nave.getWidth())) {
                        if (velX < (speedNave)) {
                            velX = velX + 0.3f;
                        }
                    } else {
                        velX = 0;
                    }
                    break;
                case LEFT:
                    //xNave--;
                    if (xNave > 0) {
                        if (velX > (-speedNave)) {
                            velX = velX - 0.3f;
                        }
                    } else {
                        velX = 0;
                    }
                    break;
                default:
                    if (velX > 0.3f || velX < -0.3f) {
                        if (velX < 0) {
                            velX = velX + 0.5f;
                        } else if (velX > 0) {
                            velX = velX - 0.5f;
                        }
                    } else {
                        velX = 0;
                    }
            }
            xNave = xNave + (int) velX;
            yNave = yNave + (int) velY;

            /*System.out.println("velX: " + velX);
            System.out.println("Xpos: " + xNave);
            System.out.println("Ypos: " + yNave);*/
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                //Irrelevante, no hacemos nada
            }
        }
    }
}
