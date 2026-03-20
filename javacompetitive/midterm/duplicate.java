package midterm;

import java.util.Scanner;

public class duplicate {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rpk[] = str.split(" ");
        int n = rpk.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
          arr[i] = Integer.parseInt(rpk[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               if(arr[i]==arr[j]){
                System.out.println("Duplicates are: "+arr[i]);
                
               }
            }
        }

    }
}
