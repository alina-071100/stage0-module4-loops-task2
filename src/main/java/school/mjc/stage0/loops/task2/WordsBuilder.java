package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String phrase = "";
        int i = 0;
        while(i < chars.length) {
            phrase += chars[i];
            i++;
        }
        System.out.print(phrase);

    }
}
