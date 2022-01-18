import java.util.*;

public class EvenEntryLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        while(userInput != 999)
        {
            System.out.println("Input: ");
            userInput = scanner.nextInt();
            if(userInput % 2 == 0)
            {
                System.out.println("Good Job!");
            }
            else
            {
                System.out.println("Error!");
            }
        }
    }
}