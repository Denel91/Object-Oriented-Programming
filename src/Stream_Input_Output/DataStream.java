package Stream_Input_Output;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class DataStream {
    public static void main(String[] args) {

        int total = 0;
        String line;

        try {

            BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
            BufferedReader reader = new BufferedReader(new InputStreamReader(bufferedInputStream,
                    StandardCharsets.UTF_8));

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
            System.out.println("IO error");
            System.exit(1);
        }

        System.out.println("Sum = " + total);
    }
}

