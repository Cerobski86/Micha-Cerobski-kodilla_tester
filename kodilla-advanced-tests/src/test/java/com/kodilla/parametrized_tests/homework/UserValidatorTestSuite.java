package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {

    @ParameterizedTest
    @ValueSource(strings = {"User123", "john.bravo", "Kate-k", "A_B_C"})
    public void shouldValidateUsernames(String username) {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "example@example.com",
            "user.name123@domain.co",
            "test_user-1@sub.domain.org"
    })
    public void shouldValidateEmail(String email) {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"User123, true", "jo, false", "Kate-k, true", "!, false"})
    public void shouldValidateUsernames(String username, boolean expected) {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateUsername(username);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"john@example.com, true",
            "invalid@.com, false",
            "anna.nowak@domain.org, true",
            "notAnEmail, false",
            "null, false",
            "invalid_email.com, false"
    })

    public void shouldValidateEmailWithCvsSource(String email, boolean expected) {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail(email);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideEmailsForTesting")
    public void shouldValidateEmailUsingMethodSource(String email, boolean expected) {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail(email);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> provideEmailsForTesting() {
        return Stream.of(
                Arguments.of("john@example.com", true),
                Arguments.of("invalid@.com", false),
                Arguments.of("anna.nowak@domain.org", true),
                Arguments.of("notAnEmail", false),
                Arguments.of("", false),
                Arguments.of(null, false));
    }

    @ParameterizedTest
    @MethodSource("provideUsernamesForValidation")
    public void shouldValidateUsernamesUsingMethodSource(String username, boolean expected) {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateUsername(username);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> provideUsernamesForValidation() {
        return Stream.of(
                Arguments.of("jan_kowalski", true),
                Arguments.of("abc", true),
                Arguments.of("a", false),
                Arguments.of("j@n", false),
                Arguments.of("user-name.123", true),
                Arguments.of("us", false),
                Arguments.of("", false)
        );
    }
}