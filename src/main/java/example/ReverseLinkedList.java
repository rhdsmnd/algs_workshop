package example;

public class ReverseLinkedList {

    public static Node reverseLL(Node head) {
        Node newHead = null;

        while (head != null) {
            Node temp = head.next;

            head.next = newHead;
            newHead = head;

            head = temp;
        }

        return newHead;
    }
}
