/*
 * A simple test to see why we study data structures:
 * Mike's program - for loop doing a simple if statement
 * VS
 * Google search for the word cat.
 *
 */
public class ForLoopRunner {

    public static void main(String[] args) {
        long current = System.currentTimeMillis();
        int a = 1;
        for(int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            if(a % 2 == 0) {
                a = 1;
            }
            else {
                a++;
            }
        }

        System.out.println((System.currentTimeMillis() - current)/1000 + " seconds");
    }
}
