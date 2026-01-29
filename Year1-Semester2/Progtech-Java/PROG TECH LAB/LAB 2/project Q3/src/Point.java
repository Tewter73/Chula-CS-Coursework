public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherPoint) {
        double deltaX = this.x - otherPoint.x;
        double deltaY = this.y - otherPoint.y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public void translate(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public boolean equals(Point otherPoint) {
        return this.x == otherPoint.x && this.y == otherPoint.y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}