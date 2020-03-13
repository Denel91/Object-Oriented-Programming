package Enumerazioni;

public enum OS {

    WINDOWS("10"),
    LINUX("Manjaro 18.0"),
    MAC("macOS Catalina"); // qui punto e virgola, IMPORTANTE!

    private final String title;

    OS(String s) {
        title = s;
    }

    public String getTitle() {
        return title;
    }
}



