package src;

public class Main {

    public static void main (String [] args) {
        part1();

        String path = "2\\files\\toFind.txt";
        CubeGame game = new CubeGame(path);
        System.out.println(game.getIDSum(12, 13, 14));
        CubeGame game2 = new CubeGame(path);
        System.out.println(game2.getPowerSet());
    }

    public static void part1() {
        String path = "2\\files\\given.txt";
        CubeGame game1 = new CubeGame(path);
        int val = game1.getIDSum(12, 13, 14);
        if (8 == val) {
            System.out.println("Pass test 1");
        } else {
            System.out.println("Fail test 1. " + val);
        }

        CubeGame game = new CubeGame(path);
        int power = game.getPowerSet();
        if (2286 == power) {
            System.out.println("Pass test 2");
        } else {
            System.out.println("Fail test 2. " + power);
        }
    }

}
