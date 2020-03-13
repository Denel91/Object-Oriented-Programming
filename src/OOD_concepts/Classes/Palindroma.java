package OOD_concepts.Classes;

public class Palindroma {
    public static void main(String[] args) {

        String word = "OSSO";
        System.out.println("La parola " + word + (palindroma(word) ? "" : " non") + " è " + "palindroma");
    }

    /**
     * Riceve una stringa s e verifica ricorsivamente se è palindroma.
     * <p>
     * CASI BASE: Se s è vuota o è composta da un solo carattere, allora s è palindroma.
     * <p>
     * PASSO INDUTTIVO: s è composta da almeno due caratteri:
     * s è palidroma se e solo se:
     * 1) Il primo e l'ultimo carattere sono uguali
     * 2) è palindroma la sottostringa di s che parte dal secondo carattere e si ferma al penultimo carattere
     *
     * @param s la stringa da verificare
     * @return true if s is palindroma, else false.
     */
    public static boolean palindroma(String s) {
        if ((s.length() < 2) || s.isBlank()) {

            return true;
        }

        if (s.charAt(0) == s.charAt(s.length() - 1)) {

            return palindroma(s.substring(1, s.length() - 1));

        } else {

            return false;
        }
    }
}


