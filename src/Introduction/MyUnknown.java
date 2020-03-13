package Introduction;

public class MyUnknown {
    public static void main(String[] args) {
        System.out.format("\nfoo(%f)=%f", 4.0, foo(4));
        System.out.format("\nfoo(%f)=%f", 40.0, foo(40));
        System.out.format("\nfoo(%f)=%f", 10.0, foo(10));
    }

    static double foo(double coef) {
        double ans = coef / 2.0;
        int i = 1;
        while (i < 7) {
            ans = ans - ((ans * ans - coef) / (2.0 * ans));
            i = i + 1;
        }

        return (ans);
    }
}

/*
    OUTPUT:

    coef = 4.0
    ans = 2.0
    i = 1
    ans = 2.0

    i = 2
    ans = 2.0

    i = 3
    ans = 2.0

    i = 4
    ans = 2.0

    i = 5
    ans = 2.0

    i = 6
    ans = 2.0

    i = 7
    return ans --> 2.0
*/
