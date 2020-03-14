package tries;

import java.util.HashMap;

public class Node {
    private HashMap<Character, Node> children = new HashMap<Character, Node>();
    private boolean isCompleteWord;
    private char value;

    public boolean hasChild(char key) {
        return children.containsKey(key);
    }

    public void setIsCompleteWord(boolean bool) {
        this.isCompleteWord = bool;
    }

    public Node getChild(char key) {
        return this.children.get(key);
    }

    public HashMap<Character, Node> getChildren() {
        return this.children;
    }

    public void setChildren(HashMap<Character, Node> children) {
        this.children = children;
    }

    public Node clone() {
        Node node = new Node(this.value);
        node.setIsCompleteWord(this.isCompleteWord);
        node.setChildren(this.children);
        return node;
    }

    public void appendChild(char key) {
        children.putIfAbsent(key, new Node(key));
    }

    public Node(char value) {
        this.value = value;
    }

}
