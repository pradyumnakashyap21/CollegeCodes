//LO2
package javacompetitive.labsheet21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class hehe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, ArrayList<String>> tree = new HashMap<>();
        HashSet<String> fileIndex = new HashSet<>();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] parts = line.split(" ");

            if (parts[0].equals("CREATE")) {

                String dir = parts[1];
                String file = parts[2];

                tree.putIfAbsent(dir, new ArrayList<>());
                tree.get(dir).add(file);

                fileIndex.add(file);

                System.out.println("File Created");
            }

            else if (parts[0].equals("DELETE")) {

                String file = parts[1];

                if (fileIndex.contains(file)) {

                    fileIndex.remove(file);

                    // ALSO remove from tree
                    for (String dir : tree.keySet()) {
                        tree.get(dir).remove(file);
                    }

                    System.out.println("File Deleted");
                } else {
                    System.out.println("File Not Found");
                }
            }

            else if (parts[0].equals("FIND")) {

                String file = parts[1];

                if (fileIndex.contains(file))
                    System.out.println("File Exists");
                else
                    System.out.println("File Not Found");
            }
        }

        sc.close();
    }
}