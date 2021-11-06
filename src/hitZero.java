import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


/**
 * hitZero class is where the we will test hitZeroRecursion and hitZero with a list
 */
public class hitZero extends LinkedList {
    /**
     * The main method where the program starts
     * @param args The arguments which the console will read from
     */
    public static void main(String[] args) {
        System.out.println("--Testing all hitZeroRecursions and hitZero with a list to log.txt..--");
        PrintWriter out;

        try{
            out = new PrintWriter("log.txt");
            out.write("--Testing hitZeroRecursion--\n");

            int[] hitZeroTest1 = {4,8,5,2,3,5,1,6,4,0};
            out.write("Testing hitZeroRecursion function with array " + (1) + " starting at position " +0+  ": " + hitZeroRecursion(hitZeroTest1,hitZeroTest1.length,0) +"\n");

            int[] hitZeroTest2 = {5,8,2,3,1,5,0};
            out.write("Testing hitZeroRecursion function with array " + (2) + " starting at position " +1+ ": " + hitZeroRecursion(hitZeroTest2,hitZeroTest2.length,1) +"\n");

            int[] hitZeroTest3 = {2,4,2,2,2,4,4,0};
            out.write("Testing hitZeroRecursion function with array " + (3) +" starting at position " +2+ ": " + hitZeroRecursion(hitZeroTest3,hitZeroTest3.length,2) +"\n");

            int[] hitZeroTest4 = {1,2,3,4,5,6,7,8,9,10,0};
            out.write("Testing hitZeroRecursion function with array " + (4) +" starting at position " +3+ ": " + hitZeroRecursion(hitZeroTest4,hitZeroTest4.length,3) +"\n");

            int[] hitZeroTest5 = {1,2,5,2,1,0};
            out.write("Testing hitZeroRecursion function with array " + (5) + " starting at position " +4+ ": " + hitZeroRecursion(hitZeroTest5,hitZeroTest5.length,4) +"\n");

            int[] hitZeroTest6 = {1,0};
            out.write("Testing hitZeroRecursion function with array " + (6) + " starting at position " +1+ ": " + hitZeroRecursion(hitZeroTest6,hitZeroTest6.length,1) +"\n");

            int[] hitZeroTest7 = {0};
            out.write("Testing hitZeroRecursion function with array " + (7) +" starting at position " +0+ ": " + hitZeroRecursion(hitZeroTest7,hitZeroTest7.length,0) +"\n");

            int[] hitZeroTest8 = {1};
            out.write("Testing hitZeroRecursion function with array " + (8) + " starting at position " +0+ ": " + hitZeroRecursion(hitZeroTest8,hitZeroTest8.length,0) +"\n");

            int[] hitZeroTest9 = {1,1,1,1,1,1,1,1,1,1,1,1,1,0};
            out.write("Testing hitZeroRecursion function with array " + (9) + " starting at position " +1+ ": " + hitZeroRecursion(hitZeroTest9,hitZeroTest9.length,1) +"\n");

            int[] hitZeroTest10 = {8,8,1,2,3,4,5,6,4,8,9,10,0};
            out.write("Testing hitZeroRecursion function with array " + (10) + " starting at position " +3+ ": " + hitZeroRecursion(hitZeroTest10,hitZeroTest10.length,3) +"\n");

            int[] hitZeroTest11 = {2,1,2,1,2,1,2,1,2,1,0};
            out.write("Testing hitZeroRecursion function with array " + (11) + " starting at position " +6+ ": " + hitZeroRecursion(hitZeroTest11,hitZeroTest11.length,6) +"\n");

            int[] hitZeroTest12 = {1,5,4,2,6,7,3,1,3,0};
            out.write("Testing hitZeroRecursion function with array " + (12) + " starting at position " +4+ ": " + hitZeroRecursion(hitZeroTest12,hitZeroTest12.length,4) +"\n");

            int[] hitZeroTest13 = {1,2,5,6,1,5,6,3,5,0};
            out.write("Testing hitZeroRecursion function with array " + (13) + " starting at position " +3+ ": " + hitZeroRecursion(hitZeroTest13,hitZeroTest13.length,3) +"\n");

            int[] hitZeroTest14 = {6,2,4,1,5,6,2,3,1,2,0};
            out.write("Testing hitZeroRecursion function with array " + (14) + " starting at position " +2+ ": " + hitZeroRecursion(hitZeroTest14,hitZeroTest14.length,2) +"\n");

            int[] hitZeroTest15 = {5,4,5,3,2,5,3,4,2,1,0};
            out.write("Testing hitZeroRecursion function with array " + (15) + " starting at position " +1+ ": " + hitZeroRecursion(hitZeroTest15,hitZeroTest15.length,1) +"\n");

            int[] hitZeroTest16 = {4,8,5,2,3,5,1,0};
            out.write("Testing hitZeroRecursion function with array " + (16) + " starting at position " +0+ ": " + hitZeroRecursion(hitZeroTest16,hitZeroTest16.length,0) +"\n");

            int[] hitZeroTest17 = {4,8,5,2,1,0};
            out.write("Testing hitZeroRecursion function with array " + (17) + " starting at position " +5+ ": " + hitZeroRecursion(hitZeroTest17,hitZeroTest17.length,5) +"\n");

            int[] hitZeroTest18 = {8,3,1,4,5,6,2,1,3,5,0};
            out.write("Testing hitZeroRecursion function with array " + (18) + " starting at position " +3+ ": " + hitZeroRecursion(hitZeroTest18,hitZeroTest18.length,3) +"\n");

            int[] hitZeroTest19 = {4,5,1,2,5,6,1,2,1,4,0};
            out.write("Testing hitZeroRecursion function with array " + (19) +  " starting at position " +5+": " + hitZeroRecursion(hitZeroTest19,hitZeroTest19.length,5) +"\n");

            int[] hitZeroTest20 = {10,9,8,7,6,5,4,3,2,1,0};
            out.write("Testing hitZeroRecursion function with array " + (20) + " starting at position " +3+ ": " + hitZeroRecursion(hitZeroTest20,hitZeroTest20.length,3) +"\n");

            int[] hitZeroTest21 = {9,10,7,3,4,5,6,7,8,0};
            out.write("Testing hitZeroRecursion function with array " + (21) + " starting at position " +2+ ": " + hitZeroRecursion(hitZeroTest21,hitZeroTest21.length,2) +"\n");


            out.write("\n--Testing hitZero with a List--\n");

            int[][] hitZeroTest = new int[21][10];
            hitZeroTest[0] = hitZeroTest1;
            out.write("Testing hitZero (List) function " + (1) + " starting at position " +0+ ": " + hitZero(hitZeroTest[0],0, out) +"\n");

            hitZeroTest[1] = hitZeroTest2;
            out.write("Testing hitZero (List) function " + (2) + " starting at position " +1+ ": " + hitZero(hitZeroTest[1],1, out)+"\n");

            hitZeroTest[2] = hitZeroTest3;
            out.write("Testing hitZero (List) function " + (3) + " starting at position " +2+ ": " + hitZero(hitZeroTest[2],2, out)+"\n");

            hitZeroTest[3] = hitZeroTest4;
            out.write("Testing hitZero (List) function " + (4) + " starting at position " +3+ ": " + hitZero(hitZeroTest[3],3, out)+"\n");

            hitZeroTest[4] = hitZeroTest5;
            out.write("Testing hitZero (List) function " + (5) + " starting at position " +4+ ": " + hitZero(hitZeroTest[4],4, out)+"\n");

            hitZeroTest[5] = hitZeroTest6;
            out.write("Testing hitZero (List) function " + (6) + " starting at position " +1+ ": " + hitZero(hitZeroTest[5],1, out)+"\n");

            hitZeroTest[6] = hitZeroTest7;
            out.write("Testing hitZero (List) function " + (7) + " starting at position " +0+ ": " + hitZero(hitZeroTest[6],0, out)+"\n");

            hitZeroTest[7] = hitZeroTest8;
            out.write("Testing hitZero (List) function " + (8) + " starting at position " +0+ ": " + hitZero(hitZeroTest[7],0, out)+"\n");

            hitZeroTest[8] = hitZeroTest9;
            out.write("Testing hitZero (List) function " + (9) + " starting at position " +1+ ": " + hitZero(hitZeroTest[8],1, out)+"\n");

            hitZeroTest[9] = hitZeroTest10;
            out.write("Testing hitZero (List) function " + (10) + " starting at position " +3+ ": " + hitZero(hitZeroTest[9],3, out)+"\n");

            hitZeroTest[10] = hitZeroTest11;
            out.write("Testing hitZero (List) function " + (11) + " starting at position " +6+ ": " + hitZero(hitZeroTest[10],6, out)+"\n");

            hitZeroTest[11] = hitZeroTest12;
            out.write("Testing hitZero (List) function " + (12) + " starting at position " +4+ ": " + hitZero(hitZeroTest[11],4, out)+"\n");

            hitZeroTest[12] = hitZeroTest13;
            out.write("Testing hitZero (List) function " + (13) + " starting at position " +3+ ": " + hitZero(hitZeroTest[12],3, out)+"\n");

            hitZeroTest[13] = hitZeroTest14;
            out.write("Testing hitZero (List) function " + (14) + " starting at position " +2+ ": " + hitZero(hitZeroTest[13],2, out)+"\n");

            hitZeroTest[14] = hitZeroTest15;
            out.write("Testing hitZero (List) function " + (15) + " starting at position " +1+ ": " + hitZero(hitZeroTest[14],1, out)+"\n");

            hitZeroTest[15] = hitZeroTest16;
            out.write("Testing hitZero (List) function " + (16) + " starting at position " +0+ ": " + hitZero(hitZeroTest[15],0, out)+"\n");

            hitZeroTest[16] = hitZeroTest17;
            out.write("Testing hitZero (List) function " + (17) + " starting at position " +6+ ": " + hitZero(hitZeroTest[16],6, out)+"\n");

            hitZeroTest[17] = hitZeroTest18;
            out.write("Testing hitZero (List) function " + (18) + " starting at position " +3+ ": " + hitZero(hitZeroTest[17],3, out)+"\n");

            hitZeroTest[18] = hitZeroTest19;
            out.write("Testing hitZero (List) function " + (19) + " starting at position " +5+ ": " + hitZero(hitZeroTest[18],5, out)+"\n");

            hitZeroTest[19] = hitZeroTest20;
            out.write("Testing hitZero (List) function " + (20) + " starting at position " +3+ ": " + hitZero(hitZeroTest[19],3, out)+"\n");

            hitZeroTest[20] = hitZeroTest21;
            out.write("Testing hitZero (List) function " + (21) + " starting at position " +2+ ": " + hitZero(hitZeroTest[20],2, out)+"\n");


            out.close();
            System.out.println("--Done, log.txt has been created with the results--");
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
            //base case
            if (a[pointer] == (N-1) - pointer){
                pointer  = pointer + a[pointer];
                return true;
            }
            //Current element is too big, we jump left
            else if (a[pointer] > (N-1) - pointer){
                pointer = pointer - a[pointer];
                return hitZeroRecursion(a,N,pointer);
            }
            //Current element is too small, we jump right
            else {
                pointer = pointer + a[pointer];
                return hitZeroRecursion(a,N,pointer);
            }
        }catch (StackOverflowError | Exception e) {
            return false;
        }

    }


    /**
     * The list method of hitZero. It finds wheter or not we can hit the last index of an array simply by jumping left or right
     * @param a The array which we test
     * @param startingIndex The starting index
     * @param out The output text file
     * @return Return a boolean wheter or not the test was successful
     */
    public static boolean hitZero(int[] a,  int startingIndex, PrintWriter out){
        //Create a list from the given array:
        List l = new ArrayList();
        for (int val: a) {
            l.add(val);
        }

        if(startingIndex > l.size()-2){
            out.write("Starting index must be smaller than n-2:  ");
            return false;
        }

        int index = startingIndex;
        int jump = 0;

        Queue history = new ArrayDeque();

        //Edge cases:
        //Making sure the last value is actually 0
        if((int)l.get(l.size()-1) != 0)
            return false;

        //If the only value is 0, it is valid
        if(l.size() == 1 && (int)l.get(0) == 0)
            return true;


        while ((index < l.size()-1)){
            jump = (int)l.get(index);

            //try to jump to the right
            if(index+jump < l.size()) {
                index = index + jump;
                history.add(index);
            }else {
                index = index - jump;
                history.add(index);
            }


            if(index == l.size()-1) //If we get to the last index, then we found the solution.
                return true;
            if(index < 0)   // If we get a negative result as a jump location, then we have no solution.
                return false;

            //Finding if there is an infinite loop
            if(history.size() >= l.size())
                return false;
        }

        return false;
    }
}
