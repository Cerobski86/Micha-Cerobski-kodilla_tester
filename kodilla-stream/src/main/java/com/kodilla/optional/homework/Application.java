package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Tomasz Nowak")));
        students.add(new Student("Anna Malinowska", null));
        students.add(new Student("Zofia Lewandowska", new Teacher("Maria Pawlak")));
        students.add(new Student("Tomasz Zieliński", null));

    for (Student student : students) {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

        String teacherName = optionalTeacher
                .map(Teacher::getName)
                .orElse("<underfined>");
        System.out.println(("Student name: " + student.getName() + " -  Teacher name: "  + teacherName));
    }
    }
}