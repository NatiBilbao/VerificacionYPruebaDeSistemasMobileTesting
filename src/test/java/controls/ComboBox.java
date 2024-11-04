package controls;

import org.openqa.selenium.By;

public class ComboBox extends AppiumControl{

    //Creamos el constructor
    private String optionLabel="//android.widget.CheckedTextView[@text='%s']";
    public ComboBox(By locator) {
        super(locator);
    }

    //Creamos un segundo constructor para elegir una opción al momento de el crear el contacto
    public ComboBox(By locator, String optionLabel) {
        super(locator);
        this.optionLabel = optionLabel;
    }

    //Seleccionamos el valor
    public void selectOption(String option){
        //Encontramos el control
        this.findControl();
        //Hacemos click
        control.click();
        //Generamos un control donde le mandamos el localizador
        Label optionControl = new Label(By.xpath(String.format(optionLabel,option)));
        //Hacemos click
        optionControl.click();
    }
}
