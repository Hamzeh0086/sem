package sample;


        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.CheckBox;
        import javafx.scene.control.Label;
        import javafx.scene.layout.AnchorPane;
        import javafx.stage.Stage;

        import java.awt.event.ActionEvent;
        import java.io.IOException;

public class UserViewController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button userButton;

    @FXML
    private Button btnOrder;

    public void btnOrder(javafx.event.ActionEvent actionEvent) {
    }

    @FXML
    private Button btnDeleteUserView;

    public void btnDeleteUserView(javafx.event.ActionEvent actionEvent) {
    }

   /* @FXML
    private void changeToAdminView() throws IOException {
      Main.changeView("adminview.fxml");
    }
   private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }*/

}

