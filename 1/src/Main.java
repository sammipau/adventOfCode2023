package src;

public class Main {

    public static void main (String [] args) {
        // part1();
        // part2();
        // part3();

        // String path = "./files/calibrationDoc.txt";
        String path = "1\\files\\jacob.txt";
        Calibration cal = new Calibration(path);
        System.out.println(cal.getCalibrationValues());
    }

    public static void part1() {
        String path = "1\\files\\example1.txt";
        Calibration cal = new Calibration(path);
        if (142 == cal.getCalibrationValues()) {
            System.out.println("Pass test 1");
        } else {
            System.out.println("Fail test 1");
        }
    }

    public static void part2() {
        String path = "1\\files\\example2.txt";
        Calibration cal = new Calibration(path);
        int actual = cal.getCalibrationValues();
        if (281 == actual) {
            System.out.println("Pass test 2");
        } else {
            System.err.println("Fail test 2: " +  actual);
        }
    }

    public static void part3() {
        String path = "1\\files\\ex3.txt";
        Calibration cal = new Calibration(path);
        int actual = cal.getCalibrationValues();
        if (864 == actual) {
            System.out.println("Pass test 3");
        } else {
            System.err.println("Fail test 3: " +  actual);
        }
    }

}
