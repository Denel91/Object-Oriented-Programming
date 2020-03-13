package Type_Hierarchy;

public class Rect implements TwoDShape {
    protected double width, height;

    public Rect() { // di default
        width = height = 1; // rettangolo con larghezza e altezza di un'unità.
    }

    public double getBase() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setBase(int b) {
        this.width = b;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public double area() {
        return (this.getBase() * this.getHeight());
    }

    public double perimeter() {
        return (2 * this.getBase() + this.getHeight());
    }

    @Override
    public String getType() {
        return "I'm a Rectangle";
    }

    @Override
    public String toString() {
        String s = String.format("RECTANGLE %.2f * %.2 f (AREA = %.2f) (PERIMETER = %.2f)", this.getBase(),
                this.getHeight(),
                this.area(), this.perimeter());
        return s;
    }
}
