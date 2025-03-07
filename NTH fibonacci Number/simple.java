import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1 || n == 2) {
            System.out.println(1);  
            return;
        }
        int a = 1, b = 1;
        int[] arr = new int[n + 1];  
        arr[1] = a;
        arr[2] = b;
        for (int i = 3; i <= n; i++) {
            arr[i] = a + b;
            a = b;
            b = arr[i];
        }
        System.out.println(arr[n]);  
    }
}
