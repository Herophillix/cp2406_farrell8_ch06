import java.util.*;

public class CountByThrees {
    public static void main(String[] args) {
        for(int i = 3; i <= 300; ++i)
        {
            if(i % 30 == 0)
            {
                System.out.println();
            }
            System.out.print(i + " ");
        }
    }
}