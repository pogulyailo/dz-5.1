import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class FxMain extends Application {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    public static void main(String[] args) {
        launch(args);


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        Interfase Interfase = new  Interfase();
        primaryStage.setScene(new Scene(root));
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.show();

        }
}