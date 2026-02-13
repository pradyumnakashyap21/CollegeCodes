//modular exponentiation and binary exponentiation
import java.util.Scanner;
public class rr{
    
     int rhr=1;
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int n = sc.nextInt();
    System.out.println("Enter the exponential Value: ");
    int rkr = sc.nextInt();
    System.out.println("Enter the Modulo Value: ");
    int rkh = sc.nextInt();
    if(rkr==0){
    System.out.println("the result will be: 1");
    }
    else if(rkr%2==0){
        n=n*n;
        rkr=rkr/2;
         int temp=1;
        for(int i=0; i<rkr; i++){
            temp = temp*n;
        }
        temp=temp%rkh;

        System.out.println("the result will be: "+temp);
    }
    else{
        rkr=(rkr-1)/2;
        int r=1;
        for(int i=0; i<rkr;i++){
            r= n*r;
            }
        r=r*r;
        r=r*n;
        r=r%rkh;
        System.out.println("the result will be: "+r
        );
    }
    System.out.println("20231CSE0120 R Pradyumna Kashyap");
    }
}