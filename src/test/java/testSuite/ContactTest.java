package testSuite;

import activities.ContactCreateForm;
import activities.ContactDetailScreen;
import activities.ContactListScreen;
import activities.SyncAlert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class ContactTest {

    //Creamos las pantallas que tenemos en la aplicación
    SyncAlert syncAlert = new SyncAlert();
    ContactDetailScreen contactDetailScreen = new ContactDetailScreen();
    ContactListScreen contactListScreen = new ContactListScreen();
    ContactCreateForm contactCreateForm = new ContactCreateForm();

    //Creamos el test para agregar un contacto
    @Test
    public void createContactTest(){

        //Colocamos un nombre al contacto
        String name = "Natalia";
        //Colocamos un apellido al contacto
        String lastName= "Bilbao";
        //Hacemos click en boton de agregar contacto
        contactListScreen.addContactButton.click();
        //Hacemos click en cancelar cuando sale la alerta de sincronización
        syncAlert.cancelButton.click();
        //Llenamos el nombre
        contactCreateForm.nameTxtBox.setText(name);
        //Llenamos el apellido
        contactCreateForm.lastNameTxtBox.setText(lastName);
        //Llenamos el telefono
        contactCreateForm.phoneTxtBox.setText("78945612");
        //Seleccionamos una opción del tipo de telefono
        contactCreateForm.typePhone.selectOption("Home");
        //Hacemos click en el boton de guardar
        contactCreateForm.saveButton.click();

        //Verificamos que el contacto fue creado con exito
        Assertions.assertEquals(name+" "+lastName,contactDetailScreen.nameLabel.getText(),
                "ERROR, el contacto no fue creado correctamente");

    }

    //Cerramos la sesion
    @AfterEach
    public void close(){
        Session.getInstance().closeApp();
    }
}
