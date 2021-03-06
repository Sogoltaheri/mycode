package abchotel;

/**
 * last updated 10/27/20
 *
 * @author Sogol hotel management system
 */
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;

public class ABCHotel extends Application {

    Button registerButton, errorButton;
    TextField emailTextField,nameTextField, numberTextField;
    PasswordField pass, confirmPass;
    Alert errorAlert;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
     
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Create Your Account");
        VBox vbox = new VBox();

        //email label and text field
        Label emailLabel = new Label("Email");
        emailTextField = new TextField();

        //password label and text field
        Label passLabel = new Label("Password");
        final PasswordField pass = new PasswordField();

        //password confirmation label and text field
        Label passConfLabel = new Label("Confirm Password");
        final PasswordField confirmPass = new PasswordField();

        //name label and text field
        Label nameLabel = new Label("What is your name?");
        nameTextField = new TextField();

        //number label and text field
        Label numberLabel = new Label("What is your phone number?");
        numberTextField = new TextField();

        registerButton = new Button("Register");
        //errorButton = new Button("Error!");
        errorAlert = new Alert(AlertType.NONE);

        final Text registerationText = new Text();
        vbox.setSpacing(8);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.getChildren().addAll(emailLabel, emailTextField, passLabel, pass,
                passConfLabel, confirmPass, nameLabel, nameTextField, numberLabel,
                numberTextField, registerButton, registerationText);

//        errorButton.setOnAction(e -> validateFields());
//        {
//            errorAlert.setAlertType(AlertType.ERROR);
//            errorAlert.setContentText("Registration Form Is Not Complete!");
//            errorAlert.show();
//                });
        
        registerButton.setOnAction(e -> {
            if(validateFields()){
                primaryStage.requestFocus();
                registerationText.setFill(Color.GREEN);
                registerationText.setText("success");                
            }
       });
//        registerButton.setOnAction(e -> {
//            if(primaryStage != null)
//                primaryStage.requestFocus();
//                registerationText.setFill(Color.GREEN);
//                registerationText.setText("success");
//            }); 

//        registerButton.setOnAction(e -> {
//            if(emailTextField.getText().isEmpty()){
//                showAlert(Alert.AlertType.ERROR, VBox.getScene().getWindow(),
//                        "Please Enter Your Email");
//                return;        
//            }
//            if(pass.getText().isEmpty()){
//                showAlert(Alert.AlertType.ERROR, VBox.getScene().getWindow(),
//                        "Please Enter Your Password");
//                return; 
//            }
//            if(confirmPass.getText().isEmpty()){
//                showAlert(Alert.AlertType.ERROR, VBox.getScene().getWindow(),
//                        "Please Confirm Your Password");
//                return; 
//            }    
//            if(nameTextField.getText().isEmpty()){
//                showAlert(Alert.AlertType.ERROR, VBox.getScene().getWindow(),
//                        "Please Enter Your Name");
//                return; 
//            }
//            if(numberTextField.getText().isEmpty()){
//                showAlert(Alert.AlertType.ERROR, VBox.getScene().getWindow(),
//                        "Please Enter Your Number");
//                return; 
//            }
//        });
//        registerButton.setOnAction(e -> {
//            
//            
//        });
        Scene scene = new Scene(vbox, 400, 400);
        primaryStage.setTitle("Registration");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    private boolean validateFields(){
        if(emailTextField.getText().isEmpty() || pass.getText().isEmpty() || confirmPass.getText().isEmpty()
                || nameTextField.getText().isEmpty() || numberTextField.getText().isEmpty()){
            errorAlert.setAlertType(AlertType.ERROR);
            errorAlert.setContentText("Registration Form Is Not Complete!");
            errorAlert.show();
                
            return false;
        }
        return true;
        }
    }
    
//    private void getFields(){
//        String emailTextField = emailTextField.getText();
//    }

