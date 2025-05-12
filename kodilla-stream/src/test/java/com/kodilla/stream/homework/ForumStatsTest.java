package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    public void shouldCalculateAverageForUsersOverOrEqual40() {
        List<User> users = Arrays.asList(
                new User("A", 40, 10, "Group1"),
                new User("B", 45, 20, "Group1")
        );
        double result = ForumStats.averagePostForUsersOverOrEqual40(users);
        assertEquals(15.0, result);
    }

    @Test
    public void shouldReturnZeroIfNoUserOverOrEqual40() {
        List<User> users = Arrays.asList(
                new User("A", 30, 10, "Group1"),
                new User("B", 25, 20, "Group1")
        );
        double result = ForumStats.averagePostForUsersOverOrEqual40(users);
        assertEquals(0, result);
    }

    @Test
    public void shouldCalculateAverageForUsersUnder40() {
        List<User> users = Arrays.asList(
                new User("A", 30, 10, "Group1"),
                new User("B", 25, 20, "Group1")
        );
        double result = ForumStats.averagePostForUsersUnder40(users);
        assertEquals(15.0, result);
    }

    @Test
    public void shouldReturnZeroIfNoUserUnder40() {
        List<User> users = Arrays.asList(
                new User("A", 40, 10, "Group1"),
                new User("B", 45, 20, "Group1")
        );
        double result = ForumStats.averagePostForUsersUnder40(users);
        assertEquals(0.0, result);
    }

    @Test
    public void shouldReturnZeroIfListIsEmpty() {
        List<User> users = Arrays.asList();
        assertEquals(0.0, ForumStats.averagePostForUsersOverOrEqual40(users));
        assertEquals(0.0, ForumStats.averagePostForUsersUnder40(users));
    }
}