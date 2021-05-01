public class MatInitial {
   static String[][] mat = new String[10][10];
    static void matinitial()
    {
        for(int i=0;i<10;i++)
        {for(int j=0;j<10;j++)
        { mat[i][j] = " ";} }

        for(int i=0;i<10;i++)
        { mat[0][i] = "*";}

        for(int i=0;i<10;i++)
        { mat[9][i] = "*"; }

        for(int i=1;i<9;i++)
        { mat[i][0] = "|"; }

        for(int i=1;i<9;i++)
        { mat[i][9] = "|"; }
        
        Main sn = new Main();
        Node temp = sn.snake();
        while(temp!=null)
        {
            mat[temp.x][temp.y] = temp.a;
            temp=temp.next;
        }

        FOOD f = new FOOD();
        f.foodeat();


        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printmat(Node temp,Node tail) {
        if (tail != null)
            mat[tail.x][tail.y] = " ";

        if (mat[temp.x][temp.y] != " " && mat[temp.x][temp.y] != "O"&&mat[temp.x][temp.y] != "_"&&mat[temp.x][temp.y] != "|")
            System.out.println("YOU ARE OUT");

        else {
            while (temp != null) {
                mat[temp.x][temp.y] = temp.a;
                temp = temp.next;
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
            Move m = new Move();
            m.move();
        }

}
}
