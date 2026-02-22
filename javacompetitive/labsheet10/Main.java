package labsheet10;
import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        sc.nextLine();            
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String title = sc.next();  
            int id = sc.nextInt();      
            map.put(title, id);
        }
        int q = sc.nextInt();     
        sc.nextLine();            
        for (int i = 0; i < q; i++) {
            String search = sc.nextLine();
            if (map.containsKey(search)) {
                System.out.println(map.get(search));
            } else {
                System.out.println("Book Not Found");
            }
        }
         System.out.println("R Pradyumna Kashyap 20231CSE0120");
    }
}
