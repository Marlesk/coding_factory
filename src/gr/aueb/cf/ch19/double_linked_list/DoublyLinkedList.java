package gr.aueb.cf.ch19.double_linked_list;

public class DoublyLinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;

    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);
        tmp.setPrev(null);

        if (head == null) tail = tmp;
        else head.setPrev(tmp);

        head = tmp;
    }

    public void insertLst(T t) {
        if (head == null) {
            insertFirst(t);
            return;
        }

        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);
        tmp.setPrev(tail);
        tail.setNext(tmp);
        tail = tmp;
    }

    public Node<T> removeFirst() {
        Node<T> nodeToReturn;

        if (isEmpty()) return null;

        nodeToReturn = head;
        if (head.getNext() == null) tail = null;
        head = head.getNext();
        head.setPrev(null);
        return nodeToReturn;
    }

    public Node<T> removeLast() {
        Node<T> nodeToReturn;
        if (isEmpty() || head.getNext() == null) {
            return removeFirst();
        }

        nodeToReturn = tail; //επιστέφουμε τον κόμβο που αφαιρούμε (τον τελευταίο)
        tail = tail.getPrev();
        tail.setNext(null);
        return nodeToReturn;
    }

    public Node<T> get(T t) {
        Node<T> nodeToReturn = null;

        for (Node<T> n = head; n != null; n = n.getNext()) {
            if (n.getItem().equals(t)) {
                nodeToReturn = n;
                break;
            }
        }
        return nodeToReturn;
    }

    public void traverse() {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n.getItem());
        }
    }

    public void traverseReverse() {
        for (Node<T> n = tail; n != null; n = n.getPrev()) {
            System.out.println(n.getItem());
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}
