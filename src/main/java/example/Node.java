package example;

public class Node {

    public Node() { }

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public int value;
    public Node next;

    @Override
    public String toString() {

        String printedList = String.valueOf(this.value) + " -> ";

        if (this.next == null) {
            printedList += "null";
        } else {
            printedList += this.next.toString();
        }

        return printedList;
    }

}
