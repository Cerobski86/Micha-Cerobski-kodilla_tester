package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames() {

        List<String> result = UsersManager.filterChemistGroupUsernames();

        assertEquals(3, result.size());
        assertTrue(result.contains("Walter White"));
        assertTrue(result.contains("Gale Boetticher"));
    }

    @Test
    public void testFilterUserOlderThan_WithAge40() {
        int age = 40;

        List<User> result = UsersManager.filterUsersOlderThan(age);

        assertEquals(4, result.size());
        for (User user : result) {
            assertTrue(user.getAge() > age);
        }
    }

    @Test
    public void testFilterUserOlderThan_WithAge60() {
        int age = 60;

        List<User> result = UsersManager.filterUsersOlderThan(age);

        assertEquals(0, result.size());
    }

    @Test
    public void testFilterUserOlderThan_WithAge25() {
        int age = 25;

        List<User> result = UsersManager.filterUsersOlderThan(age);

        assertEquals(5, result.size());
        for (User user : result) {
            assertTrue(user.getAge() > age);
        }
    }
}