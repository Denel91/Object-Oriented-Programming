package Interfaccia_Map;

import java.util.EnumMap;
import java.util.Map;

public class MapImplementation {

    private enum ProgrammingLanguages {
        JAVA,
        CPP,
        JAVASCRIPT,
        CSHARP
    }

    public static void main(String[] args) {

        // Creo un tipo EnumMap con le key corrispondenti alle costanti di enumerazione dell'enumerazione ProgrammingLanguages
        Map<ProgrammingLanguages, String> emap = new EnumMap<ProgrammingLanguages, String>(ProgrammingLanguages.class);

        emap.put(ProgrammingLanguages.JAVA, "James Gosling");
        emap.put(ProgrammingLanguages.CPP, "Bjarne Stroustrup");
        emap.put(ProgrammingLanguages.JAVASCRIPT, "Brendan Eich");
        emap.put(ProgrammingLanguages.CSHARP, "Anders Hejlsberg");

        // Visualizzazione di tutte le entry
        System.out.printf("Entry di emap: %n%s%n", emap);
    }
}
