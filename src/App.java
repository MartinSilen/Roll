import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner inp =  new Scanner(System.in);

        while(true){
            System.out.println("type anything to roll, type \"exit\" to quit");
            String check = inp.nextLine();
            if (check.equalsIgnoreCase("exit")){
                System.out.println("Thanks for using this program!");
                break;}
            Random rnd = new Random();
            int dice1 = rnd.nextInt(5) + 1;
            int dice2 = rnd.nextInt(5) + 1;
            System.out.println("First Roll: " + dice1);
            System.out.println("Second Roll: " + dice2);
            System.out.println("Total: " + (dice1+dice2));
        }
    }
}