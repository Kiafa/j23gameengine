/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import gameobjects.JefeFinal;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.server.RMIClassLoader;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kiafa
 */
public class PropertiesMegaman {
    InputStream in = null;
    
    public void loadProperties() throws IOException{
        try {
            String prop = "resources/nave.properties";
            Properties fichero = new Properties();
            in = getClass().getClassLoader().getResourceAsStream(prop);
            
            fichero.load(in);
            
            JefeFinal.setWidth(Integer.parseInt(fichero.getProperty("width_img")));
            JefeFinal.setHeigth(Integer.parseInt(fichero.getProperty("height_img")));
            JefeFinal.setCount(Integer.parseInt(fichero.getProperty("count_img")));
        } finally{
            in.close();
        }
    }
}
