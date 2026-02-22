package labsheet10;
    import java.util.Scanner;
import java.util.HashSet;
public class tenone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();     // number of strings
        sc.nextLine();            // clear newline
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            set.add(str);
        }
        int q = sc.nextInt();     
        sc.nextLine();            
        for (int i = 0; i < q; i++) {
            String query = sc.nextLine();

            if (set.contains(query)) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found");
            }
        }
        System.out.println("R Pradyumna Kashyap 20231CSE0120");
    }
}


