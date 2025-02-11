package com.springheaven.functional.day_0;


import org.slf4j.LoggerFactory;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Logger;


public class FunctionalMain {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(FunctionalMain.class);

    public static void main(String[] args) {

        int increment =incrementByOne(1);
        System.out.println(increment);
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int mul = multiplyByTen.apply(1);
        System.out.println(mul);
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyByTen);
        Integer in = addBy1AndThenMultiplyBy10.apply(4);
        System.out.println(in);
        System.out.println("Doing Bifucntion Operation"+incrementByOneMultiplyBy10.apply(4,100));


    }

    //
    static int incrementByOne(int number){
        return number + 1;
    }
    //this line of code is a way of implementing the functional programming
    static Function<Integer,Integer> incrementByOneFunction= number -> number + 1;

    //this function we are trying to chain the above increment to mulitply
    static Function<Integer,Integer>  multiplyByTen= number -> (number+1) * 10;

    //instead of writing one function for addition and another one for multiplication we can use the Bi_function
    static BiFunction<Integer,Integer,Integer> incrementByOneMultiplyBy10= (number,numberMultiply) -> (number+1)*numberMultiply;


}
