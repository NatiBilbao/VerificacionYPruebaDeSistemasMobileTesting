package activities;

import controls.Button;
import org.openqa.selenium.By;

public class ContactListScreen {
    //Contiene el boton para agregar contactos
    public Button addContactButton = new Button(By.id("com.android.contacts:id/floating_action_button"));
}
