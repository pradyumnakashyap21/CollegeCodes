import java.util.*;
public class kirran{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int target = sc.nextInt();
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        if(target == arr[i]){
            return i;
        }
        return -1;
    }
}