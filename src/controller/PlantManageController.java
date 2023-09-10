package controller;

import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import util.Navigation;

import java.net.URL;
import java.util.ResourceBundle;

public class PlantManageController implements Initializable {
    public JFXRadioButton RBtnPlant;
    public JFXRadioButton rBtnPlantGroup;
    public JFXRadioButton rBtnPlantGroupMaintenance;
    public Pane pane;

    public void plantOnAction(ActionEvent actionEvent) {
        navigateFrom();
    }

    public void plantGroupAction(ActionEvent actionEvent) {
        navigateFrom();
    }

    public void plantGroupMaintenanceOnAction(ActionEvent actionEvent) {
        navigateFrom();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        navigateFrom();
    }

    private void navigateFrom() {
        if (RBtnPlant.isSelected()){
            pane.getChildren().clear();
            Navigation.onTheTopNavigation(pane,"PlantView.fxml");
        }else if (rBtnPlantGroup.isSelected()){
            pane.getChildren().clear();
            Navigation.onTheTopNavigation(pane,"PlantGroupFrom.fxml");
        }else if (rBtnPlantGroupMaintenance.isSelected()){
            pane.getChildren().clear();
            Navigation.onTheTopNavigation(pane,"MaintananceFrom.fxml");
        }
    }
}
