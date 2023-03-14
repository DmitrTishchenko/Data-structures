/**
 * Класс сущности узла
 * @author sunlh
 *
 */
public class Node {

    private Node prev; // предыдущий узел

    private Node next; // следующий узел

    private int data; // данные

    public Node(int data) {
        this.data = data;
    }

    public void append(Node node) {
        if (this.next == null) {
            this.next = node;
            node.prev = this;
        } else {
            this.next.append(node);
        }

    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean hasPre() {
        return this.prev != null;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public int getData() {
        return data;
    }
}