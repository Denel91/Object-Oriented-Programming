package Enumerazioni;

public class ComplexEnumeration {
    public static void main(String[] args) {

        System.out.println("Tipi di OS: ");

        for (OS os : OS.values()) { // eseguiamo un ciclo nell'array di OS
            System.out.printf("[ %s %s ]%n", os, os.getTitle());
        }

        System.out.print("OS scelto: ");

        OS os_scelto = OS.MAC; // assegniamo un valore di OS

        switch (os_scelto) {
            case WINDOWS:
                System.out.println(os_scelto.getTitle());
                break;
            case LINUX:
                System.out.println(os_scelto.getTitle());
                break;
            case MAC:
                System.out.println(os_scelto.getTitle());
                break;
        }
    }
}
