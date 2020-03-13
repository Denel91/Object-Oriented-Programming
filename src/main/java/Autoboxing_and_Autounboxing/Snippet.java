package Autoboxing_and_Autounboxing;

// Processo di Autoboxing
public class Snippet {
    public static void main(String[] args) {

        int number = 100; // number è una variabile di tipo int (tipo primitivo)
        Integer int_obj = number; // int_obj è una variabile di tipo Integer (wrapper class)
        // avviene l'autoboxing di number

        System.out.println(int_obj); // --> 100
    }
}
