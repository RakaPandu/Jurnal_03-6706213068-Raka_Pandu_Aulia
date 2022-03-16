package Tugas_3;

import java.util.NoSuchElementException;

public class Generic<E> {
    ListNode<E> firstNode;
    ListNode<E> lastNode;
    String name;

    public Generic() {
        this("lingked list");
    }

    public Generic(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public void insertAtFront(E insertItem) {
        ListNode newNode = new ListNode(insertItem);
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else { // firstNode refers to new node
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public void insertAtBack(E insertItem) {
        ListNode newNode = new ListNode(insertItem);
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }

    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " is empty");
        }
        E removedItem = lastNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else { // locate new last node
            ListNode<E> current = firstNode;
            while (current.next != lastNode) {
                current = current.next;
            }
            lastNode = current;
            current.next = null;
        }
        return removedItem;
    }

    public ListNode removeFromFront()
    {
        if (firstNode == null)
            return null;

        ListNode temp = firstNode;
        firstNode = firstNode.next;

        return firstNode;
    }

    private boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }
        System.out.printf("The %s is: %n", name);
        ListNode<E> current = firstNode;
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
        System.out.println();
    }
}
