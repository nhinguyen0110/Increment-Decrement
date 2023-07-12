/*
------------------------------------------------------------------------------
   Name:     NhiNguyen_IS221_Ch4_PP4_14
   Author:   Nhi Nguyen
   Date:     Feb 21, 2023
   Language: Java
   Purpose:  The purpose of this program is to write a JavaFX application that
             presents two buttons and a number (initially 50) to the user. When
             the increment button is push, increment the displayed value. 
             Likewise, decrement the value when the decrement button is pushed.
------------------------------------------------------------------------------
   ChangeLog:
   Who:      Nhi Nguyen            Date:     Feb 21, 2023
   Desc.:    This is the original version of the code.  
------------------------------------------------------------------------------
*/

package nhinguyen_is221_ch4_pp4_14;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NhiNguyen_IS221_Ch4_PP4_14 extends Application {
    private int int_number = 50;
    private Text txt_numberText;
    
    @Override
    public void start(Stage primaryStage) {
        Button incrementButton = new Button("Increment");
        incrementButton.setOnAction(dee -> incrementNumber());
        Button decrementButton = new Button("Decrement");
        decrementButton.setOnAction(e -> decrementNumber());
        
        txt_numberText = new Text(String.valueOf(int_number));
        txt_numberText.setFont(new Font(50));
        
        FlowPane pane = new FlowPane(incrementButton, txt_numberText, 
                decrementButton);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setVgap(10);
        pane.setStyle("-fx-background-color: white");
       
        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }    
    
    private void incrementNumber() {
        int_number++;
        txt_numberText.setText(String.valueOf(int_number));
    }
    
    private void decrementNumber() {
        int_number--;
        txt_numberText.setText(String.valueOf(int_number));
    }

    public static void main(String[] args) {
        launch(args);
    }

}
