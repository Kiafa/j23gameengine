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
public abstract class Capsula {
    protected int xPos;
    protected int yPos;
    protected int velocidad;
    protected Modificacion modificacion;
    
    public Capsula(int _xPos, int _yPos, int _velocidad, Modificacion _modificacion){
        this.xPos = _xPos;
        this.yPos = _yPos;
        this.velocidad = _velocidad;
        this.modificacion = _modificacion;
    }
}
