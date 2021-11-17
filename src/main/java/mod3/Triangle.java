package mod3;

public class Triangle implements Figure {
    int firstSide;
    int secondSide;
    int thirdSide;

    public int getFirstSide(){
        return firstSide;
    }

    public int getSecondSide(){
        return secondSide;
    }

    public int getThirdSide(){
        return thirdSide;
    }

    Triangle(int firstSide, int secondSide, int thirdSide) {
       this.firstSide = firstSide;
       this.secondSide = secondSide;
       this.thirdSide = thirdSide;
    }

    @Override
    public void createFigure() {
        System.out.println("Triangle with sides " + getFirstSide() +  ", " + getSecondSide() +  ", " + getThirdSide() + " is created.");
    }
}
