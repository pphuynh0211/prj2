/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer.placeorder;

import customer.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author phuong
 */
public class PlaceOrderController  {
    
    ObservableList<String> ActionList = FXCollections.observableArrayList("Picking", "Deliver");

    /**
     * Initializes the controller class.
     */
    private Main main;
    
     @FXML
    private DatePicker Date;
     
     @FXML
    private ChoiceBox Action;
    
    @FXML 
    private TextField LocationField;
    
    @FXML 
    private TextField ProductField;
    
    @FXML 
    private TextField AmountField;
    
    @FXML 
    private TextField NameField;
    
    @FXML 
    private TextField PhoneField;
    
    
    @FXML
    public void goBack1() throws IOException{
        Main.showMainItems();
    }  
    
    @FXML
    private void initialize(){
        Action.setValue("Picking");
        Action.setItems(ActionList);
       
        
        
    }
}
