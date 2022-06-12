module com.example.vetpetapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vetpetapp to javafx.fxml;
    exports com.example.vetpetapp;


    exports loginPage;
    opens loginPage to javafx.fxml;



    exports userApplication;
    opens userApplication to javafx.fxml;

    exports vetApplication;
    opens vetApplication to javafx.fxml;
}