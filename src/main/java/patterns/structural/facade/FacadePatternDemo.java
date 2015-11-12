package patterns.structural.facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        //use the facade to draw various types of shapes
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
        shapeMaker.drawCircle();
    }
}