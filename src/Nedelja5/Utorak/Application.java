package Nedelja5.Utorak;

public class Application {
    public static void main(String[] args) {
        Shape krug = new Circle(new Coordinates(3, 4), 1);

        System.out.println(krug.getArea());
        // sqrt(s * (s-a) * (s-b) * (s-c)
        // s = (a + b + c) / 2
    }
}

