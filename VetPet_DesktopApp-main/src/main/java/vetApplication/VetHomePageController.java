package vetApplication;

import com.example.vetpetapp.PageNavigator;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class VetHomePageController implements Initializable {
    @FXML
    AnchorPane changingPanel;

    PageNavigator navigator = new PageNavigator();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    protected void goToMyProfile() throws IOException {
      navigator.changePanel(changingPanel,"vetApplication/vetProfile.fxml");
    }

    @FXML
    protected void goToAppointments() throws IOException {
        AnchorPane petPane = FXMLLoader.load(getClass().getResource("userApplication/petPage.fxml"));
        changingPanel.getChildren().setAll(petPane);

    }
}
