public class Branches {
    public static void main(String[] args){

        // if, if-esle, else -- switch, case -- ? conitional operator

        int age = 18;

        // if else means one if the statement is correct then do something, else do something else
        if (age >= 18) {
            System.out.println("Legal");
        }
        else{
            System.out.println("Not legal");
        }

        //Switch is for many different outcomes and scenarios. must use break to prevent it printing them all
        switch(age){
            case 1: System.out.println("Age is 1");
            break;
            case 2: System.out.println("Age is 2");
            break;
            case 20: System.out.println("Age is 20");
            break;
        }

        //This uses the ? which is a conditional value, if the first part is true it will print it
        // if the first statement is false, the second statement will print.
        System.out.println(age >= 18 ? "You can vote" : "Too young to vote");

    }
}
