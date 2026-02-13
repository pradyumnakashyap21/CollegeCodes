//Modular multiplication checker
import java.util.Scanner;
public class kash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        int k = sc.nextInt();
        long result = (a * b) % p;
        if(result%k==0){
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not Divisible");
        }
        System.out.println("20231CSE0120 R Pradyumna Kashyap");
     sc.close();
    }   
}

