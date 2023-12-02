package src;

import java.util.ArrayList;

public class Values {
    public int game;
    public ArrayList<Integer> reds;
    public ArrayList<Integer> blues;
    public ArrayList<Integer> greens;
    public int [] max;

    Values (int game) {
        this.game = game;
        reds = new ArrayList<>();
        blues = new ArrayList<>();
        greens = new ArrayList<>();
        max = new int [3];
    }

    public void printAll() {
        System.out.println("Game: " + game);
        System.out.println("Reds:");
        for (int r : reds) {
            System.out.print(r + " ");
        }
        
        System.out.println("\nblues:");
        for (int r : blues) {
            System.out.print(r + " ");
        }

        System.out.println("\ngreens:");
        for (int r : greens) {
            System.out.print(r + " ");
        }
        System.out.println();
    }

    public void setMax() {
        for (int i : reds) {
            if (i > max[0]) {
                max[0] = i;
            }
        }
        for (int i : blues) {
            if (i > max[1]) {
                max[1] = i;
            }
        }
        for (int i : greens) {
            if (i > max[2]) {
                max[2] = i;
            }
        }
    }

    public boolean hasNonZeroRed() {
        for (int i : reds) {
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasNonZeroBlue() {
        for (int i : blues) {
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasNonZeroGreen() {
        for (int i : greens) {
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasGreaterRed(int val) {
        for (int i : reds) {
            if (i > val) {
                return true;
            }
        }
        return false;
    }

    public boolean hasGreaterBlue(int val) {
        for (int i : blues) {
            if (i > val) {
                return true;
            }
        }
        return false;
    }

    public boolean hasGreaterGreen(int val) {
        for (int i : greens) {
            if (i > val) {
                return true;
            }
        }
        return false;
    }
}
