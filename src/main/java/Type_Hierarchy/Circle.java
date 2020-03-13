package Type_Hierarchy;

public class Circle implements TwoDShape {
    final double PI = Math.PI;
    protected int radius;

    public Circle() {
        this.radius = 1; // raggio di misura unitaria
    }

    public int getRadius() {
        return radius;
    }

    public int setRadius(int r) {
        return this.radius = r;
    }

    @Override
    public double area() {
        return (PI * radius * radius);
    }

    @Override
    public double perimeter() {
        return (int) (2 * PI * radius);
    }

    @Override
    public String toString() {
        String s = String.format("CIRCLE: (RADIUS = %d) (AREA = %.2f) (PERIMETER = %.2f)", this.getRadius(),
                this.area(),
                this.perimeter());
        return s;
    }

    @Override
    public String getType() {
        return "I'm a Circle";
    }
}
