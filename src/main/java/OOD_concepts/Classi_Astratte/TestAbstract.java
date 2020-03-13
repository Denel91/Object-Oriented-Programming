package OOD_concepts.Classi_Astratte;

public class TestAbstract {
    public static void main(String[] args) {

        // il dipendente è adesso un ingegnere
        Employee e = new Engineer("Pellegrino", "Principe", 10, 1000);
        displayEarning(e);

        // Tecnico
        Technician tec = new Technician("Paolo", "Canali", 800, 6);
        displayEarning(tec);
    }

    private static void displayEarning(Employee e) {
        System.out.printf("%s%d%n", e.toString(), e.earning());
    }
}
