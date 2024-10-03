package lv.rvt;// klases atrašanās vieta projektā

public class App 
{
    public class Main {
        public static void main(String[] args) {
            dalisanaArTris(3, 6);
            dalisanaArTris(2, 10);
        }
    
        public static void dalisanaArTris(int beginning, int end) {
            for (int i = beginning; i <= end; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}