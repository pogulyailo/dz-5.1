import java.util.ArrayList;
import javafx.scene.layout.Pane;

public class Star {
    private final int vertexCount;
    private final int circleCount;
    private final CoordinatesPoint center;
    private final int radius;

    private ArrayList<DrawLine> lineArrayList;

    public Star(int vertexCount, int circleCount, CoordinatesPoint center, int radius) {
        this.vertexCount = vertexCount;
        this.circleCount = circleCount;
        this.center = center;
        this.radius = radius;
    }

    // draw star
    public void draw(Pane root) {
        if (lineArrayList == null) lineArrayList = linesFinder();

        for (DrawLine line : lineArrayList) line.Draw(root);
    }

    private ArrayList<DrawLine> linesFinder() {
        // inner radius
        double inRadius = radius * Math.cos(Math.PI * circleCount / vertexCount) /
                Math.cos(Math.PI * (circleCount - 1) / vertexCount);

        // find all vertexes
        ArrayList<CoordinatesPoint> vertexArrayList = new ArrayList<>();
        int angle = -90;

        for (int i = 0; i < vertexCount * circleCount; i++) {
            if (i % 2 == 0) {
                double tempX = center.getX() + inRadius * Math.cos(angle * Math.PI / 180);
                double tempY = center.getY() - inRadius * Math.sin(angle * Math.PI / 180);

                vertexArrayList.add(new CoordinatesPoint(tempX, tempY));
            } else {
                double tempX = center.getX() + radius * Math.cos(angle * Math.PI / 180);
                double tempY = center.getY() - radius * Math.sin(angle * Math.PI / 180);

                vertexArrayList.add(new CoordinatesPoint(tempX, tempY));
            }
            angle += 180 / vertexCount;
        }

        // find all sides
        ArrayList<DrawLine> lines = new ArrayList<>();

        for (int i = 0; i < vertexArrayList.size() - 1; i++)
            lines.add(new DrawLine(vertexArrayList.get(i), vertexArrayList.get(i + 1)));
        lines.add(new DrawLine(vertexArrayList.get(0), vertexArrayList.get(vertexArrayList.size() - 1)));

        return lines;
    }

    // hide star
    public void clear(Pane root) {
        if (lineArrayList != null)
            for (DrawLine line : lineArrayList)
                lineArrayList.clear();
    }
}


//float centrX = 0;
//float centrY = 0;

   /* Line[] star = new Line[]{
            new Line(centrX + 0, centrY + 5, centrX + 2, centrY + 2),
            new Line(centrX + 2, centrY + 2, centrX + 5, centrY + 2),
            new Line(centrX + 5, centrY + 2, centrX + 3, centrY + (-3)),
            new Line(centrX + 3, centrY + (-3), centrX + 4, centrY + (-5)),
            new Line(centrX + 4, centrY + (-5), centrX + 0, centrY + (-3)),
            new Line(centrX + 0, centrY + (-3), centrX + (-4), centrY + (-5)),
            new Line(centrX + (-4), centrY + (-5), centrX + (-3), centrY + (-3)),
            new Line(centrX + (-3), centrY + (-3), centrX + (-5), centrY + 2),
            new Line(centrX + (-5), centrY + 2, centrX + (-2), centrY + 2),
            new Line(centrX + (-2), centrY + 2, centrX + 0, centrY + 5), */
