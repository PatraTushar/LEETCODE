package StackByStriver.interviewQuestions;

import java.security.PrivateKey;
import java.util.PriorityQueue;
import java.util.Stack;

public class StockSpanner {

    private Stack<int[]> stack;

    public StockSpanner(){

        stack=new Stack<>();

    }

    public int next(int price){

       //✅ Time Complexity:
        //Amortized O(1) per call to next(price)
        //
        //✅ Space Complexity:
        //O(n)
        //where n is the number of calls to next(), since each entry is pushed to the stack at most once.


        int span=1;

        while (!stack.isEmpty() && stack.peek()[0]<=price){

            span+=stack.pop()[1];

        }

        stack.push(new int[]{price,span});

        return span;





    }

    public static void main(String[] args) {

    StockSpanner ss=new StockSpanner();
        System.out.println(ss.next(100)); // 1
        System.out.println(ss.next(80));  // 1
        System.out.println(ss.next(60));  // 1
        System.out.println(ss.next(70));  // 2
        System.out.println(ss.next(60));  // 1
        System.out.println(ss.next(75));  // 4
        System.out.println(ss.next(85));  // 6







    }
}
