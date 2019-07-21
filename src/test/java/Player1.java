import java.util.Random;
import java.util.Scanner;

public class Player1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random(0);

        while (true) {
            int board[] = new int[12];
            for (int i = 0; i < 12; i++) {
                board[i] = in.nextInt();
                System.err.print(board[i] + " ");
            }

            System.err.println("");

            int action = random.nextInt(6);
            while (board[action] == 0) {
                action = random.nextInt(6);
            }
           
            System.out.println(String.format("%d", action));
        }
    }
}
