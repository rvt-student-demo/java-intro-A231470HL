package lv.rvt;// klases atrašanās vieta projektā

public class App 
{
    public class ExerciseTemplate {
        public static void main(String[] args) {
            printUntilNumber(5);
            printUntilNumber(2);
        }
    
        public static void printUntilNumber(int number) {
            for (int i = 1; i <= number; i++) {
                System.out.println(i);
            }
        }
    }
}