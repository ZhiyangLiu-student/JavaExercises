import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {

    private TextField display;
    private String operator = "";
    private double firstOperand = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Calculator");

        // Create the display
        display = new TextField();
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setEditable(false);

        // Create number buttons
        Button[] numberButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
        final int digit = i;  // Create a final variable
        numberButtons[i] = new Button(Integer.toString(i));
        numberButtons[i].setOnAction(e -> appendToDisplay(Integer.toString(digit)));
}

        // Create operator buttons
        Button addButton = createOperatorButton("+");
        Button subtractButton = createOperatorButton("-");
        Button multiplyButton = createOperatorButton("*");
        Button divideButton = createOperatorButton("/");

        // Create other buttons
        Button clearButton = createButton("C", "Clear");
        Button equalsButton = createButton("=", "Equals");

        // Layout setup using GridPane
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        // Add display to grid
        gridPane.add(display, 0, 0, 4, 1);

        // Add number buttons to grid
        for (int i = 1; i <= 9; i++) {
            gridPane.add(numberButtons[i], (i - 1) % 3, 1 + (i - 1) / 3);
        }
        gridPane.add(numberButtons[0], 1, 4);

        // Add operator buttons to grid
        gridPane.add(addButton, 3, 1);
        gridPane.add(subtractButton, 3, 2);
        gridPane.add(multiplyButton, 3, 3);
        gridPane.add(divideButton, 3, 4);

        // Add other buttons to grid
        gridPane.add(clearButton, 0, 5);
        gridPane.add(equalsButton, 1, 5, 3, 1);

        // Scene setup
        Scene scene = new Scene(gridPane, 300, 400);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    private Button createButton(String label, String tooltip) {
        Button button = new Button(label);
        button.setTooltip(new javafx.scene.control.Tooltip(tooltip));
        button.setOnAction(e -> handleButtonClick(label));
        return button;
    }

    private Button createOperatorButton(String op) {
        Button button = createButton(op, op);
        button.setStyle("-fx-base: lightgray;");
        return button;
    }

    private void handleButtonClick(String value) {
        switch (value) {
            case "C":
                clearDisplay();
                break;
            case "=":
                calculateResult();
                break;
            default:
                appendToDisplay(value);
                break;
        }
    }

    private void appendToDisplay(String value) {
        display.appendText(value);
    }

    private void clearDisplay() {
        display.clear();
    }

    private void calculateResult() {
        try {
            double secondOperand = Double.parseDouble(display.getText());
            switch (operator) {
                case "+":
                    display.setText(String.valueOf(firstOperand + secondOperand));
                    break;
                case "-":
                    display.setText(String.valueOf(firstOperand - secondOperand));
                    break;
                case "*":
                    display.setText(String.valueOf(firstOperand * secondOperand));
                    break;
                case "/":
                    if (secondOperand != 0) {
                        display.setText(String.valueOf(firstOperand / secondOperand));
                    } else {
                        display.setText("Error");
                    }
                    break;
            }
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }
}