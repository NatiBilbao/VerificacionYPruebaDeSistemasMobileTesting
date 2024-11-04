package session;

import factoryDevices.FactoryDevices;
import io.appium.java_client.AppiumDriver;

public class Session {
    private static Session session = null;
    private AppiumDriver device;

    //Creamos el constructor
    private Session(){
        device = FactoryDevices.make("android").create();
    }

    //Método para el acceso global
    public static Session getInstance(){
        if (session == null)
            session = new Session();
        return session;
    }

    //Cerramos la sesion
    public void closeApp(){
        device.quit();
        session = null;
    }

    public AppiumDriver getDevice(){
        return  device;
    }
}

