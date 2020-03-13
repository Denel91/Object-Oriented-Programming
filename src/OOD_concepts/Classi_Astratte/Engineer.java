package OOD_concepts.Classi_Astratte;

public class Engineer extends Employee {

    private int percentage;
    private int fixed_amount;

    public Engineer(String fn, String ln, int p, int f) {
        super(fn, ln);
        setPercentage(p);
        setFixedAmount(f);
    }

    // imposto il fisso come paga
    public void setFixedAmount(int f) {
        this.fixed_amount = (f > 0) ? f : 0;
    }

    // imposto la percentuale
    public void setPercentage(int p) {
        this.percentage = (p > 0) ? p : 0;
    }

    // calcolo specializzato del quadagno:
    // Avrà uno stipendio mensile che sarà dato da un importo fisso più una percentuale.
    public int earning() {
        return fixed_amount + (fixed_amount * percentage / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " guadagna €: ";
    }
}
