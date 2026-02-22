package labsheet8;
import java.util.Scanner;
public class rpk {
    static void quickSort(int arr[][], int low, int high) {
        if (low < high) {
            int pivot = arr[high][0]; 
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (arr[j][0] < pivot) {
                    i++;
                    int temp0 = arr[i][0];
                    int temp1 = arr[i][1];

                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];

                    arr[j][0] = temp0;
                    arr[j][1] = temp1;
                }
            }
            int temp0 = arr[i+1][0];
            int temp1 = arr[i+1][1];

            arr[i+1][0] = arr[high][0];
            arr[i+1][1] = arr[high][1];
            arr[high][0] = temp0;
            arr[high][1] = temp1;
            int pi = i + 1;
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); 
            arr[i][1] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1);
        int limit = 10;
        if (n < 10) {
            limit = n;
        }
        System.out.println("SPACE");
        for (int i = 0; i < limit; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
        System.out.println("R Pradyumna Kashyap 20231CSE0120");
    }
}

