
/**
 * App
 */
import tries.Tries;

public class App {

    public static void main(String[] args) {
        String[] words = { "Hello", "Hell", "Word", "Word", "Shell", "Wording" };
        Tries myTrie = new Tries(words);
        System.out.println(myTrie.hasWord("Process"));
        System.out.println(myTrie.hasWord("Hell"));
        System.out.println(myTrie.hasWord("Shell"));
        System.out.println(myTrie.hasWord("Shells"));
        System.out.println(myTrie.hasWord("Wording"));
        System.out.println(myTrie.hasWord("H"));
        System.out.println(myTrie.hasPrefix("H"));
    }
}
