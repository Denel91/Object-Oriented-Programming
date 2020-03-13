package Enumerazioni.Il_tipo_Enum;

// Classe test per testare i membri della classe Enum<E>
public class TestEnum {
    public static void main(String[] args) {

        OS os_1 = OS.WINDOWS;
        OS os_2 = OS.WINDOWS;
        OS os_3 = OS.LINUX;
        OS os_4 = OS.MAC_OS;

        // restituisce -1 perchè WINDOWS ha una posizione ordinale
        // inferiore rispetto a LINUX
        System.out.printf("%d%n", os_1.compareTo(os_3)); // -1

        System.out.printf("%b%n", os_1.equals(os_2)); // true

        System.out.printf("%b%n", os_1.equals(os_4)); // false

        System.out.printf("%s%n", os_1.name()); // WINDOWS

        System.out.printf("%s%n", os_3.name()); // LINUX

        System.out.printf("%s%n", os_4.name()); // MAC_OS

        for (OS os : OS.values()) {

            // restituisce, in successione, i valori 0,1 e 2
            System.out.printf("%d%n", os.ordinal());
        }
    }
}
