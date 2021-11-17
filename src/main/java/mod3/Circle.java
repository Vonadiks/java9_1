package mod3;

public class Circle implements Figure{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    @Override
    public void createFigure() {
        System.out.println("Circle with radius " + getRadius() + " is created.");
    }
}
