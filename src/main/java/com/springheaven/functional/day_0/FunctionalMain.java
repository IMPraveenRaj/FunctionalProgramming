package com.springheaven.functional.day_0;

import java.util.List;
import java.util.function.Consumer;

public class FunctionalMain {


    private String name;



    public List<String> getMeListOfNames(){
        return   List.of("PraveenRaj","MohanRaj","VasanthiraDevi");
    }

    public static void main(String[] args) {
        FunctionalMain fm = new FunctionalMain();
        System.out.println("Hello World");
        List<String> meListOfNames = new FunctionalMain().getMeListOfNames();
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("i am the implementation of the consumer interface"+s);
            }
        };
        meListOfNames.forEach(stringConsumer);
    }
}
