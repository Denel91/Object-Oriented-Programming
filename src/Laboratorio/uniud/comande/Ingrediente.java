package Laboratorio.uniud.comande;

/**
 * Rappresenta un generico ingrediente
 */

public class Ingrediente {
    private String nome;

    public Ingrediente(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
