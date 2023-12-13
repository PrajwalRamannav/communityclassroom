package com.prajwal;

public class ConditionalStatements {
    public static void main(String[] args) {
        // Conditional Statements : These are the statements used to execute whenever the statement has the condition
        //                         Ex:- if salary is 1000 give bonus 100 and if salary is 2000 bonus is 200

        // let's see the conditional statement syntax :

        // If condition :
//        if (boolean expression) {
//            // body
//        }
        // ex:-
        if (true){
            System.out.println("Hi");
        }

        // While loop
//        while (boolean expression){
//            //body
//        }
        // Ex:-
        int count = 0;
        while (count != 5){ // USE WHILE LOOP WHEN YOU DONT KNOW HOW MANY TIMES LOOP RUNS
            System.out.println(count);
            count++;
        }

        // For Loop
        for (int count2 = 0; count2 < 5; count2++){ // USE WHILE LOOP WHEN YOU KNOW HOW MANY TIMES LOOP RUNS
            System.out.println(count2 + " Hi");
        }
    }
}
