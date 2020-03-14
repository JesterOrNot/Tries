package tries;

import java.util.HashMap;

/**
 * A Trie Library
 */
public class Tries {
    public Node rootNode;
    public Node currentNode;

    public Tries() {
        this.rootNode = new Node('\033');
    }

    /**
     * 
     * @param words The words to be inserted into to the Trie
     */
    public Tries(String[] words) {
        this.rootNode = new Node('\033');
        for (String word : words) {
            this.insert(word);
        }
    }

    public boolean hasWord(String word) {
        HashMap<Character, Node> children = rootNode.getChildren();
        Node currentNode = rootNode;
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (currentNode.hasChild(character)) {
                currentNode = children.get(character);
                children = currentNode.getChildren();
            } else {
                return false;
            }
        }
        return true;
    }

    public void insert(String word) {
        Node currentNode = rootNode;
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (!currentNode.hasChild(character)) {
                currentNode.appendChild(character);
            }
            currentNode = currentNode.getChild(character);
            if (i == word.length() - 1) {
                currentNode.setIsCompleteWord(true);
            }
        }
    }
}
