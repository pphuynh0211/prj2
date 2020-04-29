/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author phuong
 */
public class Main extends Application {
    private static Stage primaryStage;
    private static BorderPane mainLayout;
   
    public void start(Stage primaryStage) throws IOException {
        
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Customer Application");
        
        showMainView();
        showMainItems();
    }

    /**
     * @param args the command line arguments
     */
    
    public static void showMainView() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MainView.fxml"));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public static void showMainItems() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
        BorderPane mainitem = loader.load();
        mainLayout.setCenter(mainitem);
     
        
    }
    
    public static void showPlaceOrder() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("placeorder/PlaceOrder.fxml"));
        BorderPane placeorders = loader.load();
        mainLayout.setCenter(placeorders);
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
