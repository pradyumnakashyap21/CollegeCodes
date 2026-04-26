//LO1
package labsheet25;

import java.util.*;
class Auction extends Thread {

    static int highestBid = 0;
    int bid;

    Auction(int bid){
        this.bid = bid;
    }

    public void run(){
        if(bid > highestBid){
            highestBid = bid;
        }
    }
}

public class AuctionRace {

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
