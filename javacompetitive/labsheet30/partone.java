package javacompetitive.labsheet30;
class Move {
    int value;

    Move(int value) {
        this.value = value;
    }
}
public class partone {
     static int minimax(int depth, int alpha, int beta, boolean isMax, int[] values, int index) {

        // Leaf node
        if (depth == 0) {
            return values[index];
        }

        if (isMax) {
            int maxEval = Integer.MIN_VALUE;

            for (int i = 0; i < 2; i++) {
                int eval = minimax(depth - 1, alpha, beta, false, values, index * 2 + i);
                maxEval = Math.max(maxEval, eval);
                alpha = Math.max(alpha, eval);

                if (beta <= alpha) {
                    break; // PRUNING
                }
            }
            return maxEval;
        } else {
            int minEval = Integer.MAX_VALUE;

            for (int i = 0; i < 2; i++) {
                int eval = minimax(depth - 1, alpha, beta, true, values, index * 2 + i);
                minEval = Math.min(minEval, eval);
                beta = Math.min(beta, eval);

                if (beta <= alpha) {
                    break; // PRUNING
                }
            }
            return minEval;
        }
    }

    public static void main(String[] args) {

        // Example leaf node values
        int[] values = {3, 5, 6, 9, 1, 2, 0, -1};

        int depth = 3;

        int result = minimax(depth, Integer.MIN_VALUE, Integer.MAX_VALUE, true, values, 0);

        System.out.println("Best Move Value: " + result);
    }
}
