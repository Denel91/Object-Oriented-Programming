package Stream_Input_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedStream {
    public static void main(String[] args) {

        int total = 0;
        String line;

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Adder: ");

            // To stop the loop and calculate the sum press ctrl + D
            while ((line = reader.readLine()) != null) {
                total += Integer.parseInt(line);
            }

            reader.close();

        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(e.getMessage() + " is not numeric");
            System.exit(1);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("IO ERROR");
            System.exit(1);
        }

        System.out.println("Sum = " + total);
    }
}
