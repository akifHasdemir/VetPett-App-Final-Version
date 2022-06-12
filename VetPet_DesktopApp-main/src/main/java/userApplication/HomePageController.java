package userApplication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomePageController implements Initializable {
    @FXML
    AnchorPane changingPanel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    protected void goToPetPage() throws IOException {
        AnchorPane petPane = FXMLLoader.load(getClass().getResource("userApplication/petPage.fxml"));
        changingPanel.getChildren().setAll(petPane);
    }

    @FXML
    protected void goToVetPage() throws IOException {
        AnchorPane petPane = FXMLLoader.load(getClass().getResource("userApplication/petPage.fxml"));
        changingPanel.getChildren().setAll(petPane);

    }
}
