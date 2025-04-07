package com;

public class Application {
    public static void main(String[] args) {
        User1 user1 = new User1("Adam", 40.5, 178);

        System.out.println(user1.checkUser1Conditions());

        AdvanceUser1 advancedUser1 = new AdvanceUser1("Rico", 36, 168, "Engineer");
        System.out.println("Advanced user1 profession: " + advancedUser1.getProfession());
    }
}