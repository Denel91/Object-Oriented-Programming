package Laboratorio.uniud.comande;

import java.util.List;

/**
 * Rappresenta una pietanza presente nel men�
 */

public class Pietanza implements Commestibile {
    private String nome;
    private List<Ingrediente> ingredienti;
    private TipiPietanze tipoPietanza;
    private Double prezzo;

    /**
     * Costruttore (Creator).
     *
     * @param nome:         il nome della pietanza
     * @param ingredienti:  gli ingredienti della pietanza
     * @param tipoPietanza: il tipo di pietanza
     * @param prezzo:       il prezzo della pietanza
     */
    public Pietanza(String nome, List<Ingrediente> ingredienti, TipiPietanze tipoPietanza, Double prezzo) {
        this.nome = nome;
        this.ingredienti = ingredienti;
        this.tipoPietanza = tipoPietanza;
        this.setPrezzo(prezzo);
    }

    Pietanza(Pietanza pietanza) {
        copiaDa(pietanza);
    }

    private void copiaDa(Pietanza pietanza) {
        this.nome = pietanza.nome;
        this.ingredienti = pietanza.ingredienti;
        this.tipoPietanza = pietanza.tipoPietanza;
        this.prezzo = pietanza.prezzo;
    }

    //Observer
    public String getNome() {
        return nome;
    }

    //Mutator
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Observer
    public List<Ingrediente> getIngredienti() {
        return ingredienti;
    }

    //Mutator
    public void setIngredienti(List<Ingrediente> ingredienti) {
        this.ingredienti = ingredienti;
    }

    //Mutator
    public void aggiungiIngrediente(Ingrediente ingrediente) {
        this.ingredienti.add(ingrediente);
    }

    //Observer
    public TipiPietanze getTipoPietanza() {
        return tipoPietanza;
    }

    //Mutator
    public void setTipoPietanza(TipiPietanze tipoPietanza) {
        this.tipoPietanza = tipoPietanza;
    }

    //Observer
    public Double getPrezzo() {
        return prezzo;
    }

    //Mutator
    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    //Observer
    public boolean equals(Pietanza altraPietanza) {
        return prezzo.equals(altraPietanza.getPrezzo()) && tipoPietanza.equals(altraPietanza.getTipoPietanza()) && nome.equals(altraPietanza.nome) && ingredienti.equals(altraPietanza.ingredienti);
    }

    /**
     * (Creator).
     * Crea una pietanza identica a quella attuale
     *
     * @return la copia della pietanza attuale
     */
    Pietanza duplica() {
        Pietanza duplicato = new Pietanza(this.nome, this.ingredienti, this.tipoPietanza, this.prezzo);
        return duplicato;
    }
}


