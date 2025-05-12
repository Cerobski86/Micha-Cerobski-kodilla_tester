package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public static double averagePostForUsersOverOrEqual40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static double averagePostForUsersUnder40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        double avgOverOrEqual40 = averagePostForUsersOverOrEqual40(users);
        double avgUnder40 = averagePostForUsersUnder40(users);

        System.out.println("Average number of posts in a group >= 40: " + avgOverOrEqual40);
        System.out.println("Average number of posts in a group < 40: " + avgUnder40);
    }
}