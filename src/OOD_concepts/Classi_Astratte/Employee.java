package OOD_concepts.Classi_Astratte;

// Classe astratta
abstract class Employee {

    private String first_name;
    private String last_name;

    public Employee(String fn, String ln) {
        this.first_name = fn;
        this.last_name = ln;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    @Override
    public String toString() {
        return getFirst_name() + " " + getLast_name();
    }

    public abstract int earning(); // metodo astratto
}
