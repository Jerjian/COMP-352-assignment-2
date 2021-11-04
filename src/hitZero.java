import java.util.*;

public class hitZero extends LinkedList {
    public static void main(String[] args) {

        int[] hitZeroTest1 = {4,8,5,2,3,5,1,6,4,0}; //valid
        int[] hitZeroTest2 = {5,8,2,3,1,5,0};
        int[] hitZeroTest3 = {2,4,2,2,2,4,4,0};
        int[] hitZeroTest4 = {1,2,3,4,5,6,7,8,9,10,0};
        int[] hitZeroTest5 = {1,2,5,2,1,0}; //valid
        int[] hitZeroTest6 = {1,0}; //valid
        int[] hitZeroTest7 = {0}; //valid
        int[] hitZeroTest8 = {1};
        int[] hitZeroTest9 = {1,1,1,1,1,1,1,1,1,1,1,1,1,0}; //valid
        int[] hitZeroTest10 = {8,8,1,2,3,4,5,6,4,8,9,10,0}; //valid
        int[] hitZeroTest11 = {2,1,2,1,2,1,2,1,2,1,0}; //not sure
        int[] hitZeroTest12 = {1,5,4,2,6,7,3,1,3,0}; //notsure
        int[] hitZeroTest13 = {1,2,5,6,1,5,6,3,5,0}; //notsure
        int[] hitZeroTest14 = {6,2,4,1,5,6,2,3,1,2,0}; //notsure
        int[] hitZeroTest15 = {5,4,5,3,2,5,3,4,2,1,0}; //notsure
        int[] hitZeroTest16 = {4,8,5,2,3,5,1,0}; //notsure
        int[] hitZeroTest17 = {4,8,5,2,1,0}; //notsure
        int[] hitZeroTest18 = {8,3,1,4,5,6,2,1,3,5,0}; //notsure
        int[] hitZeroTest19 = {4,5,1,2,5,6,1,2,1,4,0}; //notsure
        int[] hitZeroTest20 = {10,9,8,7,6,5,4,3,2,1,0}; //notsure

        int[][] hitZeroTest = new int[20][10];
        hitZeroTest[0] = hitZeroTest1;
        hitZeroTest[1] = hitZeroTest2;
        hitZeroTest[2] = hitZeroTest3;
        hitZeroTest[3] = hitZeroTest4;
        hitZeroTest[4] = hitZeroTest5;
        hitZeroTest[5] = hitZeroTest6;
        hitZeroTest[6] = hitZeroTest7;
        hitZeroTest[7] = hitZeroTest8;
        hitZeroTest[8] = hitZeroTest9;
        hitZeroTest[9] = hitZeroTest10;
        hitZeroTest[10] = hitZeroTest11;
        hitZeroTest[11] = hitZeroTest12;
        hitZeroTest[12] = hitZeroTest13;
        hitZeroTest[13] = hitZeroTest14;
        hitZeroTest[14] = hitZeroTest15;
        hitZeroTest[15] = hitZeroTest16;
        hitZeroTest[16] = hitZeroTest17;
        hitZeroTest[17] = hitZeroTest18;
        hitZeroTest[18] = hitZeroTest19;
        hitZeroTest[19] = hitZeroTest20;

        System.out.println("\n--Testing hitZeroRecursion--");
        for (int i = 0; i < hitZeroTest.length; i++) {
            System.out.println("Testing hitZeroRecursion function with array " + (i+1) + ": " + hitZeroRecursion(hitZeroTest[i],hitZeroTest[i].length,0));
        }

        System.out.println("\n--Testing hitZero with a List--");
        for (int i = 0; i < hitZeroTest.length; i++) {
            System.out.println("Testing hitZero (List) function " + (i+1) + ": ");
            buildList(hitZeroTest[i]);
        }
    }

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

    public static void buildList(int ...vals){
        List l = new ArrayList();

        for (int val: vals) {
            l.add(val);
        }

        System.out.println(hitZero(l));
    }


    public static boolean hitZero(List l){
        int index = 0;
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
