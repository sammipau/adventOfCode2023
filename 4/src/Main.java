
public class Main {

    public static void main (String [] args) {
        test();
        part2();

        String path = "4\\files\\toFind.txt";
        Scratchcards card = new Scratchcards(path);

        card = new Scratchcards(path);
        System.out.println(card.getNumCards());
    }

    public static void part1() {
        String path = "4\\files\\given.txt";
        Scratchcards game1 = new Scratchcards(path);
        int val = game1.getPoints();
        if (13 == val) {
            System.out.println("Pass test 1");
        } else {
            System.out.println("Fail test 1. " + val);
        }
    }

    public static void test() {
        String path = "4\\files\\test.txt";
        Scratchcards game1 = new Scratchcards(path);
        int val = game1.getNumCards();
        if (44 == val) {
            System.out.println("Pass test 1");
        } else {
            System.out.println("Fail test 1. " + val);
        }
    }

    public static void part2() {
        String path = "4\\files\\given.txt";
        Scratchcards game1 = new Scratchcards(path);
        int val = game1.getNumCards();
        if (30 == val) {
            System.out.println("Pass test 2");
        } else {
            System.out.println("Fail test 2. " + val);
        }
    }

}
