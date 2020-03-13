package OOD_concepts.Ereditarieta_Polimorfismo_Interfacce;

public class Polymorphism {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point2D(10, 10), 5, 3); // un oggetto Rectangle
        Square square = new Square(new Point2D(50, 50), 3); // un oggetto Square
        Rectangle rec = new Square(new Point2D(0, 0), 5);

        Rectangle rectangle2; // un riferimento di tipo Rectangle
        Square square2; // un riferimento di tipo Square

        String output = "Un tipo Rectangle:\n" + rectangle + " "
                + "\n\nUn tipo Square:\n" + square + "\n";

        rectangle2 = square; // assegno un riferimento di tipo Square a un riferimento di tipo Rectangle

        output += "\nUn oggetto di tipo Square tramite un riferimento di un tipo " + "Rectangle:\n" + rectangle2;

        System.out.println(output);

        String display = "\nUn oggetto di tipo Square tramite un riferimento di un tipo " + "Rectangle:\n" + rec;

        System.out.println(display);

    }
}
