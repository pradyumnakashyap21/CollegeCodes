package javacompetitive.labsheet23;

import java.util.HashMap;
import java.util.Scanner;

public class krrr {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] item = new String[n];
        int[] price = new int[n];

        for(int i=0;i<n;i++){
            item[i] = sc.next();
            price[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        HashMap<String,Integer> discount = new HashMap<>();

        for(int i=0;i<d;i++){
            String name = sc.next();
            int percent = sc.nextInt();
            discount.put(name,percent);
        }

        int total = 0;

        for(int i=0;i<n;i++){

            int p = price[i];

            if(discount.containsKey(item[i])){
                p = p - (p * discount.get(item[i]) / 100);
            }

            System.out.println(item[i] + " " + p);
            total += p;
        }

        System.out.println("Total Price = " + total);

    }
}
