package vetApplication;

import com.example.vetpetapp.Clinic;
import com.example.vetpetapp.PageNavigator;
import com.example.vetpetapp.Vet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class VetProfileController implements Initializable {

    @FXML
    private TextField clinicName,clinicAddress,clinicCity,clinicDistrict,clinicBio;
    @FXML
    private Label clinicNameLabel,clinicAddressLabel, clinicCityLabel, clinicDistrictLabel, clinicBioLabel;

    //Clinic clinic;

    public Label getClinicNameLabel() {
        return clinicNameLabel;
    }

    public void setClinicNameLabel(Label clinicNameLabel) {
        this.clinicNameLabel = clinicNameLabel;
    }

    public Label getClinicAddressLabel() {
        return clinicAddressLabel;
    }

    public void setClinicAddressLabel(Label clinicAddressLabel) {
        this.clinicAddressLabel = clinicAddressLabel;
    }

    public Label getClinicCityLabel() {
        return clinicCityLabel;
    }

    public void setClinicCityLabel(Label clinicCityLabel) {
        this.clinicCityLabel = clinicCityLabel;
    }

    public Label getClinicDistrictLabel() {
        return clinicDistrictLabel;
    }

    public void setClinicDistrictLabel(Label clinicDistrictLabel) {
        this.clinicDistrictLabel = clinicDistrictLabel;
    }

    public Label getClinicBioLabel() {
        return clinicBioLabel;
    }

    public void setClinicBioLabel(Label clinicBioLabel) {
        this.clinicBioLabel = clinicBioLabel;
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}

    @FXML
    public void updateProfile() {
//
//        vet.getClinic().setClinicName(clinicName.getText());
//        vet.getClinic().setClinicAddress(clinicAddress.getText());
//        vet.getClinic().setClinicCity(clinicCity.getText());
//        vet.getClinic().setClinicDistrict(clinicDistrict.getText());
//        vet.getClinic().setClinicBio(clinicBio.getText());
//
//        getClinicNameLabel().setText(vet.getClinic().getClinicName());
//        getClinicAddressLabel().setText((vet.getClinic().getClinicAddress()));
//        getClinicCityLabel().setText((vet.getClinic().getClinicCity()));
//        getClinicDistrictLabel().setText((vet.getClinic().getClinicDistrict()));
//        getClinicBioLabel().setText((vet.getClinic().getClinicBio()));

    }
    @FXML
    void goToVetHomePage(ActionEvent event) throws IOException {
        PageNavigator navigator = new PageNavigator();
        navigator.goToPage("vetApplication/vetHomePage.fxml");
    }


}
