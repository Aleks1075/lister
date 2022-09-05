public class Liste
{
    Node head = null;
    Node tail = null;


    Node insertFromHead(Node node)
    {

        if(isEmpty())
        {
        //er liste tom
        head = node;
        tail = node;
        return head;
        }


        //listen er ikke tom
        node.next = head;
        head.previous = node;
        head = node;
        return head;
    }

    Node insertFromTail(Node node)
    {
        if(isEmpty())
        {
            //er liste tom
            head = node;
            tail = node;
            return tail;
        }

        //listen er ikke tom
        node.previous = tail;
        tail.next = node;
        tail = node;
        return tail;
    }


    boolean isEmpty()
    {
        return head == null && tail == null;
    }


      String printFromHead() {

        StringBuilder stringBuilder = new StringBuilder();

        Node n = head;

        while (n != null)
        {
            //System.out.println(n.data);
            stringBuilder.append(n.data + " ");

            n = n.next;
        }
        return stringBuilder.toString().trim();
        //trim fjerner mellemrum i starten og slutningen af en string
    }

    /*
    void printFromTail(Node n)
    {
        while (n != null)
        {
            System.out.println(n.data);
            n = n.previous;
        }
    }

     */

    String printFromTail() {

        StringBuilder stringBuilder = new StringBuilder();

        Node n = tail;

        while (n != null)
        {
            //System.out.println(n.data);
            stringBuilder.append(n.data + " ");

            n = n.previous;
        }
        return stringBuilder.toString().trim();
        //trim fjerner mellemrum i starten og slutningen af en string
    }

    public void removeFromHead()
    {
        if (isEmpty())
        {
            return;
        }
        if (head == tail)
        {
            head = null;
            tail = null;
            return;
        }

        head = head.next;
        head.previous.next = null;
        head.previous = null;
    }
}
