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

    @Test
    void removeFromHead()
    {
        //test om den virker hvis listen er tom
        liste.removeFromHead();
        assertEquals("", liste.printFromHead());

        //test om den virker hvis listen ikke er tom
        liste.insertFromHead(new Node("Hello"));
        liste.removeFromHead();
        assertEquals("", liste.printFromHead());

        //fjern ting
        liste.insertFromHead(new Node("Hello"));
        liste.insertFromHead(new Node("hej"));
        liste.insertFromHead(new Node("med"));
        liste.insertFromHead(new Node("dig"));

        liste.removeFromHead();

        assertEquals("med hej Hello", liste.printFromHead());
    }
}