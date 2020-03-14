package tries;

import java.util.HashMap;

/**
 * A Trie Library
 */
public class Tries {
    public Node rootNode;

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
        Node theNode = this.searchNode(word);
        if (theNode != null && theNode.isCompleteWord())
            return true;
        else
            return false;
    }

    public boolean startsWith(String prefix) {
        if (searchNode(prefix) == null) {
            return true;
        } else {
            return false;
        }
    }

    public Node searchNode(String query) {
        HashMap<Character, Node> children = this.rootNode.getChildren();
        Node currentNode = this.rootNode;
        for (int i = 0; i < query.length(); i++) {
            char character = query.charAt(i);
            if (currentNode.hasChild(character)) {
                currentNode = children.get(character);
                children = currentNode.getChildren();
            } else {
                return null;
            }
        }
        return currentNode;
    }

    public void insert(String word) {
        Node currentNode = this.rootNode;
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
