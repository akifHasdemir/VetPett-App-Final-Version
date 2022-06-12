package loginPage;

import com.example.vetpetapp.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CreateAccountPageController implements Initializable {
    @FXML
    AnchorPane createAccountPanel;
    @FXML
    public TextField userNameTF,passwordTF,clinicNoTF;

    PageNavigator navigator = new PageNavigator();

    @FXML
    protected void signIn() throws IOException {
        String userName = userNameTF.getText();
        String password = passwordTF.getText();
        String clinicNo = clinicNoTF.getText();
        if (Control.signInControl(userName,password,clinicNo)){
            System.out.println("Registration Successful");//sa sdasd
            navigator.goToPage("loginPage/welcomePage.fxml");
        }
//        System.out.printf(userList.getUserList().get(0).getUserName() + ""+ userList.getUserList().get(0).getPassword()+ "" + User.isVet);
    }
    @FXML
    protected void cancel() throws IOException {
        navigator.goToPage("loginPage/welcomePage.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
