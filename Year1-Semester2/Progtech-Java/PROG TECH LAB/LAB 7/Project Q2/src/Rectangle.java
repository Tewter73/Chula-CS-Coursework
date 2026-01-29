public class Rectangle extends Quadrilateral {
    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    @Override
    public double area() {
        double width = getSortedDist()[0];
        double height = getSortedDist()[3];
        return width * height;
    }
}