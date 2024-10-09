package lv.rvt;

public class Stars {
    
    public static void printSquare( int size){
        for (int r = 0; r<size; r++){
            for (int s = 0; s < size; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
