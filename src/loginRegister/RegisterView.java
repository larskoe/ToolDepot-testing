package loginRegister;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author larskoester
 * view that loads the registration screen for the application
 */
public class RegisterView extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			
	        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
	        Scene scene = new Scene(root);
	    
	        primaryStage.setTitle("Register-ToolDepot"); 
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

