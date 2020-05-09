

package nsmsfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.*;

class NewStage {
    
    NewStage()
    {
        Label label1 = new Label("Name:");
        TextField textField = new TextField ();
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField);
        hb.setSpacing(10);
        //Creating a GridPane container
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);
//Defining the Name text field
        final TextField name = new TextField();
        name.setPromptText("Enter your first name.");
        name.setPrefColumnCount(10);
        name.getText();
        GridPane.setConstraints(name, 0, 0);
        grid.getChildren().add(name);
//Defining the Last Name text field
        final TextField lastName = new TextField();
        lastName.setPromptText("Enter your last name.");
        GridPane.setConstraints(lastName, 0, 1);
        grid.getChildren().add(lastName);
//Defining the Comment text field
        final TextField comment = new TextField();
        comment.setPrefColumnCount(15);
        comment.setPromptText("Enter your comment.");
        GridPane.setConstraints(comment, 0, 2);
        grid.getChildren().add(comment);
//Defining the Submit button
        Button submit = new Button("Submit");
        GridPane.setConstraints(submit, 1, 0);
        grid.getChildren().add(submit);
//Defining the Clear button
        Button clear = new Button("Clear");
        GridPane.setConstraints(clear, 1, 1);
        grid.getChildren().add(clear);
        
        
        
        
        Adding a Label
final Label label = new Label();
GridPane.setConstraints(label, 0, 3);
GridPane.setColumnSpan(label, 2);
grid.getChildren().add(label);

//Setting an action for the Submit button
submit.setOnAction(new EventHandler<ActionEvent>() {

@Override
    public void handle(ActionEvent e) {
        if ((comment.getText() != null && !comment.getText().isEmpty())) {
            label.setText(name.getText() + " " + lastName.getText() + ", "
                + "thank you for your comment!");
        } else {
            label.setText("You have not left a comment.");
        }
     }
 });
 
//Setting an action for the Clear button
clear.setOnAction(new EventHandler<ActionEvent>() {

@Override
    public void handle(ActionEvent e) {
        name.clear();
        lastName.clear();
        comment.clear();
        label.setText(null);
    }
});
    }
}

class LGMS {
    LGMS()
    {
        Stage subStage = new Stage();
        subStage.setTitle("Logistics Management System");
                
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 300, 200);
        
        root.getChildren().add(new Button("Coaches"));
         root.getChildren().add(new Button("Players "));
        
        
        subStage.setScene(scene);
        subStage.show();
    }
}
class GMS {
    GMS()
    {
        Stage subStage = new Stage();
        subStage.setTitle("Games Management System");
                
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 300, 200);
        
        root.getChildren().add(new Button("New Stage"));
        subStage.setScene(scene);
        subStage.show();
    }
}
class sportsDef {
    sportsDef()
    {
    Stage subStage = new Stage();

        subStage.setTitle("Coach Data");
        
        Text menuText = new Text("Please enter the following Sports Defintion data \n ");
        
        TextField number = new TextField("Sports Defintion Code");
         TextField description = new TextField("Sports Defintion Description");
         TextField units = new TextField("Sports Defintion Units");
         GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(menuText,0,1);
        gridPane.add(number,0,1);
        gridPane.add(description,0,1);
         gridPane.add(units,0,1);
         
      
        Button button = new Button("Click To Enter Sports Def Data");
        gridPane.add(button,0,8); 
        //  SportsDefinition sportDef = new SportsDefinition();
        //int num = sportsDef.getUnit(Integer.parseInt(number.getText()));
       // String fname = sportsDef.get_fName(fName.getText());
       // String mname = sportsDefmIntial.getText();
       
        
        button.setOnAction(action -> {
           
            
            SportsDefinition[] sportsDef = new SportsDefinition[100];
            
       int code =  Integer.parseInt(number.getText());
       String descrip =  description.getText();
       String unit =  units.getText();
        //sportsDef[i] = new SportsDefinition(code,descrip,unit);
        //    } 
        });
        	
        Scene scene = new Scene(gridPane, 700, 400);
        
        subStage.setTitle("NSMS - Main Menu");
        subStage.setScene(scene);
        subStage.show();
    }
}

class coach {
    coach()
    {
        Stage subStage = new Stage();

        
        //Coach coach = new Coach();
        subStage.setTitle("Coach Data");
        
        Text menuText = new Text("Please enter the following Coach data \n ");
       
        
        TextField number = new TextField("Coaches Number");
       
        TextField fName = new TextField("Coaches first Name");
        TextField mIntial = new TextField("Coaches middle Name");
        TextField lName = new TextField("Coaches last Name");
         TextField tele = new TextField("Coaches Telephone number ");
         TextField email = new TextField("Coaches Email");
         TextField teamCode = new TextField("Coaches Team Code ");
         
         
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        
        gridPane.setAlignment(Pos.CENTER);
        
    
        
        gridPane.add(menuText,0,1);
       
       
        gridPane.add(number,0,2);
        gridPane.add(fName,0,3);
        gridPane.add(mIntial,0,4);
        gridPane.add(lName,0,5);
        gridPane.add(tele,0,6);
        gridPane.add(email,0,7);
        gridPane.add(teamCode,0,8);
       
     
        
//        coach(number,fName, mIntial,lName,tele,email,teamCode);
            
        Button button = new Button("Click To Enter Coaches Data");
        
        button.setOnAction(action -> {
        
        
        //coach(num,fname,mname,lname,telse,mail,teamcode);
        //coach.toString();
     });
        //int num = coach.get_number(Integer.parseInt(number.getText()));
       // String fname = coach.get_fName(fName.getText());
        String mname = mIntial.getText();
        String lname = lName.getText();
        long telse = Long.parseLong(tele.getText());
        String mail = email.getText();
        String teamcode = teamCode.getText();
        
       //Coach coach = new Coach(num,fname,mname,lname,telse,mail,teamcode);
       
       //coach.toString();
        
       
        
        gridPane.add(button,1,10);
       
        Scene scene = new Scene(gridPane, 700, 400);
        
        subStage.setTitle("NSMS - Main Menu");
        subStage.setScene(scene);
        subStage.show();
    }
}

class player {
    player()
    {
        Stage subStage = new Stage();
        subStage.setTitle("Logistics Management System");
        Text menuText = new Text("Please enter the following player data");
                
          TextField textField = new TextField();
          Button button = new Button("Click to get text");
       
        button.setOnAction(action -> {
            System.out.println(textField.getText());
        });
        
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        
        gridPane.setAlignment(Pos.CENTER);
        
        gridPane.add(menuText,0,1);
        gridPane.add(textField,0,2);
        gridPane.add(button,1,2);
       
        Scene scene = new Scene(gridPane, 700, 400);
        
        subStage.setTitle("NSMS - Main Menu");
        subStage.setScene(scene);
        subStage.show();
    }
}


public class NSMSFX extends Application {
    
    public static void main(String[] args) {
        
        Application.launch(args);
    }
    
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Main Menu");
        
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 700, 200);
      
        Button btn = new Button("Sports Defintion");
        Button btn2 = new Button("Player");
        Button btn3 = new Button("Coach");
        Button btn4 = new Button("Test");
        
        btn.setOnAction(eve-> new sportsDef());
        btn2.setOnAction(eve-> new player());
        btn3.setOnAction(eve-> new coach());
        btn4.setOnAction(eve-> new NewStage());
        
        
        root.getChildren().add(btn);
         root.getChildren().add(btn2);
         root.getChildren().add(btn3);
         root.getChildren().add(btn4);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
    