package rational;

public class Rational {
    private final int numerator;
    private final int denominator;

    public Rational(int num, int den) {
        if (den < 0) {
            den = -den;
            num = -num;
        }
        int nod = nod(num, den);
        this.numerator = num / nod;
        this.denominator = den / nod;
    }

    public Rational(int num) {
        this.numerator = num;
        this.denominator = 1;
    }

    private int nod(int a, int b) {
        if (b == 0) {
            return a;
        }
        return nod(b, a % b);
    }

    public String toString() {
        if (numerator == 0) {
            return "0";
        }
        if (denominator == 1) {
            return numerator + "";
        }
        return numerator + "/" + denominator;
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public Rational add(Rational r1) {
        return new Rational(r1.numerator * denominator + numerator * r1.denominator, r1.denominator * denominator );
    }

    public Rational sub(Rational r1) {
        return new Rational(r1.numerator * denominator - numerator * r1.denominator, r1.denominator * denominator);
    }
    public Rational mul(Rational r1) {
        return new Rational(r1.numerator * numerator, r1.denominator * denominator);
    }

    public Rational div(Rational r1) {
        return new Rational(r1.numerator * denominator, numerator * r1.denominator);
    }
}
