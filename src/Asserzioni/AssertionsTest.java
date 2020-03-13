package Asserzioni;

enum Colors {RED, GREEN, BLUE, YELLOW}

class Paint {
    public static void paint(Colors c) {

        // INTERNAL INVARIANT
        // asserisco che potrò colorare solo con i colori RED, GREEN e BLUE
        // se, per esempio, in futuro amplio l'enumerazione con la costante YELLOW
        // e poi la utilizzo per l'argomento c allora la chiamata di paint genererà
        // un AssertionError perché non è prevista la "colorazione" con quel colore
        // e dunque la condizione dell'invariante non è più vera ossia non è più
        // vero che c può avere come valore solo RED, GREEN o BLUE
        switch (c) {
            case RED:
                System.out.println("Disegno con il rosso...");
                break;
            case GREEN:
                System.out.println("Disegno con il verde...");
                break;
            case BLUE:
                System.out.println("Disegno con il blu...");
                break;
            default:
                assert false : "Colore non legale [ " + c + " ]";
        }
    }
}

class Char {
    public Character toUpper(Character c) { // metodo PUBBLICO

        // Qua una precondizione con assert non dovrebbe essere usata perché la verifica
        // degli argomenti nei metodi pubblici dovrebbe essere parte del "contratto" del metodo
        // e questo "contratto" deve sempre essere rispettato;
        // utilizziamo, dunque, il meccanismo di gestione delle eccezioni
        if (Character.isDigit(c))
            throw new IllegalArgumentException("Carattere illegale [ " + c + " ]");

        Character c_conv = convert(c);

        // POSTCONDITION
        // asserisco che l'oggetto c_conv sia sempre valorizzato
        // il metodo cioè può ritornare solo se tale condizione è soddisfatta
        assert c_conv != null : "Nessuna conversione occorsa";
        return c_conv;
    }

    private char convert(Character c) { // metodo PRIVATO

        // PRECONDITION
        // asserisco che l'argomento c sia sempre valorizzato
        // il metodo cioè può svolgere il suo compito elaborativo solo se tale
        // condizione è soddisfatta
        assert c != null : "Conversione non attuabile";
        return Character.toUpperCase(c);
    }
}

class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int area() {
        assert isComputable() : "Square non valido";
        return side * side;
    }

    public int perimeter() {
        assert isComputable() : "Square non valido";
        return side * 4;
    }

    // CLASS INVARIANT
    // asserisco la validità dello stato di un oggetto Square
    // in pratica deve sempre avere un lato maggiore o uguale a 0
    // qualsiasi operazione si effettui
    // tipicamente il check di un invariante di classe è effettuato da un metodo privato
    // della classe che si intende testarne lo stato e ritorna un valore booleano
    // che esprime, per l'appunto, il risultato di quel check
    private boolean isComputable() {
        return side >= 0; // campo da verificare...
    }
}

public class AssertionsTest {
    public static void main(String[] args) {

        // new Paint().paint(Colors.YELLOW); // AssertionError
        // System.out.println(new Char().toUpper('b'));
        System.out.println(new Square(10).area());
        System.out.println(new Square(-5).perimeter()); // AssertionError: Square non valido
    }
}
