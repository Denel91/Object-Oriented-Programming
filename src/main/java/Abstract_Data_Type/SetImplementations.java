package Abstract_Data_Type;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class SetImplementations {

    private enum DaysOfTheWeek {
        SUNDAY, MONDAY, TUEDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void printAllCollectionElements(Collection<String> c, String from) {

        System.out.printf("Tutte le keywords dalla collezione di tipo %s:%n", from);

        System.out.println("---------------------------------------------------");

        int sep = 1;
        for (String k : c) {
            System.out.printf("%s ", k);
            if (sep % 10 == 0)
                System.out.println();
            sep++;
        }

        System.out.printf("%n%n");
    }

    // mostra i giorni inseriti come elementi nell'EnumSet all
    private static void printEnumeration(EnumSet<DaysOfTheWeek> e, String from) {

        System.out.printf("Tutte le enumerazioni dall'EnumSet %s:%n ", from);

        System.out.print("[ ");
        for (DaysOfTheWeek dw : e)
            System.out.printf("%s ", dw);
        System.out.print("]");

        System.out.printf("%n%n");
    }

    public static void main(String[] args) {

        String[] java_keywords =
                {
                        "abstract", "continue", "for", "new", "switch", "assert", "default", "goto",
                        "package", "synchronized", "boolean", "do", "if", "private", "this", "break",
                        "double", "implements", "protected", "throw", "byte", "else", "import",
                        "public", "throws", "case", "enum", "instanceof", "return", "transient",
                        "catch", "extends", "int", "short", "try", "char", "final", "interface",
                        "static", "void", "class", "finally", "long", "strictfp", "volatile", "const",
                        "float", "native", "super", "while", "exports", "module", "provides", "open",
                        "opens", "requires", "transitive", "to", "uses", "with", "_"
                };

        Set<String> hs_keywords = new HashSet<>(25, 0.6f); // HashSet
        for (String s : java_keywords) // aggiungo gli elementi all'insieme
            hs_keywords.add(s);

        // crea un EnumSet con tutti i giorni della settimana
        EnumSet<DaysOfTheWeek> all = EnumSet.allOf(DaysOfTheWeek.class);

        // crea un EnumSet vuoto
        EnumSet<DaysOfTheWeek> none = EnumSet.noneOf(DaysOfTheWeek.class);
        none.add(DaysOfTheWeek.MONDAY);
        none.remove(DaysOfTheWeek.MONDAY);

        printAllCollectionElements(hs_keywords, "HashSet");
        printEnumeration(all, "all");
        printEnumeration(none, "none");
    }
}


