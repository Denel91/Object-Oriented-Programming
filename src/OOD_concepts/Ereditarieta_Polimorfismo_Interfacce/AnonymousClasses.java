package OOD_concepts.Ereditarieta_Polimorfismo_Interfacce;

public class AnonymousClasses {

    // mostra l'area e il perimetro di un oggetto TwoDShape
    public static void doShape(TwoDShape s) {
        System.out.printf("Area: %d Perimetro: %d%n", s.area(), s.perimeter());
    }

    public static void main(String[] args) {

        // classe anonima che implementa l'interfaccia TwoDShape
        doShape(new Rectangle(new Point2D(5, 5), 20, 40) {
            @Override
            public int area() {
                return width * height;
            }

            @Override
            public int perimeter() {
                return 2 * width + 2 * height;
            }

            @Override
            public void draw() {
                System.out.println("Draw...");
            }
        });
    }
}
