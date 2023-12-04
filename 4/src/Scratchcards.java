
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Scratchcards {
    File file;
    ArrayList<Values> info;
    
    Scratchcards(String path) {
        this.info = new ArrayList<Values>();
        this.file = new File(path);
    }

    public int getPoints(){
        int sum = 0;

        this.parseInfo();
        
        for (Values v : info) {
            // v.printAll();
            // System.out.println("game: " + v.game);
            sum += v.getWinnings();
        }

        return sum;
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
        Values v = new Values(game);
        this.parseWinningNums(sections[0], v);
        this.parseMyNums(sections[1], v);
        info.add(v);
    }

    private void parseWinningNums(String line, Values v) {
        line = line.trim();
        String [] nums = line.split(" ");
        for (String num : nums) {
            if (!num.equals("")) {
                num = num.trim();
                v.winning.add(Integer.parseInt(num));
            }
        }
    }

    private void parseMyNums(String line, Values v) {
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
