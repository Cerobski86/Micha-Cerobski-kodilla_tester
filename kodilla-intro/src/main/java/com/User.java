package com;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        User tomek = new User("Tomek", 20);
        User maciej = new User("Maciej", 58);
        User henryk = new User("Henryk", 18);
        User dominik = new User("Dominik", 63);
        User grzegorz = new User("Grzegorz", 31);
        User kamil = new User("Kamil", 42);

        User[] users = {tomek, maciej, henryk, dominik, grzegorz, kamil};
        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum += users[i].getAge();
        }

        double averageAge = (double) sum / users.length;
        averageAge = Math.round(averageAge * 10) / 10.0;
        System.out.println("średnia wieku: " + averageAge);

        System.out.println("młodsi niż średnia wieku: ");
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < averageAge) {
                System.out.println(users[i].getName());
            }
        }
    }
}