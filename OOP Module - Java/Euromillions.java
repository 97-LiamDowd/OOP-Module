import java.util.Arrays;
public class Euromillions {
    public static void main(String[] args){

        int[] numbers = new int[5];
        int[] luckystars = new int[2];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() *50)+1;
            for(int j =0; j < i; j++){
                if(numbers[i] == numbers[j]){
                    i--;
                    break;
                }
            }
        }

        luckystars[0] = (int)(Math.random() * 12) + 1;
        do {
            luckystars[1] = (int)(Math.random() * 12) + 1;

        } while (luckystars[0]  == luckystars[1]);

        Arrays.sort(numbers);

    }
}
