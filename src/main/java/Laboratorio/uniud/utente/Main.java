package Laboratorio.uniud.utente;

import Laboratorio.uniud.comande.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Test for orders for a restaurant.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Ingrediente salsa = new Ingrediente("pomodoro");
        Ingrediente mozzarella = new Ingrediente("mozzarella");
        List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        ingredientes.add(mozzarella);
        ingredientes.add(salsa);
        TipiPietanze tipoPietanza = TipiPietanze.PIATTO_UNICO;

        Pietanza myPietanza = new Pietanza("Pizza", ingredientes, tipoPietanza, 5.00);

        for (Ingrediente ingrediente : ingredientes) {
            System.out.println(ingrediente.getNome());
        }
    }
}
