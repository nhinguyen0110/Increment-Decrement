/*
------------------------------------------------------------------------------
   Name:     NhiNguyen_IS221_Ch4_PP4_12
   Author:   Nhi Nguyen
   Date:     Feb 21, 2023
   Language: Java
   Purpose:  The purpose of this program is to write a JavaFX application that
             displays a button and a number; every time the button is pushed,
             change the number to a random value between 1 and 100.
------------------------------------------------------------------------------
   ChangeLog:
   Who:      Nhi Nguyen            Date:     Feb 21, 2023
   Desc.:    This is the original version of the code.  
------------------------------------------------------------------------------
*/

package nhinguyen_is221_ch4_pp4_12;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NhiNguyen_IS221_Ch4_PP4_12 extends Application {
    private Text txt_numberText;
    
    @Override
    public void start(Stage primaryStage) {
        Button randomButton = new Button("Generate Random Number");
        randomButton.setOnAction(e -> generateRandomNumber());
        
        txt_numberText = new Text("0");
        txt_numberText.setFont(new Font(50));
        
        FlowPane pane = new FlowPane(randomButton, txt_numberText);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: white");
        
        Scene myScene = new Scene(pane, 300, 200);
        primaryStage.setScene(myScene);
        primaryStage.show();
    }    
    
    private void generateRandomNumber() {
        int int_randomNumber = new Random().nextInt(1, 101);
        txt_numberText.setText(String.valueOf(int_randomNumber));
    }
    public static void main(String[] args) {
        launch(args);
    }

}
