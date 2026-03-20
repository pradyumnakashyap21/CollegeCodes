package midterm;
import java.util.*;
public class paranthe {
     static List<String> result = new ArrayList<>();
    static void generate(int open, int close, int n, String str) {

        if(str.length() == 2*n){
            result.add(str);
            return;
        }

        if(open < n){
            generate(open+1, close, n, str+"(");
        }

        if(close < open){
            generate(open, close+1, n, str+")");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        generate(0,0,n,"");
        System.out.println(result);

    }
}

