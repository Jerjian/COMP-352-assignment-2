import java.io.IOException;
import java.io.PrintWriter;

public class hitZeroRecursion {
    public static void main(String[] args) {
        System.out.println("--Testing all hitZeroRecursions and hitZero with a list to log.txt..--");
        PrintWriter out;

        try {
            out = new PrintWriter("hitZeroRecursion.txt");
            out.write("--Testing hitZeroRecursion--\n");

            int[] hitZeroTest1 = {4, 8, 5, 2, 3, 5, 1, 6, 4, 0};
            out.write("Testing hitZeroRecursion function with array " + (1) + " starting at position " + 0 + ": " + hitZeroRecursion(hitZeroTest1, hitZeroTest1.length, 0) + "\n");

            int[] hitZeroTest2 = {5, 8, 2, 3, 1, 5, 0};
            out.write("Testing hitZeroRecursion function with array " + (2) + " starting at position " + 1 + ": " + hitZeroRecursion(hitZeroTest2, hitZeroTest2.length, 1) + "\n");

            int[] hitZeroTest3 = {2, 4, 2, 2, 2, 4, 4, 0};
            out.write("Testing hitZeroRecursion function with array " + (3) + " starting at position " + 2 + ": " + hitZeroRecursion(hitZeroTest3, hitZeroTest3.length, 2) + "\n");

            int[] hitZeroTest4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
            out.write("Testing hitZeroRecursion function with array " + (4) + " starting at position " + 3 + ": " + hitZeroRecursion(hitZeroTest4, hitZeroTest4.length, 3) + "\n");

            int[] hitZeroTest5 = {1, 2, 5, 2, 1, 0};
            out.write("Testing hitZeroRecursion function with array " + (5) + " starting at position " + 4 + ": " + hitZeroRecursion(hitZeroTest5, hitZeroTest5.length, 4) + "\n");

            int[] hitZeroTest6 = {1, 0};
            out.write("Testing hitZeroRecursion function with array " + (6) + " starting at position " + 1 + ": " + hitZeroRecursion(hitZeroTest6, hitZeroTest6.length, 1) + "\n");

            int[] hitZeroTest7 = {0};
            out.write("Testing hitZeroRecursion function with array " + (7) + " starting at position " + 0 + ": " + hitZeroRecursion(hitZeroTest7, hitZeroTest7.length, 0) + "\n");

            int[] hitZeroTest8 = {1};
            out.write("Testing hitZeroRecursion function with array " + (8) + " starting at position " + 0 + ": " + hitZeroRecursion(hitZeroTest8, hitZeroTest8.length, 0) + "\n");

            int[] hitZeroTest9 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
            out.write("Testing hitZeroRecursion function with array " + (9) + " starting at position " + 1 + ": " + hitZeroRecursion(hitZeroTest9, hitZeroTest9.length, 1) + "\n");

            int[] hitZeroTest10 = {8, 8, 1, 2, 3, 4, 5, 6, 4, 8, 9, 10, 0};
            out.write("Testing hitZeroRecursion function with array " + (10) + " starting at position " + 3 + ": " + hitZeroRecursion(hitZeroTest10, hitZeroTest10.length, 3) + "\n");

            int[] hitZeroTest11 = {2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 0};
            out.write("Testing hitZeroRecursion function with array " + (11) + " starting at position " + 6 + ": " + hitZeroRecursion(hitZeroTest11, hitZeroTest11.length, 6) + "\n");

            int[] hitZeroTest12 = {1, 5, 4, 2, 6, 7, 3, 1, 3, 0};
            out.write("Testing hitZeroRecursion function with array " + (12) + " starting at position " + 4 + ": " + hitZeroRecursion(hitZeroTest12, hitZeroTest12.length, 4) + "\n");

            int[] hitZeroTest13 = {1, 2, 5, 6, 1, 5, 6, 3, 5, 0};
            out.write("Testing hitZeroRecursion function with array " + (13) + " starting at position " + 3 + ": " + hitZeroRecursion(hitZeroTest13, hitZeroTest13.length, 3) + "\n");

            int[] hitZeroTest14 = {6, 2, 4, 1, 5, 6, 2, 3, 1, 2, 0};
            out.write("Testing hitZeroRecursion function with array " + (14) + " starting at position " + 2 + ": " + hitZeroRecursion(hitZeroTest14, hitZeroTest14.length, 2) + "\n");

            int[] hitZeroTest15 = {5, 4, 5, 3, 2, 5, 3, 4, 2, 1, 0};
            out.write("Testing hitZeroRecursion function with array " + (15) + " starting at position " + 1 + ": " + hitZeroRecursion(hitZeroTest15, hitZeroTest15.length, 1) + "\n");

            int[] hitZeroTest16 = {4, 8, 5, 2, 3, 5, 1, 0};
            out.write("Testing hitZeroRecursion function with array " + (16) + " starting at position " + 0 + ": " + hitZeroRecursion(hitZeroTest16, hitZeroTest16.length, 0) + "\n");

            int[] hitZeroTest17 = {4, 8, 5, 2, 1, 0};
            out.write("Testing hitZeroRecursion function with array " + (17) + " starting at position " + 5 + ": " + hitZeroRecursion(hitZeroTest17, hitZeroTest17.length, 5) + "\n");

            int[] hitZeroTest18 = {8, 3, 1, 4, 5, 6, 2, 1, 3, 5, 0};
            out.write("Testing hitZeroRecursion function with array " + (18) + " starting at position " + 3 + ": " + hitZeroRecursion(hitZeroTest18, hitZeroTest18.length, 3) + "\n");

            int[] hitZeroTest19 = {4, 5, 1, 2, 5, 6, 1, 2, 1, 4, 0};
            out.write("Testing hitZeroRecursion function with array " + (19) + " starting at position " + 5 + ": " + hitZeroRecursion(hitZeroTest19, hitZeroTest19.length, 5) + "\n");

            int[] hitZeroTest20 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
            out.write("Testing hitZeroRecursion function with array " + (20) + " starting at position " + 3 + ": " + hitZeroRecursion(hitZeroTest20, hitZeroTest20.length, 3) + "\n");

            int[] hitZeroTest21 = {9, 10, 7, 3, 4, 5, 6, 7, 8, 0};
            out.write("Testing hitZeroRecursion function with array " + (21) + " starting at position " + 2 + ": " + hitZeroRecursion(hitZeroTest21, hitZeroTest21.length, 2) + "\n");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    /**
     * The recursive method of hitZero. It finds wheter or not we can hit the last index of an array simply by jumping left or right
     * @param a The array which we test
     * @param N The length of the array
     * @param pointer The current postion we are testing
     * @return Return a boolean wheter or not the test was successful
     */
    public static boolean hitZeroRecursion(int[] a,int N, int pointer){
        try{
            if (a[pointer] == (N-1) - pointer){
                pointer  = pointer + a[pointer];
                return true;
            }
            else if (a[pointer] > (N-1) - pointer){
                pointer = pointer - a[pointer];
                return hitZeroRecursion(a,N,pointer);
            }
            else {
                pointer = pointer + a[pointer];
                return hitZeroRecursion(a,N,pointer);
            }
        }catch (StackOverflowError | Exception e) {
            return false;
        }

    }
}
