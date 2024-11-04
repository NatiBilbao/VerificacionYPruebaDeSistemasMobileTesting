package activities;

import controls.Button;
import controls.ComboBox;
import controls.TextBox;
import org.openqa.selenium.By;

public class ContactCreateForm {

    //Nombre del contacto
    public TextBox nameTxtBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"First name\"]"));
    //Apellido del contacto
    public TextBox lastNameTxtBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"Last name\"]"));
    //Numero de telefono
    public TextBox phoneTxtBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"Phone\"]"));

    //Menu para elegir el tipo de telefono
    public ComboBox typePhone = new ComboBox(By.xpath("//android.widget.TextView[@text='Mobile']"));

    //Boton para guardar el contacto
    public Button saveButton = new Button(By.id("com.android.contacts:id/editor_menu_save_button"));
}
