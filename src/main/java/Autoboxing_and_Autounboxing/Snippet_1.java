package Autoboxing_and_Autounboxing;

// Processo di Auto-unboxing
public class Snippet_1 {
    public static void main(String[] args) {

        int number = 100; // number è una variabile di tipo int (tipo primitivo)
        Integer int_obj = number; // int_obj è una variabile di tipo Integer (wrapper class)
        // avviene l'autoboxing di number

        int number_2 = int_obj; // number_2 è una variabile di tipo int (tipo primitivo)
        // avviene l'auto-unboxing di int_obj

        System.out.println(number_2); // --> 100
    }
}
