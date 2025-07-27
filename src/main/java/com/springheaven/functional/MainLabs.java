package com.springheaven.functional;

import com.springheaven.functional.labs.Family;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainLabs {

    //This class built fo the tutorial purpose of my student


    public static void main(String[] args) {
        String family[][] = {
                {"1", "praveen", "Billionaire"},
                {"2", "Dharshini", "Billionaire"},
                {"3", "Vasanthi", "Billionaire"},
                {"4", "MohanRaj", "Billionaire"}
        };
        List<Family> familyList=new ArrayList<>();
        for(String[] fa  : family) {
            for (int index = 0; index < fa.length; index++) {
                // Create a Family object using the builder
                Family build = new Family.FamilyBuilder()
                        .id(fa[index])
                        .name(fa[index])
                        .status(fa[index])
                        .build();
                familyList.add(build);
            }
        }
        familyList.stream().forEach(System.out::println);
        Arrays.stream(family)
                // .peek(name-> System.out.println(name))
                .flatMap(newfam-> Arrays.stream(newfam))
                .forEach(fami -> System.out.println(fami));
    }


}
