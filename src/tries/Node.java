package tries;

import java.util.HashMap;

public class Node {
    private HashMap<Character, Node> children = new HashMap<Character, Node>();
    private boolean isCompleteWord;
    private char value;

    protected boolean hasChild(char key) {
        return children.containsKey(key);
    }

    protected char getValue() {
        return value;
    }

    protected void setValue(char value) {
        this.value = value;
    }

    protected void setIsCompleteWord(boolean bool) {
        this.isCompleteWord = bool;
    }

    protected boolean isCompleteWord() {
        return this.isCompleteWord;
    }

    protected Node getChild(char key) {
        return this.children.get(key);
    }

    protected HashMap<Character, Node> getChildren() {
        return this.children;
    }

    protected void setChildren(HashMap<Character, Node> children) {
        this.children = children;
    }

    protected void appendChild(char key) {
        children.putIfAbsent(key, new Node(key));
    }

    protected Node(char val) {
        setValue(val);
    }

}
