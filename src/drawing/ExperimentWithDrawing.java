package drawing;

public class ExperimentWithDrawing {
    public static void main(String[] args) {
        Drawing pic = new Drawing(7, 7, '.');
        pic.print();
        System.out.println("---------------");
        pic.setPoint(3, 1, '*');
        pic.print();
        System.out.println("---------------");
        pic.drawVerticalLine(2, 2, 4, '|');
        pic.print();
        System.out.println("---------------");
        pic.drawHorizontalLine(2, 3, 6, '=');
        pic.print();
    }
}
