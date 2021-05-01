import java.util.*;
public class Move {

    public static void move() {
        Main main = new Main();
        Node temp = main.rHead();
        Node tail = main.rTail();



         {
            Scanner a = new Scanner(System.in);
            System.out.println("Enter w(up) s(down) a(left) d(right) to move or 0 to EXIT");
            char m = a.next().charAt(0);
            if (m == 'a') {
                temp.a = "<";
                System.out.println(m);
                if (temp.next.y != temp.y - 1)
                    snakemove(temp, temp.x, temp.y - 1, tail);
                else {
                    System.out.println("Cannot MOVE");
                    move();
                }
            } else if (m == 'd') {
                System.out.println(m);
                temp.a = ">";
                if (temp.next.y != temp.y + 1)
                    snakemove(temp, temp.x, temp.y + 1, tail);
                else {
                    System.out.println("Cannot MOVE");
                    move();
                }
            } else if (m == 'w') {
                temp.a = "^";
                System.out.println(m);
                if (temp.next.x != temp.x - 1)
                    snakemove(temp, temp.x - 1, temp.y, tail);
                else {
                    System.out.println("Cannot MOVE");
                    move();
                }
            } else if (m == 's') {
                temp.a = "v";
                System.out.println(m);
                if (temp.next.x != temp.x + 1)
                    snakemove(temp, temp.x + 1, temp.y, tail);
                else {
                    System.out.println("Cannot MOVE");
                    move();
                }
            }
            else if(m!='0')
            move();
        }
    }
    public static void snakemove(Node head, int x, int y,Node tail) {
        FOOD f = new FOOD();
        int[] food = f.foodmaker();
        MatInitial ma = new MatInitial();

        if(y==0)
            y=8;
        else if(y==9)
            y=1;
        else if(x==0)
            x=8;
        else if(x==9)
            x=1;


        if(x==food[0]&&y==food[1])
        {
            Node nhead = new Node(head.a,x,y);
            head.a="-";
            nhead.next = head;
            Main m = new Main();
            m.head = nhead;
            f.foodeat();
            ma.printmat(nhead,null);
        }
        else {
        int newx=head.x;
        int newy=head.y;
        int prevx;
        int prevy;
        Node temp=head;
        Node t = new Node(tail.a,tail.x,tail.y);
        while(temp.next!=null) {

            prevx = temp.next.x;
            prevy = temp.next.y;
            temp.next.x=newx;
            temp.next.y=newy;
            newx = prevx;
            newy = prevy;
            temp = temp.next;

        }
        head.x = x;
        head.y=y;
        ma.printmat(head,t);}

    }

}
