package labsheet14;

public class rpk {

    public static int[] computeZ(String s) {
        int n = s.length();
        int[] Z = new int[n];

        for (int i = 1; i < n; i++) {
            int count = 0;
            while (i + count < n && s.charAt(count) == s.charAt(i + count)) {
                count++;
            }
            Z[i] = count;
        }
        return Z;
    }
        public static void main(String[] args) {
        String s = "aabxabbxaabx";
        int[] Z = computeZ(s);
        for (int i = 0; i < Z.length; i++) {
            System.out.print(Z[i] + " ");
        }
        System.out.println("R Pradyumna 20231CSE0120");
    }
}

