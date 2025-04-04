
package com;

public class User1 {
    private String name;
    private double age;
    private double height;

    public User1(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String checkUser1Conditions() {
        if (name != null) {
            if (age > 30 && height > 160) {
                return "User is older than 30 and taller than 160cm";
            } else {
                return "User is 30 (or younger) or 160cm (or shorter)";
            }
        }
        return "Invalid user1 data";
    }
}