package midterm;

import java.util.Scanner;

public class kth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String rpk[] = str.split(" ");

        int n = rpk.length;
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(rpk[i]);
        }

        int k = sc.nextInt();

        int freq[] = new int[n];

        // Count frequency
        for(int i = 0; i < n; i++){

            int count = 0;

            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            freq[i] = count;
        }
        for(int i = 0; i < k; i++){
            int max = -1;
            int index = -1;
            for(int j = 0; j < n; j++){
                if(freq[j] > max){
                    max = freq[j];
                    index = j;
                }
            }
            System.out.println(arr[index]);
            for(int j = 0; j < n; j++){
                if(arr[j] == arr[index]){
                    freq[j] = -1;
                }
            }
        }
    }
}
