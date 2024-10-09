package lv.rvt;

public class Stars {
    
    public static void printRectangle( int width, int height){
        for (int r = 0; r<height; r++){
            for (int s = 0; s < width; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
