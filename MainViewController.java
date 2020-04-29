/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer.view;

import customer.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author phuong
 */
public class MainViewController  {

    /**
     * Initializes the controller class.
     */
    private Main main;
    
    @FXML
    private void goHome() throws IOException{
        Main.showMainItems();
    }
    
}
