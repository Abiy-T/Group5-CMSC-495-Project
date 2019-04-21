/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;





/**
 *
 * @author ABIY
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Tab Home;
    
    //Reservation
    @FXML
    private Tab Reservation;
    @FXML
    private DatePicker checkindate;
    @FXML
    private DatePicker checkoutdate;
    @FXML
    private ComboBox <String> Roomtype;
    @FXML
    private ComboBox <String> Amenities;
    @FXML
    private ComboBox <String> numberofguest;
    
    @FXML
    private Button Submit;
    
    @FXML
    private Button Cancel;
    
    
   //Payments 
    @FXML
    private Tab Payment;
    @FXML
    private TextArea ReservationNo;
    @FXML
    private TextArea Totalamount;
    @FXML
    private RadioButton visa;
    @FXML
    private RadioButton Mastercard;
    @FXML
    private RadioButton AMEX;
    @FXML
    private RadioButton paypal;
    @FXML
    private TextField cardnumber;
    @FXML
    private DatePicker Expirationdate;
    @FXML
    private TextField CVV;
    @FXML
    private TextField Nameoncard;
    @FXML
    private TextField Firstname;
    @FXML
    private TextField Lastname;
    @FXML
    private TextField Address;
    @FXML
    private TextField email;
    
    //login
    @FXML
    private Tab login;
    @FXML
    private TextField userID;
    @FXML
    private PasswordField password;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String room = Roomtype.getSelectionModel().getSelectedItem();
        System.out.println("Roomtype selection:  + room");
        
        String amen = Amenities.getSelectionModel().getSelectedItem();
        System.out.println("Amenities selection:  + amen");
        
        Object num = numberofguest.getSelectionModel().getSelectedItem();
        System.out.println("numberofguest selection:  + num");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        String room [] = {"Single $99.99","Double $149.99","Suite $199.99",};
        Roomtype.getItems().addAll(Arrays.asList(room));
        
        String amen [] = {"Brekfast", "Dinner","High Speed Internet","Laundry & Dry cleaning",};
        Amenities.getItems().addAll(Arrays.asList(amen));
        
        String num [] = {"1 guest", "2 guests", "3 guests","4 guests","5 guests","6 guests",};
        numberofguest.getItems().addAll(Arrays.asList(num));
        
      

    }

}