package Laboratorio.uniud.comande;

/**
 * Rappresenta i tipi di pietanze presenti nel menù
 */

public enum TipiPietanze {

    ANTIPASTO("antipasto"),
    PRIMO_PIATTO("primo piatto"),
    SECONDO_PIATTO("secondo piatto"),
    PIATTO_UNICO("piatto unico"),
    CONTORNO("contorno"),
    DOLCE("dolce"),
    BIBITA("bibita");

    private String nomePietanza;

    TipiPietanze(String nome) {
        this.nomePietanza = nome;
    }

    private String getNome() {
        return this.nomePietanza;
    }

    public static TipiPietanze getTipoPietanza(String nome) {
        for (TipiPietanze tipiPietanze : values()) {
            if (tipiPietanze.getNome().equals(nome)) {
                return tipiPietanze;
            }
        }

        return null;
    }
}




