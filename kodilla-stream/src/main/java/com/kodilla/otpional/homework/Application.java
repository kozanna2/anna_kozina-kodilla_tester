package com.kodilla.otpional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam Adamski", new Teacher("Kowalski")));
        students.add(new Student("Bartosz Bartoszewski", null));
        students.add(new Student("Cezary Cezar", new Teacher("Nowak")));
        students.add(new Student("Filip Filipowski", null));

        
        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teachersName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Uczeń: " + student.getName() + ", nauczyciel: " + teachersName + ".");
        }
    }
}
