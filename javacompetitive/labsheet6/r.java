package labsheet6;
import java.util.*;
public class r{
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;  
        int r = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            result = result ^ num; 
        }
        if(result == r){
            System.out.println("OK");
        }
        else{
            System.out.println("Anamoly");
        }
        System.out.println("R Pradyumna 20231CSE0120");
    }
}