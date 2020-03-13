package OOD_concepts.Overloading_and_Gerarchia;

public class B extends C {
    void m(Object o, long x, long y) {
    }

    void m(String s, int x, long y) {
    }

    void m(Object o, int x, long y) {
    }

    void m(String s, long x, int y) {
    }
}


