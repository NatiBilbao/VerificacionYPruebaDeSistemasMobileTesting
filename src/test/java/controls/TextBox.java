package controls;

import org.openqa.selenium.By;

public class TextBox extends AppiumControl{
    public TextBox(By locator) {
        super(locator);
    }

    //Seteamos el texto
    public void setText(String value){
        findControl();
        control.sendKeys(value);
    }

    //Limpias y seteamos
    public void clearSetText(String value){
        findControl();
        control.clear();
        control.sendKeys(value);
    }
}
