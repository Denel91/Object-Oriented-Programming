package Type_Hierarchy;

public class ShapeTest {
    public static void main(String[] args) {
        Rect r1 = new Rect();
        Rect r2 = new Square();
        Square s1 = new Square();

        fillAndPrint(r1, 4, 5);
        fillAndPrint(r2, 5, 6);
        fillAndPrint(s1, 5, 5);
    }

    private static void fillAndPrint(Rect r1, int b, int h) {
        System.out.format("b = %d h = %d ", b, h);
        r1.setBase(b);
        r1.setHeight(h);
        System.out.println(r1);
    }
}
