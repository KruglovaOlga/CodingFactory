package gr.aueb.cf.ch19Collections.dll;

/**
 * Doubly Linked List is a dynamic list implementation
 * @param <T> the generic type
 */
public class DoublyLinkedList <T>{
    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList() {
        head = tail = null;
    }

    /**
     * Inserts a node at the front of the list
     * the time complexity is O(1)
     * @param t  the generic type
     */
    public void insertFront(T t) {
        Node<T> p = new Node<>();
        p.setValue(t);
        p.setPrev(null);
        p.setNext(head);

        head = p;
        if(p.getNext() == null) {
            tail = p;
        }else {
            p.getNext().setPrev(p);
        }
    }

    /**
     * Inserts a node at the end of the list
     * the time complexity is O(1)
     * @param t the generic type
     */
    public void insertEnd(T t) {
        Node<T> p = new Node<>();
        p.setValue(t);
        p.setPrev(tail);
        p.setNext(null);

        tail = p;
        if(p.getPrev() == null) {
            head = p;
        }else {
            p.getPrev().setNext(p);
        }
    }

    /**
     * Removes a node from the starting-end
     * of the list. the time complexity is O(1)
     */
    public void deleteFront() {
        //if list contains zero nodes
        if (isEmpty()) return;

        //if list contains one node
        if(head.getNext() == null) {
            head = tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }
    }

    /**
     * removes a node from the end of the list
     * the item complexity is O(1)
     */
    public void deleteEnd() {
        //if list contains zero nodes
        if (isEmpty()) return;

        //if list contains one node
        if(head.getNext() == null) {
            head = tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }
    }


    /**
     * Returns a reference to the node that holds
     * a specific value. Time complexity is O(n)
     * @param t the generic type
     * @return  the node reference with the specific value
     */
    public Node<T> get(T t) {
        for(Node<T> n = head; n != null; n = n.getNext()){
            if (n.getValue().equals(t)){
                return n;
            }
        }
        return null;
    }

    /**
     * the time complexity is O(n)
     */
    public void traverse() {
        for(Node<T> n = head; n!= null; n = n.getNext()) {
            System.out.println(n);
        }
    }

    public boolean isEmpty(){
        return (head == null) && (tail == null);
    }

}
