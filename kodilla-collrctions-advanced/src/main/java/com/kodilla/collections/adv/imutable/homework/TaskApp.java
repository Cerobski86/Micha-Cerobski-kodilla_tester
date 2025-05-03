package com.kodilla.collections.adv.imutable.homework;

public class TaskApp {
    public static void main(String[] args) {
        Task task = new Task("Write report", 120);
        System.out.println("Task: " + task.title() + ", duration: " + task.duration() + " minutes");
    }
}