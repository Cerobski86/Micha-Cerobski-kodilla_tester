package com.kodilla;

public class GradesTest {
    public static void main(String[] args) {
       Grades studentGrades = new Grades() ;
        studentGrades.add(5);
        studentGrades.add(4);
        studentGrades.add(3);
        studentGrades.add(5);
        studentGrades.add(1);
        studentGrades.add(5);
        studentGrades.add(2);
        studentGrades.add(3);
        studentGrades.add(5);
        studentGrades.add(4);
        System.out.println(studentGrades.getLastGrades());
        System.out.println(studentGrades.getAverageGrades());
    }
}
