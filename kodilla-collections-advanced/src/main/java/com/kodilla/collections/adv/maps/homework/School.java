package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> numbersOfStudents = new ArrayList<>();
    private String schoolName;

    public School(String schoolName, int... studentsInClasses) {
        this.schoolName = schoolName;
        for (int number : studentsInClasses) {
            numbersOfStudents.add(number);
        }
    }

    public List<Integer> getNumbersOfStudents() {
        return numbersOfStudents;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getTotalNumberOfStudents() {
        int sum = 0;
        for (int students : numbersOfStudents) {
            sum += students;
        }
        return sum;
    }

    @Override
    public String toString() {
        return schoolName + ". " + "Numbers of Students: " + getTotalNumberOfStudents();
    }
}