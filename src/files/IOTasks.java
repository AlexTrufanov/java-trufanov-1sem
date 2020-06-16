package files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class IOTasks {
    public static void main(String[] args) throws Exception {
        System.out.println(sumfromfile(new File("forsum.txt")));
        String[] arofstr = new String[]{"abc", "def", "g"};
        arrayofstrings(new File("forstrings.txt"), arofstr);
    }

    public static int sumfromfile(File forsum) throws Exception {
        int sumofall = 0;
        try (Scanner fromfile = new Scanner(forsum, "utf8")) {
            while (fromfile.hasNext()) {
                if (fromfile.hasNextInt()) {
                    int a = fromfile.nextInt();
                    sumofall += a;
                } else fromfile.next();
            }
        }
        return sumofall;
    }

    public static void arrayofstrings(File forstrings, String[] lines) throws Exception {
        try (PrintStream print = new PrintStream(forstrings,"utf8" )) {
            for (String i : lines){
                print.println(i);
            }
        }
    }
}
