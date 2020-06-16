package regular;

public class Regexes {

    public static void main(String[] args) {
        System.out.println(emailcheck("alext@gmail.com"));
        System.out.println(truetext("Это строка , у которой зачем-то написаны два пробела перед запятой"));
        System.out.println(turndownforwhat("abc-def ghi-jkl"));
    }

    public static boolean emailcheck(String s) {
        return s.matches("[a-zA-Z_.-]+@[a-zA-Z_.-]+\\.([a-z]{2,4}|)");
         // ну или s.toLowerCase().matches("[a-z_.-]+@[a-z_.-]+\\.([a-z]{2,4}|)");
    }

    public static String truetext(String s){
        return s.replaceAll("\\s,", ",");
    }

    public static String turndownforwhat(String s){
        return s.replaceAll("([a-zA-Z]+)-([a-zA-Z]+)", "$2-$1");
    }
}
