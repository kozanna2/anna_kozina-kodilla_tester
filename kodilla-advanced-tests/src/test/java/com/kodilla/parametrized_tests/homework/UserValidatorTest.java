package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfUsernameIsEmpty(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource(value = {"KAATIE", "a98fg", "98_-", "__."})
    public void shouldReturnTrueIfUsernameIsCorrect(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource(value = {"an", "90", "98$jack", "jdsjj_+_"})
    public void shouldReturnFalseIfUsernameIsWrong(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfUseremailIsNullOrEmpty(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @CsvSource(value = {"akozina@onet.pl", "anna.kozina@onet.com.pl", "GTFjh8_@gmail.com", "a_kozina9@interia.en"})
    public void shouldReturnTrueIfUsermailIsCorrect(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @CsvSource(value = {"A.kozi*na@gmail.com", "a.gmail.pl", "anna.kozina@@gmail.com", "anna#$_kozina@onet.en"})
    public void shouldReturnFalseIfUsermailIsWrong(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}