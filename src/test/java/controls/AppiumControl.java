package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

public class AppiumControl {

    //Definimos el localizador
    protected By locator;

    //Definimos al control
    protected WebElement control;

    //Generamos el constructor
    public AppiumControl(By locator){
        this.locator = locator;
    }

    //Método para encontral el control
    protected void findControl(){
        control = Session.getInstance().getDevice().findElement(locator);
    }

    //Creamos las acciones genericas
    public void click(){
        findControl();
        control.click();
    }

    public String getText(){
        findControl();
        return control.getText();
    }

    public boolean isControlDisplayed(){
        try {
            findControl();
            return control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
}
