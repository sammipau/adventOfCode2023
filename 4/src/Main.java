
public class Main {

    public static void main (String [] args) {
        test();

        String path = "4\\files\\toFind.txt";
        Scratchcards card = new Scratchcards(path);
        System.out.println(card.getPoints());
    }

    public static void test() {
        String path = "4\\files\\given.txt";
        Scratchcards game1 = new Scratchcards(path);
        int val = game1.getPoints();
        if (13 == val) {
            System.out.println("Pass test 1");
        } else {
            System.out.println("Fail test 1. " + val);
        }
    }

}
