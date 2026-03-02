package midterm;
import java.util.*;
public class pairsongs {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String parts[] = line.split(" ");
        int n = parts.length;
          int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(parts[i]);
            }
            int count = 0;
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if((arr[i]+arr[j])%60==0){
                        count++;
                    }
                }
            }
            System.out.println(count);

        
    }
}
