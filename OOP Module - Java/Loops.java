public class Loops {
    public static void main(String[] args) {
        
        // 4 Loops, while, do-while, for-loop

        int counter = 50;
        while (counter < 5){
            System.out.println(counter++);
        }


        counter = 50;
        do{
            System.out.println(counter++);
        }while(counter < 5);


        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        
        String[] places = {"Tralee", "Listowel", "Dingle", "Kenmare"};

        for (String place : places){
            System.out.println(place);
        }


        int age;
        byte value= 19;
        age = value;

        System.out.println(age);
    }
}
