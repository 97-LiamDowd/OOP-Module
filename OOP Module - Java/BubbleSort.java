public class BubbleSort{
    public static void main(String[] args){

        int[] numbers = new int[200];
        long startTime;
        long duration;

        //fill array with 200 random numbers between 1-100
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100) + 1;
        }

        startTime = System.currentTimeMillis();
        //bubble sort
        
        int temp; //hold number for swap
        boolean swapped = false;
        for (int i = 0; i < numbers.length; i++){
            swapped = false;
            for (int j = 0; j < numbers.length-1; j++){
                if (numbers[j] > numbers[j+1]){
                    
                    //swap values
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swapped = true;
            
                }

            if (swapped == false){
                break;
            }   

            }   
    
        }
        
        duration = System.currentTimeMillis() - startTime;
        System.out.println("Time in miliseconds: " + duration);
        System.out.println(numbers);
        

    }
}