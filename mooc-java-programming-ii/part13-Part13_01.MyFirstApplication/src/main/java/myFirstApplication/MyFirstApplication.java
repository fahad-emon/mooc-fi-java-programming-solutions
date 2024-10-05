package myFirstApplication;

import javafx.application.Application;
import javafx.stage.Stage;

public class MyFirstApplication extends Application{
    
    @Override
    public void start(Stage window) {
        window.setTitle("My first application");
        window.show();
    }

    public static void main(String[] args) {
        
        launch(MyFirstApplication.class);
        
    }

//    @Override
//    public void start(Stage window) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    

}
