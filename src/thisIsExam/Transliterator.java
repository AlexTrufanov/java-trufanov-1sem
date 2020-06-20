package thisIsExam;

public class Transliterator {
    char[] example;
    String[] translation;

    public Transliterator(char[] rus, String[] eng) {
        this.example = rus;
        this.translation = eng;
    }

    String translateOneSymbol(char n) {
        for(int i = 0; i < example.length; i++) {
            if(example[i] == n) {
                return translation[i];
            }
        }
        return String.valueOf(n);
    }

    String translate(String particle) {
        String[] chars = particle.split("");
        char[] symbol = particle.toCharArray();
        for (int i = 0; i < symbol.length; i++) {
            particle = particle.replaceAll(chars[i], translateOneSymbol(symbol[i]));
        }
        return particle;
    }
}