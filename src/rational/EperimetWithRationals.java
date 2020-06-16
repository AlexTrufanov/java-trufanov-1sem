package rational;

public class EperimetWithRationals {

    public static void main(String[] args) {
        Rational r1 = new Rational(1, 6);
        Rational r2 = new Rational(3, 9);
        System.out.println(r1.toDouble());
        System.out.println(r2.toDouble());
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r1.add(r2));
        System.out.println(r1.sub(r2));
        System.out.println(r1.div(r2));
        System.out.println(r1.mul(r2));
    }
}
