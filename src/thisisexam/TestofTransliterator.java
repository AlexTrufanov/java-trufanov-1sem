package thisisexam;

public class TestofTransliterator {
    public static void main(String[] args) throws Exception {
        char[] rus = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] eng = new String[]{"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "", "e", "iu", "ia"};

        Transliterator t = Transliterator.createICAO_DOC_9303();
        System.out.println(t.translateOneSymbol('я'));
        System.out.println(t.translateOneSymbol('$'));
        System.out.println(t.translate("Экзамен"));
        System.out.println(t.translate("ПриветЬЭтоьЯ"));

        char[] nums = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String[] texts = new String[]{"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

        Transliterator n = Transliterator.createICAO_DOC_9303();
        System.out.println(n.translateOneSymbol('7'));
        System.out.println(n.translateOneSymbol('?'));
        System.out.println(n.translate("717"));

        System.out.println(t.translateOneSymbol('Р'));
        System.out.println(t.translateOneSymbol('Я'));
        System.out.println(t.translateOneSymbol('Ь'));
        System.out.println(t.translate("Хайзенберг"));
        System.out.println(t.translate("Яблоко"));
        System.out.println(t.translate("ПАРАШЮТ"));
        t.translateFile("exam/a.txt", "exam/b.txt");

        Transliterator tt = new Transliterator(new char[]{'a'}, new String[]{"aa"});
        System.out.println(tt.translate("aaaa"));
    }
}
