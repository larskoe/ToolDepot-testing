package loginRegister;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author larskoester
 * view that loads the login screen for the application
 */
    public class LoginView extends Application {
        
        @Override
        public void start(Stage primaryStage) {
        	try {
                Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
                Scene scene = new Scene(root);
                
                scene.getStylesheets().add(getClass().getResource("Login.css").toExternalForm());
            
                primaryStage.setTitle("Login-ToolDepot"); 
                primaryStage.setScene(scene);
                primaryStage.show();
            
            } catch(Exception e) {
                e.printStackTrace();
            } 
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            launch(args);
        }
        
    }

