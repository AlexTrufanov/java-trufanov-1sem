package thisisexam;

import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Transliterator {
    char[] example;
    String[] translation;

    public Transliterator(char[] rus, String[] eng) {
        this.example = rus;
        this.translation = eng;
    }

    String translateOneSymbol(char n) {
        for (int i = 0; i < example.length; i++) {
            if (example[i] == Character.toLowerCase(n)) {
                if (Character.isUpperCase(n)) {
                    if (translation[i].equals("")) {
                        return "";
                    }
                    return Character.toUpperCase(translation[i].charAt(0)) + translation[i].substring(1);
                }
                return translation[i];
            }

        }
        return String.valueOf(n);
    }

    String translate(String particle) {
        String line = "";
        String[] chars = particle.split("");
        char[] symbol = particle.toCharArray();
        for (int i = 0; i < symbol.length; i++) {
            line = particle.replace(chars[i], translateOneSymbol(symbol[i]));
        }
        return line;
    }

    public static Transliterator createICAO_DOC_9303() {
        char[] example = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] translation = new String[]{"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "", "e", "iu", "ia"};
        return new Transliterator(example, translation);
    }

    public void translateFile(String read, String print) throws Exception {
        String strings = Files.readString(Path.of(read));
        strings = translate(strings);
        try (PrintStream b = new PrintStream(print)) {
            b.print(strings);
        }
    }
}