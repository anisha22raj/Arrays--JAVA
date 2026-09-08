import java.util.*;

public class firstduplicateTimeComN {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2};
        int[] f = new int[100];

        for (int i = 0; i < arr.length; i++) {
            f[arr[i]]++;
        }
        for (int i = 0; i < arr.length; i++)
            {
            if(f[arr[i]]> 1){
                System.out.println("First duplicate element is: " + arr[i]);
                break;
            }
        }
    }
}