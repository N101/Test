package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    public Button btnButton;
    public TextField txtPrinter;
    public Model model = new Model();
    public Label lblLable;

    public void HandleActionButton(ActionEvent actionEvent) {
        model.increment();
        lblLable.setText(String.valueOf(model.getCount()));
    }




}
