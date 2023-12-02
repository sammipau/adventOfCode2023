package src;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Calibration {
    File file;
    ArrayList<String> lines;
    int first = 999999999;
    int last = -1;
    String [] nums = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public Calibration(String path) {
        this.lines = new ArrayList<String>();
        this.file  = new File(path);
    }

    public int getCalibrationValues() {
        this.populateLines();
        return this.extractSum();
    }

    private void populateLines() {
        try {
            Scanner scan = new Scanner(this.file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                lines.add(line);
            }
            scan.close();
        } catch (Exception e) {
            System.out.println("Error! " + e);
        }
    }

    private int extractSum() {
        int sum = 0;
        // System.out.println("extract sum");
        for (String line : lines) {
            String str = this.getNumString(line);
            // System.out.println(this.strToInt(str));
            sum += this.strToInt(str);
        }

        return sum;
    }

    private String getNumString(String line) {
        String ret = "";

        int f = this.getFirst(line);
        int l = this.getLast(line);

        if (f != 0){
           ret += f; 
        }
        if (l != 0) {
            ret += l; 
        }

        for (int x = 0; x < line.length(); x++) {
            if (Character.isDigit(line.charAt(x)) && line.charAt(x) != '0') {
                if (f == 0 || l == 0) {
                    ret += line.charAt(x); 
                }
                else if (x < this.first) {
                   ret = line.charAt(x) + ret; 
                   this.first = x;
                }
                else if (x > this.last) {
                    ret += line.charAt(x); 
                    this.last = x;
                }
            }
        }
        this.first = 999999999;
        this.last = 0;
        return ret;
    }

    private int getFirst(String line) {
        int ret = 0;
        for (String num : nums) {
            int index = line.indexOf(num);
            if (index != -1) {
                if (index < this.first) {
                    this.first = index;
                    ret = this.wordToInt(num);
                }
            }
        }

        return ret;
    }

    private int getLast(String line) {
        int ret = 0;
        for (String num : nums) {
            int index = line.lastIndexOf(num);
            if (index != -1) {
                if (index > this.last) {
                    this.last = index;
                    ret = this.wordToInt(num);
                }
            }
        }

        return ret;
    }

    private int wordToInt(String num) {
        int ret = 0;
        switch(num) {
            case "one":
                ret = 1;
                break;
            case "two":
                ret = 2;
                break;
            case "three":
                ret = 3;
                break;
            case "four":
                ret = 4;
                break;
            case "five":
                ret = 5;
                break;
            case "six":
                ret = 6;
                break;
            case "seven":
                ret = 7;
                break;
            case "eight":
                ret = 8;
                break;
            case "nine":
                ret = 9;
                break;
        }

        return ret;
    }

    private int strToInt(String str) {
        int ret = 0;
        int len = str.length();
        if (len == 0) {
            return ret;
        }

        if (len == 1) {
            str += str;
        } else {
            if (len != 2) {
                String temp = str.substring(0, 1) + str.substring(len - 1, len);
                str = temp;
            }
        }

        ret = Integer.parseInt(str);
        return ret;
    }

}