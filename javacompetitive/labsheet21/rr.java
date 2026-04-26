//LO1
package javacompetitive.labsheet21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class rr {
        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, ArrayList<String>> tree = new HashMap<>();
        HashSet<String> fileIndex = new HashSet<>();

        for(int i=0;i<n;i++){

            String directory = sc.next();
            String file = sc.next();

            tree.putIfAbsent(directory,new ArrayList<>());

            tree.get(directory).add(file);

            fileIndex.add(file);
        }

        String searchFile = sc.next();

        System.out.println("File System Structure");

        for(String dir : tree.keySet()){
            System.out.print(dir + " -> ");
            for(String f : tree.get(dir))
                System.out.print(f + " ");
            System.out.println();
        }

        System.out.println("\nSearch Result");

        if(fileIndex.contains(searchFile))
            System.out.println("File Found");
        else
            System.out.println("File Not Found");

        sc.close();
    }

}
