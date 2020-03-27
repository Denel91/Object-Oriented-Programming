package Laboratorio.uniud.comande;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import Laboratorio.uniud.comande.eccezioni.CodiceAlimentoInesistente;

/**
 * Rappresenta un generico gestore di alimenti commestibili (es. Pietanze, Variazioni).
 * Ad ogni alimento è associato un codice univoco.
 */
public class GestoreAlimenti extends Gestore<Commestibile> {
    private Map<String, Commestibile> alimenti;
    private GeneratoreDiCodici generatoreDiCodici;

    /**
     * Costruttore (Creator).
     * Costruisce una nuova istanza del Gestore.
     */
    GestoreAlimenti() {
        this.alimenti = new HashMap<String, Commestibile>();
        this.generatoreDiCodici = new GeneratoreDiCodici();
        //Invariante
        assert (this.alimenti != null);
    }

    @Override
    void aggiungi(Commestibile nuovo) {
        alimenti.put(generatoreDiCodici.fornisciNuovoCodice(), nuovo);
        //Invariante
        assert (this.alimenti != null);

        //Post-condizione
        assert (alimenti.containsKey(generatoreDiCodici.fornisciUltimoCodice()));
    }

    @Override
    void rimuovi(Commestibile daRimuovere) {
        if (alimenti.containsValue(daRimuovere)) {
            String codice = "";
            for (Entry<String, Commestibile> p : alimenti.entrySet()) {
                if (p.getValue().equals(daRimuovere)) {
                    codice = p.getKey();
                    break;
                }
            }

            assert (!"".equals(codice));
            //Post-condizione
            assert (!alimenti.containsKey(codice));
            alimenti.remove(codice);
        }

        //Invariante
        assert (this.alimenti != null);
    }

    @Override
    Boolean giaInserito(Commestibile daVerificare) {
        return alimenti.containsValue(daVerificare);
    }

    /**
     * Inserisce l'alimento nel gestore e ne restituisce il nuovo codice univoco.
     * (Mutator).
     * POST-CONDIZIONE: se l'alimento è inserito, l'ultimo codice generato è presente nel gestore
     *
     * @param nuovo nuovo alimento da inserire
     * @return il codice del nuovo alimento
     */
    String aggiungiEOttieniCodice(Commestibile nuovo) {
        aggiungi(nuovo);
        assert (this.alimenti != null);

        //Post-condizione
        assert (alimenti.containsKey(generatoreDiCodici.fornisciUltimoCodice()));
        return generatoreDiCodici.fornisciUltimoCodice();
    }

    /**
     * Restituisce l'alimento associato al codice (Observer).
     *
     * @param codice il codice dell'alimento da ottenere
     * @return l'alimento associato al codice fornito
     * @throws CodiceAlimentoInesistente se non è presente nessun alimento associato al codice fornito
     */
    Commestibile fornisciAlimento(String codice) throws CodiceAlimentoInesistente {
        if (alimenti.containsKey(codice)) {
            return alimenti.get(codice);
        } else {
            throw new CodiceAlimentoInesistente();
        }
    }
}

