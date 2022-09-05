import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest {

    Liste liste = new Liste();
    Node node0 = new Node("1");

    @org.junit.jupiter.api.Test
    void isEmpty()
    {
        liste.head = node0;
        liste.tail = node0;

        assertEquals(false, liste.isEmpty());
    }

    @Test
    void insertFromHead()
    {
        liste.insertFromHead(new Node("1"));
        assertEquals("1", liste.printFromHead());
    }

    @Test
    void insertFromTail()
    {
        liste.insertFromTail(new Node("1"));
        assertEquals("1", liste.printFromTail());
    }
}