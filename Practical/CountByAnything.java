import java.util.*;

public class CountByAnything {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start: ");
        int start = scanner.nextInt();
        System.out.println("End: ");
        int end = scanner.nextInt();
        for(int i = start; i <= end; ++i)
        {
            if(i % 10 == 0)
                System.out.println();
            System.out.print(i + " ");
        }
    }
}