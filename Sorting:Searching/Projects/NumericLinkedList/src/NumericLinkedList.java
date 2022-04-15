package numericlinkedlist;

/**
 *
 * @author rileyoest
 */
public class NumericLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        nLinkedList myList = new nLinkedList();
        myList.insertAtBeginning(7);
        myList.insertAtBeginning(6);
        myList.insertAtBeginning(5);
        myList.insertAtBeginning(4);
        myList.insertAtBeginning(3);
        myList.insertAtBeginning(2);
        myList.insertAtBeginning(1);
        myList.insertAtBeginning(0);

        myList.printList();

        myList.deleteAt(5);
        myList.printList();

        myList.deleteValue(6);
        myList.printList();

        myList.deleteAt(0);
        myList.printList();

        myList.deleteValue(4);
        myList.printList();

        myList.deleteValue(7);
        myList.printList();

        myList.deleteAt(8);
        myList.printList();

    }

}
