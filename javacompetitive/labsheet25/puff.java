package javacompetitive.labsheet25;

import java.util.Scanner;
class Auction extends Thread {

    static int highestBid = 0;
    static Object lock = new Object();
    int bid;

    Auction(int bid){
        this.bid = bid;
    }

    public void run(){

        synchronized(lock){

            if(bid > highestBid){
                highestBid = bid;
            }
        }
    }
}

public class puff {
        public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Auction threads[] = new Auction[n];

        for(int i=0;i<n;i++){

            int bid = sc.nextInt();

            threads[i] = new Auction(bid);
            threads[i].start();
        }

        for(int i=0;i<n;i++)
            threads[i].join();

        System.out.println("Highest Bid = " + Auction.highestBid);

        sc.close();
    }

}
