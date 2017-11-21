import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Interfase {
    private static final int VERTEXCOUNT = 5;
    private static final int CIRCLECOUNT = 2;

    public void Interfase (Pane root) {
        TextField textCenterX = new TextField();
        textCenterX.setPromptText(" Enter the X center of the star -");
        textCenterX.setPrefColumnCount(9);
        textCenterX.setTranslateX(10);
        textCenterX.setTranslateY(10);

        TextField textCenterY = new TextField();
        textCenterY.setPromptText(" Enter the Y center of the star -");
        textCenterY.setPrefColumnCount(9);
        textCenterY.setTranslateX(10);
        textCenterY.setTranslateY(45);

        TextField textRadius = new TextField();
        textRadius.setPromptText(" Enter the radius of the star -");
        textRadius.setPrefColumnCount(9);
        textRadius.setTranslateX(10);
        textRadius.setTranslateY(80);

        Label labelStatus = new Label("Введите параметры");
        labelStatus.setTranslateX(10);
        labelStatus.setTranslateY(115);

        Button buttonDraw = new Button("Отрисовать");
        buttonDraw.setTranslateX(145);
        buttonDraw.setTranslateY(10);

        Button buttonClear = new Button("Очистить");
        buttonClear.setTranslateX(145);
        buttonClear.setTranslateY(45);

        Button buttonClose = new Button("Закрыть");
        buttonClose.setTranslateX(145);
        buttonClose.setTranslateY(80);

        root.getChildren().addAll(textCenterX, textCenterY, textRadius, labelStatus, buttonDraw, buttonClear, buttonClose);

        buttonDraw.setOnAction((ActionEvent event) -> {
            if (textCenterX.getText() == null || textCenterX.getText().isEmpty()) {
                labelStatus.setText("Введите X центра звезды");
                return;
            }

            if (textCenterY.getText() == null || textCenterY.getText().isEmpty()) {
                labelStatus.setText("Введите Y центра звезды");
                return;
            }

            if (textRadius.getText() == null || textRadius.getText().isEmpty()) {
                labelStatus.setText("Введите радиус звезды");
                return;
            }
        });
    }
}
