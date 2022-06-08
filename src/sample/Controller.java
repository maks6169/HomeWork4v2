package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;

public class Controller {
    public javafx.scene.control.TextField userAnswer;
    public javafx.scene.control.TextArea historyArea;
    @FXML
    private sample.Controller TextArea;
    @FXML
    private sample.Controller TextField;


    public void clickCheckButton(ActionEvent actionEvent) {
        final String answer = userAnswer.getText();
        if (answer.isEmpty()) {
            return;
        }

        String text = String.format("%s", answer);
        historyArea.appendText(text + "\n");
        userAnswer.clear();
        userAnswer.requestFocus();
    }
}
