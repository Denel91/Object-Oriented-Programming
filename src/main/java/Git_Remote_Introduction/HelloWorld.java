package Git_Remote_Introduction;

public class HelloWorld {
    private static final String messaggio = "git push success!";

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.print(messaggio);
    }

    private void log(String message) {
        System.out.println(message);
    }

    public void print(String msg) {
        log(msg);
    }
}
