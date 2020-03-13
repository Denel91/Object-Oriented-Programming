package Type_Hierarchy;

public class Square extends Rect {

    public Square() {
        super();
    }

    public double getSide() {
        return this.width;
    }

    @Override
    public void setBase(int b) {
        super.setBase(b);
        this.height = b;
    }

    @Override
    public void setHeight(int h) {
        super.setHeight(h);
        this.width = h;
    }

    @Override
    public String toString() {
        String s = String.format("SQUARE %.2f * %.2f (AREA = %.2f) (PERIMETER = %.2f)", this.getBase(), this.getSide(),
                this.area(), this.perimeter());
        return s;
    }

    @Override
    public String getType() {
        return "I'm a Square";
    }
}
