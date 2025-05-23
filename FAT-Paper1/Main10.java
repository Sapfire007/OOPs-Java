import java.util.*;
import java.lang.Number;

class AverageCalculator<T extends Number> {
    private T[] values;

    public AverageCalculator(T[] values) {
        this.values = values;
    }

    public double calculateAverage() {
        if (values.length == 0) {
            System.out.println("Array is empty. Cannot calculate average.");
            return 0.0;
        }

        double sum = 0.0;
        for (T val : values) {
            sum += val.doubleValue(); // convert to double for calculation
        }

        return sum / values.length;
    }
}

public class Main10 {
    public static void main(String[] args) {
        Integer[] intValues = {10, 20, 30, 40, 50};
        Double[] doubleValues = {5.5, 10.5, 15.5};

        AverageCalculator<Integer> intCalc = new AverageCalculator<>(intValues);
        System.out.println("Average (Integer): " + intCalc.calculateAverage());

        AverageCalculator<Double> doubleCalc = new AverageCalculator<>(doubleValues);
        System.out.println("Average (Double): " + doubleCalc.calculateAverage());

        // Optional: Test with empty array
        Integer[] emptyArray = {};
        AverageCalculator<Integer> emptyCalc = new AverageCalculator<>(emptyArray);
        emptyCalc.calculateAverage(); // will display a message
    }
}
