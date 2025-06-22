package com.springheaven.functional.day_01;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {

        Student student = new Student("praveen", List.of("1234566789", "098756634"));
        Student student2 = new Student("Dharshini", List.of("1234567890", "098878333"));

        List<List<String>> praveenNo = List.of(student,student2)
                .stream()
                .filter(student1 -> student1.getName().contains("praveen"))
                .map(student1 -> student1.getPhoneNo())
                .collect(Collectors.toList());

        System.out.println(praveenNo);

        List<String> allPhoneNo = List.of(student,student2)
                .stream()
                .filter(student1 -> student1.getName().contains("Dharshini"))
                .flatMap(student1 -> student1.getPhoneNo().stream())
                .collect(Collectors.toList());

        System.out.println("Everyone phone no "+allPhoneNo);

    }
}
