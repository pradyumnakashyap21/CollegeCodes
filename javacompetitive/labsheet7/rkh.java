package labsheet7;

import java.util.Scanner;

public class rkh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int j=0; j<arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("R Pradyumna Kashyap 20231CSE0120");
    }
}
