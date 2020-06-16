package drawing;


public class Drawing {
    private final int x;
    private final int y;
    private final char lit;
    private final char[][] array;

    public Drawing(int x, int y, char lit) {
        this.x = x;
        this.y = y;
        this.lit = lit;
        this.array = new char[x][y];
        for (int a = 0; a < x; a++) {
            for (int b = 0; b < y; b++)
                this.array[a][b] = lit;
        }
    }

    public char[][] getArray() {
        return array;
    }

    public void print() {
        for (int a = 0; a < x; a++) {
            for (int b = 0; b < y; b++)
                System.out.print(array[b][a] + " ");
            System.out.println();
        }
    }

    public void setPoint(int high, int width, char sim) {
        if (high >= 0 && width < y && width >= 0 && width < x) {
            array[width][high] = sim;
        }

    }

    public void drawVerticalLine(int v, int h1, int h2, char lit) {
        if (v >= 0 && v < x && h1 >= 0 && h1 < y && h2 >= 0 && h2 < y) {
            int a = Math.min(h1, h2);
            int b = Math.max(h1, h2);
            for (int i = a; i <= b; i++)
                array[v][i] = lit;
        }
    }

    public void drawHorizontalLine(int h, int v1, int v2, char lit) {
        for (int i = Math.min(v1, v2); i < Math.max(v1, v2); i++) {
            array[i][h] = lit;
        }
    }
}
