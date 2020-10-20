package example;



import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

public class ReverseLinkedListTest {

    @Test
    public void testSimpleCase() {
        Node third = new Node(3, null);
        Node second = new Node(2, third);
        Node first = new Node(1, second);

        Node reversed = ReverseLinkedList.reverseLL(first);

        assertEquals(3, reversed.value);
        assertEquals(2, reversed.next.value);
        assertEquals(1, reversed.next.next.value);
    }

    @Test
    public void testSingleCase() {
        Node first = new Node(1, null);

        Node reversed = ReverseLinkedList.reverseLL(first);

        assertEquals(1, reversed.value);
    }

    @Test
    public void testNull() {
        Node shouldBeNull = ReverseLinkedList.reverseLL(null);

        assertEquals(null, shouldBeNull);
    }

}
