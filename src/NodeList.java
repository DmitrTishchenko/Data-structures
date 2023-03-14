public class NodeList {

    Node head;
    Node last;

    /**
     * Добавить
     * @param node
     */
    public void append(Node node) {
        if (head.getNext() == null) {
            head.setNext(node);
            node.setPrev(head);
        } else {
            head.getNext().append(node);
        }
    }

    /**
     * Траверс
     */
    public String toString() {
        Node curr = head;
        StringBuilder sBuilder = new StringBuilder();
        while (curr != null) {
            sBuilder.append(curr.getData()).append(curr.hasNext() ? " " : "");
            curr = curr.getNext();
        }
        return sBuilder.toString();
    }

    /**
     * Сверху вниз
     */
    public String reverse() {
        Node curr = head;
        Node newHead = null;
        Node newLast = null;
        while (curr != null) {
            Node prev = curr.getPrev();
            Node next = curr.getNext();
            if (prev == null) newLast = curr; // Предыдущий узел пуст, как новый хвостовой узел
            if (next == null) newHead = curr; // Следующий узел пуст, как новый головной узел
            curr.setNext (prev); // Следующий узел текущего узла используется как предыдущий узел текущего узла
            curr.setPrev (next); // Предыдущий узел текущего узла является следующим узлом текущего узла
            curr = curr.getPrev (); // Продолжаем обработку следующего узла исходного узла связанного списка
        }
        head = newHead; // Устанавливаем головной узел
        last = newLast; // Устанавливаем конечный узел
        return this.toString();
    }
}