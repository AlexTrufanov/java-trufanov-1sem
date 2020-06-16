package base;

public class PrimalityTest {
    public static void main(String[] args) {
        System.out.println(test(41));
    }
    public static boolean test(int n){
        return(n%2 != 0 || n%3 != 0 || n%5 != 0 || n%7 != 0);

    }
}