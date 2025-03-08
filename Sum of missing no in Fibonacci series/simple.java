import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int bound = sc.nextInt();
        int a = 0;
        int b = 1;
        int value = 0;
        int[] arr = new int[bound];
        arr[0] = a;
        arr[1] = b;
        for (int i = 2; i < bound; i++) {
            arr[i] = a + b;
            a = b;
            b = arr[i];
        }
        
        for (int i = 0; i < bound; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr[arr.length - 1]; i++) {
            boolean flag = false;
            for (int j : arr) {
                if (i == j) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                value = value + i;

            }
        }
        System.out.println(value);
    }
}
