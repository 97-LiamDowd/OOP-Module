import java.util.Arrays;
public class BubbleSort{
    public static void main(String[] args){

        int[] numbers = new int[200];
        long startTime;
        long duration;

        startTime = System.currentTimeMillis();

        //fill array with 200 random numbers between 1-200
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100) + 1;
        }

        System.out.println(Arrays.toString(numbers));

        duration = System.currentTimeMillis() - startTime;
        System.out.println("Time in miliseconds: " + duration);
    }
}