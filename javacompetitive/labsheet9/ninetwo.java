package labsheet9;
import java.util.Scanner;
public class ninetwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();         
        int k = sc.nextInt(); 
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Access ID Not Found");
        }
        else if (index < k) {
            System.out.println("Valid Access");
        }
        else {
            System.out.println("Late Access");
        }
        System.out.println("R Pradyumna Kashyap 20231CSE0120");
    }
}

