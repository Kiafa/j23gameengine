/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobjects;

/**
 *
 * @author Alberto
 */
public class Modificacion {
    private int velocidad_disparo;
    private int fuerza;
    private String disparo_modificacion_imagen;

    public int getVelocidad_disparo() {
        return velocidad_disparo;
    }

    public void setVelocidad_disparo(int velocidad_disparo) {
        this.velocidad_disparo = velocidad_disparo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getDisparo_modificacion() {
        return disparo_modificacion_imagen;
    }

    public void setDisparo_modificacion(String disparo_modificacion) {
        this.disparo_modificacion_imagen = disparo_modificacion;
    }
}
