import java.lang.Math;
import java.util.Arrays;
public class Arrayriverse {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 9, 5, 1};
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }
}