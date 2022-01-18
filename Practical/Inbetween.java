import java.util.*;

public class Inbetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number:");
        int userChoice1 = scanner.nextInt();
        System.out.println("Input second number:");
        int userChoice2 = scanner.nextInt();
        int end = Math.max(userChoice1, userChoice2);
        int start = Math.min(userChoice1, userChoice2);
        for(int i = start; i <= end; ++i)
        {
            System.out.println(i + " ");
        }
    }
}