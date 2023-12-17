import java.util.ArrayList;

public class Cards {
    public int game;
    public ArrayList<Integer> winning;
    public ArrayList<Integer> my;
    public int copies = 1;

    Cards (int game) {
        this.game = game;
        winning   = new ArrayList<>();
        my        = new ArrayList<>();
    }

    public int getNumWins() {
        int count = 0;

        for (int w : winning) {
            if (my.indexOf(w) != -1) {
                count++;
            }
        }

        return count;
    }

    public int getWinningsSum() {
        int sum   = 0;
        int count = getNumWins();

        if (count == 0) {
            return 0;
        }
        if (count == 1) {
            return 1;
        }

        sum = (int) Math.pow(2, count - 1);

        return sum;
    }

}
