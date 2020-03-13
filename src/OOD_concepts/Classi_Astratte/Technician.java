package OOD_concepts.Classi_Astratte;

public class Technician extends Employee {

    private static final int AMOUNT = 5;
    private int quantum = AMOUNT;
    private int pieces;
    private int fixed_amount;

    public Technician(String fn, String ln, int f, int p) {
        super(fn, ln);
        setFixedAmount(f);
        setPieces(p);
    }

    // imposto il fisso come paga
    public void setFixedAmount(int f) {
        this.fixed_amount = (f > 0) ? f : 0;
    }

    // setta i pezzi da lavorare
    public void setPieces(int p) {
        this.pieces = (p > 0) ? p : 0;
    }

    // specializzazione della paga:
    // Avrà uno stipendio mensile dato da un importo fisso più un quantum in base ai pezzi lavorati.
    public int earning() {
        return fixed_amount + (quantum * pieces);
    }

    @Override
    public String toString() {
        return super.toString() + " guadagna €: ";
    }
}
