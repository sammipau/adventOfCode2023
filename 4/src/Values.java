
import java.util.ArrayList;

public class Values {
    public int game;
    public ArrayList<Integer> winning;
    public ArrayList<Integer> my;
    public int [] max;

    Values (int game) {
        this.game = game;
        winning = new ArrayList<>();
        my = new ArrayList<>();
        max = new int [3];
    }

    public void printAll() {
        System.out.println("Game: " + game);
        System.out.println("win:");
        for (int r : winning) {
            System.out.print(r + " ");
        }
        
        System.out.println("\nmy:");
        for (int r : my) {
            System.out.print(r + " ");
        }

        System.out.println();
    }

    public int getWinnings() {
        int sum = 0;
        int count = 0;

        for (int w : winning) {
            if (my.indexOf(w) != -1) {
                count++;
            }
        }
        // System.out.println("count: " + count);
        if (count == 0) {
            return 0;
        }
        if (count == 1) {
            return 1;
        }
        sum = (int) Math.pow(2, count - 1);
        // System.out.println("sum: " + sum);
        return sum;
    }

}
