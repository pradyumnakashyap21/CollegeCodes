package midterm;
import java .util.*;
public class grtcandle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int candle[] = new int[n];
        for(int i = 0; i<n; i++){
            candle[i] = sc.nextInt();
        }
        int extra = sc.nextInt();
        int max = candle[0];
        for( int i = 1;i<n;i++){
            if(candle[i]>max){
                max = candle[i];
            }
        }
        System.out.print("[");
        for(int i=0; i<n; i++){
            if(candle[i]+extra >= max){
                System.out.print("true");
            }
            else{
                System.out.print("False");
            }
            if(i!=n-1){
                System.out.print(",");

            }
        }
        System.out.print("]");
        
    }
}
