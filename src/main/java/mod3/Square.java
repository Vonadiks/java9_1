package mod3;

public class Square implements Figure{
    private int side;

    public int getSide(){
        return side;
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void createFigure() {
        System.out.println("Square with side " + getSide() + " is created.");
    }
}
