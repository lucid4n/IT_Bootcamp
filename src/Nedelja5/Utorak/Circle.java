package Nedelja5.Utorak;

public class Circle extends Shape {

    private double r;

    public Circle(Coordinates startCoordinates, double r) {
        super(startCoordinates, 2 * r, 2 * r);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return r * r * Math.PI;
    }
}



