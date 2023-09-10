package controller;

import com.jfoenix.controls.JFXRadioButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import util.Navigation;
import view.tm.EmployeeTm;


import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeDashboardController implements Initializable {


    public JFXRadioButton RBtnEmployee;
    public JFXRadioButton rBtnAttendance;
    public Pane pane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
/*


        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colFist.setCellValueFactory(new PropertyValueFactory<>("fist"));
        colLast.setCellValueFactory(new PropertyValueFactory<>("last"));
        tblHandle.setCellValueFactory(new PropertyValueFactory<>("handle"));
        tblRemove.setCellValueFactory(new PropertyValueFactory<>("remove"));
        tblUpdate.setCellValueFactory(new PropertyValueFactory<>("update"));
        tblEmployee.setItems(list);

        for (int i = 0; i < 10; i++) {
            Button remove = remove();
            Button update = update();
            EmployeeTm tm = new EmployeeTm("1", "Mark", "Otto", "@mdo", remove, update);
            System.out.println(tm.toString());
            list.add(tm);

        }

*/
        rBtnAction();
    }

    public void newOnAction(ActionEvent actionEvent) {
       Navigation.popupNavigation("EmployeeAddFrom.fxml");
    }

    public void employeeRBtnOnAction(ActionEvent actionEvent) {
      rBtnAction();
    }

    private void rBtnAction() {
        if (RBtnEmployee.isSelected()){
            pane.getChildren().clear();
            Navigation.onTheTopNavigation(pane,"Emplyoyee.fxml");
        }else if (rBtnAttendance.isSelected()){
            pane.getChildren().clear();
            Navigation.onTheTopNavigation(pane,"EmployeeAttendance.fxml");
        }
    }

    public void employeeAttendanceRBtnOnAction(ActionEvent actionEvent) {
rBtnAction();
    }
/*
    private Button update() {
        update = new Button();
        update.setVisible(false);
        update.setAlignment(Pos.CENTER);
        update.setMinWidth(20);
        update.setStyle("\n" +
                "    -fx-background-color:\n" +
                "            linear-gradient(#2acff8, #2cfc7f),\n" +
                "            linear-gradient(#2aee62 0%, #0977ff 20%, #00ff37 100%),\n" +
                "            linear-gradient(#ffffff 0%, #ffffff 50%);\n" +
                "    -fx-background-radius: 8,7,6;\n" +
                "    -fx-background-insets: 0,1,2;\n" +
                "    -fx-text-fill: white;\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-background-radius: 100;\n" +
                "    -fx-effect: dropshadow( three-pass-box , #2af887, 10, 0.0 , 0 , 1 );\n"

        );
        ImageView view = new ImageView("/view/img/icons8-update-48.png");
        view.setFitHeight(20);
        view.setFitWidth(20);
        update.setGraphic(view);
        return update;
    }

    private Button remove() {
        remove = new Button();
        remove.setAlignment(Pos.CENTER);
        remove.setMinWidth(20);
        remove.setStyle("\n" +
                "    -fx-background-color:\n" +
                "            linear-gradient(#2acff8, #fc2c2c),\n" +
                "            linear-gradient(#ee2a57 0%, #0977ff 20%, #ff4a00 100%),\n" +
                "            linear-gradient(#ffffff 0%, #ffffff 50%);\n" +
                "    -fx-background-radius: 8,7,6;\n" +
                "    -fx-background-insets: 0,1,2;\n" +
                "    -fx-text-fill: white;\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-background-radius: 100;\n" +
                "    -fx-effect: dropshadow( three-pass-box , #f82a5a, 10, 0.0 , 0 , 1 );\n"

        );
        ImageView view = new ImageView("/view/img/icons8-remove-64.png");
        view.setFitHeight(20);
        view.setFitWidth(20);
        remove.setGraphic(view);
        return remove;
    }

    public void onMouseEnterd(MouseEvent mouseEvent) {

       EmployeeTm tm= (EmployeeTm) tblEmployee.getSelectionModel().getSelectedItem();
        System.out.println(tm.toString());
    }

    public void onMouseExited(MouseEvent mouseEvent) {
        update.setVisible(false);
    }*/
}
