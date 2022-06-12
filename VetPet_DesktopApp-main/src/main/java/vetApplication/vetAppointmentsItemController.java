package vetApplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class vetAppointmentsItemController {

    @FXML
    private Label petName;

    @FXML
    private HBox vetAppointmentItemBox;

    public vetAppointmentsItemController(Label petName, HBox vetAppoitmentItemBox) {
        this.petName = petName;
        this.vetAppointmentItemBox = vetAppoitmentItemBox;
    }

    @FXML
    void editVetStatus(ActionEvent event) {

    }

    @FXML
    void removeAppointment(ActionEvent event) {

    }

}
