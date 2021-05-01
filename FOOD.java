public class FOOD {
   static int []arr = new int[2];
   static MatInitial m = new MatInitial();
   public static void foodeat()
    {
        arr[0] = (int)(Math.random() * (9-1)+1);
        arr[1] = (int)(Math.random() * (9-1)+1);
        if(m.mat[arr[0]][arr[1]]==" ")
        m.mat[arr[0]][arr[1]]="O";
        else
            foodeat();
    }
    public static int[] foodmaker()
    {
        return arr;
    }

}
