package validation;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.web.HTMLEditor;

public class ValidateCours {

    public static boolean isNotEmpty(TextField textField, Label validationLabel, String errorStyleClass ) {


        if (textField.getText() == null || textField.getText().trim().isEmpty()) {


            if (validationLabel != null) {
                validationLabel.setText("le champ de texte ne peut pas être vide");
                validationLabel.getStyleClass().add("errorLabel");
                validationLabel.setVisible(true);

            }
            if (errorStyleClass != null && !errorStyleClass.isEmpty()) {
                textField.getStyleClass().add(errorStyleClass);
            }
            return false;
        } else {
            if (validationLabel != null) {
                validationLabel.setVisible(false);
            }
            if (errorStyleClass != null && !errorStyleClass.isEmpty()) {
                textField.getStyleClass().remove(errorStyleClass);
            }
            return true;
        }
    }

    public static boolean isNotEmptyTextErea(TextArea textField, Label validationLabel, String errorStyleClass ) {


        if (textField.getText() == null || textField.getText().trim().isEmpty()) {


            if (validationLabel != null) {
                validationLabel.setText("Input cannot be empty");
                validationLabel.setVisible(true);
            }
            if (errorStyleClass != null && !errorStyleClass.isEmpty()) {
                textField.getStyleClass().add(errorStyleClass);
            }
            return false;
        } else {
            if (validationLabel != null) {
                validationLabel.setVisible(false);
            }
            if (errorStyleClass != null && !errorStyleClass.isEmpty()) {
                textField.getStyleClass().remove(errorStyleClass);
            }
            return true;
        }
    }

    public static boolean isNotEmptySelectErea(ComboBox textField, Label validationLabel, String errorStyleClass ) {


        if (textField.getSelectionModel().getSelectedItem()== null || textField.getSelectionModel().getSelectedItem().toString().trim().isEmpty()) {


            if (validationLabel != null) {
                validationLabel.setText("Input cannot be empty");
                validationLabel.setVisible(true);
            }
            if (errorStyleClass != null && !errorStyleClass.isEmpty()) {
                textField.getStyleClass().add(errorStyleClass);
            }
            return false;
        } else {
            if (validationLabel != null) {
                validationLabel.setVisible(false);
            }
            if (errorStyleClass != null && !errorStyleClass.isEmpty()) {
                textField.getStyleClass().remove(errorStyleClass);
            }
            return true;
        }
    }




    public static boolean isNotHTML(HTMLEditor textField, Label validationLabel, String errorStyleClass ) {


        if (textField.getHtmlText() == null || textField.getHtmlText().trim().isEmpty()) {


            if (validationLabel != null) {
                validationLabel.setText("le champ de texte ne peut pas être vide");
                validationLabel.getStyleClass().add("errorLabel");
                validationLabel.setVisible(true);

            }
            if (errorStyleClass != null && !errorStyleClass.isEmpty()) {
                textField.getStyleClass().add(errorStyleClass);
            }
            return false;
        } else {
            if (validationLabel != null) {
                validationLabel.setVisible(false);
            }
            if (errorStyleClass != null && !errorStyleClass.isEmpty()) {
                textField.getStyleClass().remove(errorStyleClass);
            }
            return true;
        }
    }


    public static boolean isNotEmptyNumber(TextField textField, Label validationLabel, String errorStyleClass) {
        String text = textField.getText();
        if (text == null || text.trim().isEmpty()) {
            if (validationLabel != null) {
                validationLabel.setText("Le champ de texte ne peut pas être vide");
                validationLabel.getStyleClass().add("errorLabel");
                validationLabel.setVisible(true);
            }
            if (errorStyleClass != null && !errorStyleClass.isEmpty()) {
                textField.getStyleClass().add(errorStyleClass);
            }
            return false;
        } else if (!text.matches("\\d+")) { // Checks if the text consists only of numeric characters
            if (validationLabel != null) {
                validationLabel.setText("Le champ de texte doit contenir uniquement des chiffres");
                validationLabel.getStyleClass().add("errorLabel");
                validationLabel.setVisible(true);
            }
            if (errorStyleClass != null && !errorStyleClass.isEmpty()) {
                textField.getStyleClass().add(errorStyleClass);
            }
            return false;
        } else {
            if (validationLabel != null) {
                validationLabel.setVisible(false);
            }
            if (errorStyleClass != null && !errorStyleClass.isEmpty()) {
                textField.getStyleClass().remove(errorStyleClass);
            }
            return true;
        }
    }


}
