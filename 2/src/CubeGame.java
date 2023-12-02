package src;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class CubeGame {
    File file;
    ArrayList<Values> info;
    
    CubeGame(String path) {
        this.info = new ArrayList<Values>();
        this.file = new File(path);
    }

    public int getIDSum(int r, int g, int b){
        int sum = 0;

        this.parseInfo();

        for (Values v : info) {
            if ((r == 0 && v.hasNonZeroRed()) || (g == 0 && v.hasNonZeroGreen()) || (b == 0 && v.hasNonZeroBlue())) {
                continue;
            } else if (v.hasGreaterRed(r) || v.hasGreaterBlue(b) || v.hasGreaterGreen(g)) {
                continue;
            } else {
                sum += v.game;
            }
        }

        return sum;
    }

    public int getPowerSet() {
        int sum = 0;

        this.parseInfo();

        for (Values v : info) {
            v.setMax();
            sum += (v.max[0] * v.max[1] * v.max[2]);
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
        String [] sections = line.split(";");
        Values v = new Values(game);
        for (String section : sections) {
            String [] parts = section.split(",");
            for (String part : parts) {
                if (part.indexOf("red") != -1) {
                    part = part.substring(0, part.length() - 3);
                    part = part.trim();
                    v.reds.add(Integer.parseInt(part));
                } else if (part.indexOf("blue") != -1) {
                    part = part.substring(0, part.length() - 4);
                    part = part.trim();
                    v.blues.add(Integer.parseInt(part));
                } else if (part.indexOf("green") != -1) {
                    part = part.substring(0, part.length() - 5);
                    part = part.trim();
                    v.greens.add(Integer.parseInt(part));
                }
            }
        }
        info.add(v);
    }
}
