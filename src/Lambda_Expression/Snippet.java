package Lambda_Expression;

import java.util.function.*;

/**
 * Interfacce funzionali general purpose
 */
public class Snippet {
    public static void main(String[] args) {

        // Interface IntConsumer
        // OK - è possibile usare il qualificatore final ma solo sui tipi manifesti oppure se presente var
        // (int) -> void
        IntConsumer intConsumer = (final int data) ->
        {
            int cons = data;
            cons *= 100;
            System.out.printf("IntConsumer: %d%n", cons);
        };

        intConsumer.accept(10);

        // Interface Consumer<T>
        // Type Parameters:
        // T - the type of the input to the operation
        Consumer<Integer> consumer = (var data) -> {
            int result = data * 2;
            System.out.printf("Consumer: %d%n", result);
        };

        consumer.accept(20);

        // Interface DoubleConsumer
        DoubleConsumer doubleConsumer = (var element) -> {
            double sum = 0.0;
            sum += element + 5.5;
            System.out.println("DoubleConsumer: " + sum);
        };

        doubleConsumer.accept(20.5);

        // OK - var usato per tutti i parametri formali
        // (String, String) -> String
        // Interface BiFunction<T,​U,​R>
        // Type Parameters:
        // T - the type of the first argument to the function
        // U - the type of the second argument to the function
        // R - the type of the result of the function
        BiFunction<String, String, String> function_4 = (var data_1, var data_2) -> data_1.concat(data_2);
        System.out.println("BiFunction: " + function_4.apply("Hello", " Lambda"));

        // Interface Function<T,​R>
        // Type Parameters:
        // T - the type of the input to the function
        // R - the type of the result of the function
        Function<Integer, Double> function = a -> a + 2.5;
        System.out.println("Function: " + function.apply(12));

        // Interface BiFunction<T,​U,​R>
        // Type Parameters:
        // T - the type of the first argument to the function
        // U - the type of the second argument to the function
        // R - the type of the result of the function
        BiFunction<Integer, Integer, Double> biFunction = (var number_1, var number_2) -> Math.multiplyExact(number_1, number_2) / 2.0;
        System.out.println("BiFunction: " + biFunction.apply(12, 10));

        // Interface IntFunction<R>
        // Type Parameters:
        // R - the type of the result of the function
        IntFunction<Integer> intFunction = (var number) -> number * 2;
        System.out.println("IntFunction: " + intFunction.apply(15));

        // Interface DoubleFunction<R>
        // Type Parameters:
        // R - the type of the result of the function
        DoubleFunction<Double> doubleFunction = (var number) -> {
            return Math.sqrt(number);
        };

        System.out.println("DoubleFunction: " + doubleFunction.apply(12.60));
    }
}
