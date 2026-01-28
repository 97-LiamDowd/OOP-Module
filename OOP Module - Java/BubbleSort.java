import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = new int[200];
        long startTime;
        long duration;

        // Fill array with 200 random numbers between 1-100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100) + 1;
        }

        startTime = System.currentTimeMillis();

        int temp;
        boolean swapped;

        for (int i = 0; i < numbers.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }

            // Now this is in the RIGHT place
            if (!swapped) {
                break;
            }
        }

        duration = System.currentTimeMillis() - startTime;

        System.out.println(Arrays.toString(numbers));
        System.out.println("Time in milliseconds: " + duration);
    }
}
