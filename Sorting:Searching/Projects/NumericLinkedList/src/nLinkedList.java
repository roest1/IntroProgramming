package numericlinkedlist;

/**
 *
 * @author rileyoest
 *
 */
public class nLinkedList {

    Node head;

    public nLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtBeginning(int new_data) {

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void insertAtEnd(int new_data) {

        Node new_node = new Node(new_data);

        if (head == null) {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
        return;
    }

    public void printList() {
        if (head == null) {
            return;
        }

        Node current = head;
        while (current.next != null) {
            System.out.print(current.key + ", ");
            current = current.next;

        }

        System.out.print(current.key + "\n");
    }

    //Complete this method
    public void deleteAt(int position) {
        if (head == null) {
            return;
        }

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            return;
        }
        Node next = temp.next.next;

        temp.next = next;

    }

    //Complete this method
    public void deleteValue(int data) {

        Node temp = head, prev = null;

        if (temp != null && temp.key == data) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.key != data) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;

    }
}
