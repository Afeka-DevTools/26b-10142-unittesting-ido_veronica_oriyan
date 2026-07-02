# LEARNING.md

## Purpose

In this part, we used an LLM to learn about unit testing in Java.

## Prompt

Explain what unit tests are in Java.
Explain how to write unit tests using JUnit and Gradle.
Explain the difference between assertEquals, assertTrue, assertFalse, and assertThrows.
Give simple examples.

## Summary

Unit tests are tests that check small parts of the code, usually one method at a time.
In Java, we can write unit tests using JUnit.
Gradle can run the tests using the command:

./gradlew test

## What we learned

- @Test marks a method as a test.
- assertEquals(expected, actual) checks if the actual result equals the expected result.
- assertTrue(condition) checks if a condition is true.
- assertFalse(condition) checks if a condition is false.
- assertThrows checks if a method throws an exception.
