import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class DrawLine {
    private CoordinatesPoint p1, p2;
    private Line line;

    public DrawLine(CoordinatesPoint p1, CoordinatesPoint p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void Draw (Pane root) {
        if (line == null) {
            line = new Line();
            root.getChildren().addAll(line);
        }

        line.setStartX(p1.getX());
        line.setStartY(p1.getY());

        line.setEndX(p2.getX());
        line.setEndY(p2.getY());
    }
}
