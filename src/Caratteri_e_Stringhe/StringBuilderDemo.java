package Caratteri_e_Stringhe;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder mod_string = new StringBuilder(); // vuota...
        System.out.println(getStringInfo(mod_string));

        mod_string.append("Sed ut perspiciatis"); // aggiungiamo una sequenza di caratteri con append()
        System.out.println(getStringInfo(mod_string));

        // aggiungiamo un'altra sequenza di caratteri con insert()
        mod_string.insert(7, "accusamus et iusto odio dignissimos ducimus");
        System.out.println(getStringInfo(mod_string));

        mod_string.delete(0, 4); // togliamo dei caratteri dalla posizione 0 alla posizione 4 (esclusa)
        System.out.println(getStringInfo(mod_string));
    }

    public static String getStringInfo(StringBuilder str) {
        return "Attualmente la stringa \"" + str.toString() + "\" ha capacità: "
                + str.capacity() + " e " + "lunghezza: " + str.length();
    }
}

/*
 * OUTPUT:
 * Attualmente la stringa "" ha capacità: 16 e lunghezza: 0
 * Attualmente la stringa "Sed ut perspiciatis" ha capacità: 34 e lunghezza: 19
 * Attualmente la stringa "Sed ut accusamus et iusto odio dignissimos ducimusperspiciatis" ha capacità: 70 e lunghezza: 62
 * Attualmente la stringa "ut accusamus et iusto odio dignissimos ducimusperspiciatis" ha capacità: 70 e lunghezza: 58
 */