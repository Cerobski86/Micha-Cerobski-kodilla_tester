package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void testStudentWithTeacher() {
        Student student = new Student("Jan Kowalski", new Teacher("Tomasz Nowak"));

        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String teacherName = optionalTeacher
                .map(Teacher::getName)
                .orElse("<undefined>");

        assertEquals("Tomasz Nowak", teacherName);
    }

    @Test
    public void testStudentWithoutTeacher() {
        Student student = new Student("Anna Malinowska", null);
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String teacherName = optionalTeacher
                .map(Teacher::getName)
                .orElse("<undefined>");

        assertEquals("<undefined>", teacherName);
    }

    @Test
    public void testDisplayStudentsWithTeachers() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Tomasz Nowak")));
        students.add(new Student("Anna Nowak", null));
        students.add(new Student("Piotr Zieliński", new Teacher("Marek Malinowski")));
        students.add(new Student("Maria Wiśniewska", null));

        List<String> results = new ArrayList<>();
        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            String line = "Student name: " + student.getName() + " - Teacher name: " + teacherName;
            results.add(line);
        }

            assertEquals(4, results.size());
            assertTrue(results.contains("Student name: Jan Kowalski - Teacher name: Tomasz Nowak"));
            assertTrue(results.contains("Student name: Anna Nowak - Teacher name: <undefined>"));
            assertTrue(results.contains("Student name: Piotr Zieliński - Teacher name: Marek Malinowski"));
            assertTrue(results.contains("Student name: Maria Wiśniewska - Teacher name: <undefined>"));
        }
    }