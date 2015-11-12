package patterns.structural.bridge;

/*concrete class implementing the Shape interface*/

public class Circle extends Shape {
    private int radius;
    private int x;
    private int y;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}