public class Lotto {
    public static void main(String[] args){

        int[] lottoNums = new int[6];

        //Generate 6 random numbers
        for(int i = 0; i < lottoNums.length; i++){
            lottoNums[i] = (int)(Math.random() * 47) + 1;
        }

    }

}
