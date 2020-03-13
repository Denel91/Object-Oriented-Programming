package Type_Hierarchy;

public class TestHierarchy {
    public static void main(String[] args) {
        Rect rect = new Rect();
        Square square = new Square();
        Circle circle = new Circle();

        rect.setBase(5);
        rect.setHeight(4);
        rect.area();
        rect.perimeter();
        System.out.println(rect.toString());

        square.setBase(5);
        square.area();
        square.perimeter();
        System.out.println(square.toString());

        circle.setRadius(5);
        circle.area();
        circle.perimeter();
        System.out.println(circle.toString());
    }
}
