import java.util.HashMap;

/**
 * A Trie Library
 */
public class Tries {
    public static class Node {
        private HashMap<Character, Node> children;
        private boolean isCompleteWord;
        private char value;

        public boolean hasChild(char key) {
            return children.containsKey(key);
        }
        
    }

    public static class Trie {
        Node rootNode;
    }
}
