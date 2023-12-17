
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Scratchcards {
    File file;
    ArrayList<Cards> info;
    
    Scratchcards(String path) {
        this.info = new ArrayList<Cards>();
        this.file = new File(path);
    }

    public int getNumCards() {
        int sum = 0;

        this.parseInfo();
        this.setCopies();

        for (Cards card : info) {
            sum += card.copies;
        }

        return sum;
    }


    public int getPoints(){
        int sum = 0;

        this.parseInfo();

        for (Cards card : info) {
            sum += card.getWinningsSum();
        }

        return sum;
    }

    private void setCopies() {
        for (Cards card : info) {
            for (int y = 1; y <= card.copies; y++){
                int winnings = card.getNumWins();
                for (int x = 1; x <= winnings; x++) {
                    int index = card.game + x;
                    if (index <= this.info.size()) {
                        this.info.get(index - 1).copies++;
                    }
                }                
            }
        }
    }

    private void parseInfo() {
        try {
            int count = 1;
            Scanner scan = new Scanner(this.file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                Scanner internal = new Scanner(line);
                internal.useDelimiter(":");
                internal.next();
                String data = internal.next();
                parseNums(data, count);
                internal.close();
                count++;
            }
            scan.close();
        } catch (Exception e) {
            System.out.println("Error! " + e);
        }
    }

    private void parseNums(String line, int game) {
        String [] sections = line.split("\\|");
        Cards v = new Cards(game);
        this.parseWinningNums(sections[0], v);
        this.parseMyNums(sections[1], v);
        info.add(v);
    }

    private void parseWinningNums(String line, Cards v) {
        line = line.trim();
        String [] nums = line.split(" ");
        for (String num : nums) {
            if (!num.equals("")) {
                num = num.trim();
                v.winning.add(Integer.parseInt(num));
            }
        }
    }

    private void parseMyNums(String line, Cards v) {
        line = line.trim();
        String [] nums = line.split(" ");
        for (String num : nums) {
            if (!num.equals("")) {
                num = num.trim();
                v.my.add(Integer.parseInt(num)); 
            }
        }
    }
}
