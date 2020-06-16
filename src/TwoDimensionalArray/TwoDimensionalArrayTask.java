package TwoDimensionalArray;

import java.util.Arrays;

public class TwoDimensionalArrayTask {
    public static void main(String[] args) {
        char[][] c = createTable(20, '.');
        printTable(c);

        System.out.println("============ Заполним строки: ==========");
        fillFirstAndLastLines(c, '#');
        printTable(c);

        System.out.println("============ Заполним столбцы: =========");
        fillFirstAndLastColumns(c, '#');
        printTable(c);
    }

    public static char[][] createTable(int n, char lit) {
        char[][] table = new char[n][n];
        for (char[] i : table) {
            Arrays.fill(i, lit);
        }
        return table;
    }

    public static void printTable(char[][] array) {
        for (char[] i : array) {
            for (char x : i) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void fillFirstAndLastLines(char[][] array, char lit) {
        Arrays.fill(array[0], lit);
        Arrays.fill(array[array.length -1], lit);
    }

    public static void fillFirstAndLastColumns(char[][] array, char lit) {
        for (int i = 0; i < array.length; i++) {
            array[i][0] = lit;
            array[i][array.length -1] = lit;
        }
    }
}
