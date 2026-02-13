//sum of large numbers Modulo 
import java.util.Scanner;
public class rpk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
    int rkr = sc.nextInt();
     int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
     }
     int sum = 0;
     for (int i: arr){
        sum = sum + i;
     }
     sum = sum%rkr;
     System.out.println(sum);
     System.out.println("20231CSE0120 R Pradyumna Kashyap");
	}

}