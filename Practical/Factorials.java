import java.util.*;

public class Factorials {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; ++i)
        {
            int value = 1;
            for(int j = 1; j <= i; ++j)
            {
                value *= j;
            }
            System.out.println(value);
        }
    }
}