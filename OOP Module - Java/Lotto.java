import java.util.Arrays;

public class Lotto {
    public static void main(String[] args){

        int[] lottoNums = new int[6];

        //Generate 6 random numbers
        for(int i = 0; i < lottoNums.length; i++){
            lottoNums[i] = (int)(Math.random() * 47) + 1;
            for(int j = 0; j < i; j++){
                if(lottoNums[i] == lottoNums[j]){
                    i--; //duplicate found, redo this iteration
                    break;
                }
            }
        }

        //sort the number
        Arrays.sort(lottoNums);

        //print 6  numbers
        for(int i = 0; i < lottoNums.length; i++){
            System.out.println(lottoNums[i]);
        }
        
    }

}
