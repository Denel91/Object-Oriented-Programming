package OOD_concepts.Overloading_and_Gerarchia;

public class TestGerarchia {
    public static void main(String[] args) {
        Object theObject;
        String theString;
        int theInt;
        long theLong;

        C aC = new C();
        D aD = new D();
        D anotherD = new C(); // assegno un riferimento di tipo C a un riferimento di tipo D
        B aB = new B();

        /*
        aC.m(theString, theInt, theLong); // OK
        aC.m(theString, theInt, theInt); // ERROR
        aC.m(theString, theLong, theInt); // OK
        aC.m(theString, theLong, theLong); // ERROR
        aC.m(theObject, theLong, theLong); // OK
        aC.m(theObject, theInt, theInt); // ERROR
        */

        /*
        //Il metodo m() non è definito nella classe D.
        aD.m(theString, theInt, theLong);
        aD.m(theString, theInt, theInt);
        aD.m(theString, theLong, theInt);
        aD.m(theString, theLong, theLong);
        aD.m(theObject, theLong, theLong);
        aD.m(theObject, theInt, theInt);
        */

        // Data la gerarchia devo creare il metodo m() in D
        // per poi utilizzare il meccanismo di Overriding
        /*
        anotherD.m(theString, theInt, theLong);
        anotherD.m(theString, theInt, theInt);
        anotherD.m(theString, theLong, theInt);
        anotherD.m(theString, theLong, theLong);
        anotherD.m(theObject, theLong, theLong);
        anotherD.m(theObject, theInt, theInt);
         */

        /*
        aB.m(theString, theInt, theLong); // OK
        aB.m(theString, theInt, theInt); // ERROR
        aB.m(theString, theLong, theInt); // OK
        aB.m(theString, theLong, theLong); // ERROR
        aB.m(theObject, theLong, theLong); // OK
        aB.m(theObject, theInt, theInt); // ERROR
         */
    }
}
