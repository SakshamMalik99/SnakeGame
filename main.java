import java.util.*;
class Main{
static Node head;
    static Node tail;
    static Node body;
    public static void main(String[] args) {
        MatInitial m = new MatInitial();
        m.matinitial();
        Move move = new Move();
        move.move();
    }

    static Node snake()
    {
         head = new Node("<",4,5);
        body = new Node("-",4,6);
        tail  = new Node ("-",4,7);
        head.next = body;
        body.next = tail;
        return head;
    }

static Node rHead()
{
    return head;
}
    static Node rTail()
    {
        return tail;
    }


}
