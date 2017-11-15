import javafx.scene.shape.Line;

public class Star {
    float centrX = 0;
    float centrY = 0;


    Line[] star = new Line[]{
            new Line(centrX + 0, centrY + 5, centrX + 2, centrY + 2),
            new Line(centrX + 2, centrY + 2, centrX + 5, centrY + 2),
            new Line(centrX + 5, centrY + 2, centrX + 3, centrY + (-3)),
            new Line(centrX + 3, centrY + (-3), centrX + 4, centrY + (-5)),
            new Line(centrX + 4, centrY + (-5), centrX + 0, centrY + (-3)),
            new Line(centrX + 0, centrY + (-3), centrX + (-4), centrY + (-5)),
            new Line(centrX + (-4), centrY + (-5), centrX + (-3), centrY + (-3)),
            new Line(centrX + (-3), centrY + (-3), centrX + (-5), centrY + 2),
            new Line(centrX + (-5), centrY + 2, centrX + (-2), centrY + 2),
            new Line(centrX + (-2), centrY + 2, centrX + 0, centrY + 5),

}
