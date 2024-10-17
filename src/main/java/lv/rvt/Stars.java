package lv.rvt;

public class Stars {
    
    public static void printTriangle( int size){
        for (int x = 1; x <= size; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
