package loginPage;

import com.example.vetpetapp.Control;
import com.example.vetpetapp.PageNavigator;
import com.example.vetpetapp.User;
import com.example.vetpetapp.UserList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginPageController {
    @FXML
    TextField userNameTF,passwordTF;

    PageNavigator navigator = new PageNavigator();


    @FXML
    protected void login() throws IOException {
        String userName = userNameTF.getText();
        String password = passwordTF.getText();
        if (userName.isEmpty() || password.isEmpty() ){
            System.out.println("you must fill the fields");
        }else if (Control.loginControl(userName,password)){
            navigator.goToPageNS("/userApplication/homePage.fxml");
        }else{
            System.out.println("User not found");
        }

    }
    @FXML
    protected void register () throws IOException {
        navigator.goToPage("loginPage/createAccountPage.fxml");
    }
}
