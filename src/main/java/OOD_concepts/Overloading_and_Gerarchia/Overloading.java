package OOD_concepts.Overloading_and_Gerarchia;

public class Overloading {
    static int i = 0;

    class D {
        void m(D d) {
            System.out.format("%3d D.m(D %s)\n", i++, d);
        }

        void m(C c1) {
            System.out.format("%3d D.m(C %s)\n", i++, c1);
        }

        void m(B b1) {
            System.out.format("%3d D.m(B %s)\n", i++, b1);
        }

        void k(D d1, D d2) {
            System.out.format("%3d D.k(D D)\n", i++);
        }

        void k(C c1, D d2) {
            System.out.format("%3d D.k(C D)\n", i++);
        }

        void k(D d1, C c1) {
            System.out.format("%3d D.k(D C)\n", i++);
        }
    }

    class C extends D {
        void m(D d1) {
            System.out.format("%3d C.m(D %s)\n", i++, d1);
        }

        void m(C c1) {
            System.out.format("%3d C.m(C %s)\n", i++, c1);
        }

        void m(B b1) {
            System.out.format("%3d C.m(B %s)\n", i++, b1);
        }
    }

    class B extends D {
        void m(D d1) {
            System.out.format("%3d B.m(D %s)\n", i++, d1);
        }

        void m(B b1) {
            System.out.format("%3d B.m(B %s)\n", i++, b1);
        }

        void m(C c1) {
            System.out.format("%3d B.m(C %s)\n", i++, c1);
        }
    }

    static Overloading o = new Overloading();

    public static void main(String[] args) {
        D aD = o.new D(); // o.new() needed to create an instance of the inner class D
        C aC = o.new C();
        D anotherD = o.new C();
        B aB = o.new B();

        aD.m(aD);
        aD.m(aC);
        aD.m(anotherD);
        aD.m(aB);
        System.out.println();

        aC.m(aD);
        aC.m(aC);
        aC.m(anotherD);
        aC.m(aB);
        System.out.println();

        anotherD.m(aD);
        anotherD.m(aC);
        anotherD.m(anotherD);
        anotherD.m(aB);
        System.out.println();

        aB.m(aD);
        aB.m(aC);
        aB.m(anotherD);
        aB.m(aB);
        System.out.println();

        aD.k(aD, aD);
        aD.k(aD, aC);
        // aD.k(aC, aC); // ERROR: reference to k is ambiguous
    }
}

/*

  OUTPUT:

  0 D.m(D OOD_concepts.Overloading_and_Gerarchia.Overloading$D@70177ecd)
  1 D.m(C OOD_concepts.Overloading_and_Gerarchia.Overloading$C@1e80bfe8)
  2 D.m(D OOD_concepts.Overloading_and_Gerarchia.Overloading$C@66a29884)
  3 D.m(B OOD_concepts.Overloading_and_Gerarchia.Overloading$B@4769b07b)

  4 C.m(D OOD_concepts.Overloading_and_Gerarchia.Overloading$D@70177ecd)
  5 C.m(C OOD_concepts.Overloading_and_Gerarchia.Overloading$C@1e80bfe8)
  6 C.m(D OOD_concepts.Overloading_and_Gerarchia.Overloading$C@66a29884)
  7 C.m(B OOD_concepts.Overloading_and_Gerarchia.Overloading$B@4769b07b)

  8 C.m(D OOD_concepts.Overloading_and_Gerarchia.Overloading$D@70177ecd)
  9 C.m(C OOD_concepts.Overloading_and_Gerarchia.Overloading$C@1e80bfe8)
 10 C.m(D OOD_concepts.Overloading_and_Gerarchia.Overloading$C@66a29884)
 11 C.m(B OOD_concepts.Overloading_and_Gerarchia.Overloading$B@4769b07b)

 12 B.m(D OOD_concepts.Overloading_and_Gerarchia.Overloading$D@70177ecd)
 13 B.m(C OOD_concepts.Overloading_and_Gerarchia.Overloading$C@1e80bfe8)
 14 B.m(D OOD_concepts.Overloading_and_Gerarchia.Overloading$C@66a29884)
 15 B.m(B OOD_concepts.Overloading_and_Gerarchia.Overloading$B@4769b07b)

 16 D.k(D D)
 17 D.k(D C)

*/

