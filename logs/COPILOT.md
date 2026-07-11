# COPILOT - Part 3

## Student
Oriyan Ben Cohen
Veronica Godin
Ido Caspi

## Topic
Completing and running unit tests in Java using JUnit.

## Purpose
This document summarizes the work completed in Part 3 of the assignment.

The goal was to review the existing tests in `AppTest.java`, compare them with the methods in `App.java`, identify missing edge cases, improve unclear tests, run the complete test suite, and verify that all tests pass.

## Understanding the Task

At the beginning of Part 3, `AppTest.java` already contained unit tests.

The task was therefore not to rewrite all tests from the beginning, but to:

- Review the existing tests
- Check whether all methods in `App.java` were covered
- Identify missing edge cases
- Check invalid inputs and exceptions
- Add missing tests
- Fix tests that were not deterministic
- Run all tests using Gradle

## Reviewed Methods

The following methods from `App.java` were reviewed:

- `add`
- `isPrime`
- `reverse`
- `factorial`
- `isPalindrome`
- `fibonacciUpTo`
- `charFrequency`
- `isAnagram`
- `average`
- `filterEvens`
- `mostCommonWord`

## Fixing the mostCommonWord Test

The original test used this text:

```java
String text = "Hello world! Hello everyone. World is big.";
```

Both `hello` and `world` appeared twice, so the result was ambiguous.

The test was changed so that `hello` clearly appears more times:

```java
@Test
public void testMostCommonWord() {
    String text = "Hello world! Hello everyone. Hello is common.";

    assertEquals("hello", App.mostCommonWord(text));

    String singleWord = "test";
    assertEquals("test", App.mostCommonWord(singleWord));
}
```

## Tests Added

### Empty List in filterEvens

```java
@Test
public void testFilterEvensWithEmptyList() {
    assertTrue(App.filterEvens(List.of()).isEmpty());
}
```

This test checks that an empty input list returns an empty result list.

### Negative Even Numbers and Zero

```java
@Test
public void testFilterEvensWithNegativeNumbersAndZero() {
    List<Integer> numbers = Arrays.asList(-4, -3, -2, -1, 0);

    assertEquals(
        Arrays.asList(-4, -2, 0),
        App.filterEvens(numbers)
    );
}
```

This test checks that negative even numbers and zero are treated as even numbers.

### Single Element Average

```java
@Test
public void testAverageWithSingleElement() {
    assertEquals(10.0, App.average(new int[]{10}), 0.001);
}
```

This test checks that the average of an array containing one value is that value itself.

### Anagrams with Different Lengths

```java
@Test
public void testIsAnagramWithDifferentLengths() {
    assertFalse(App.isAnagram("a", "aa"));
}
```

This test checks that strings with different lengths cannot be anagrams.

### Fibonacci Boundary Value 1

```java
@Test
public void testFibonacciUpToOne() {
    assertEquals(
        Arrays.asList(0, 1, 1),
        App.fibonacciUpTo(1)
    );
}
```

This test checks the boundary value `1` according to the implementation of `fibonacciUpTo`.

## Test File Structure

All tests were added inside the `AppTest` class.

Each test:

- Uses the `@Test` annotation
- Has a clear method name
- Is not nested inside another test method
- Uses the correct JUnit assertion
- Is placed before the final closing brace of the class

## Running the Tests

The complete test suite was executed with:

```bash
./gradlew test
```

## Result

The Gradle command completed successfully and displayed:

```text
BUILD SUCCESSFUL
```

This means:

- The project compiled successfully
- All unit tests were executed
- No test failed

## Summary

During Part 3, the existing tests were reviewed and improved.

The following changes were made:

- Fixed an ambiguous `mostCommonWord` test
- Added an empty-list test for `filterEvens`
- Added negative even numbers and zero for `filterEvens`
- Added a single-element array test for `average`
- Added different-length strings for `isAnagram`
- Added the boundary value `1` for `fibonacciUpTo`
- Ran all tests successfully with Gradle

## Conclusion

Part 3 demonstrated that it is not enough for tests to exist.

Good unit tests should also be:

- Clear
- Deterministic
- Focused
- Able to check regular cases
- Able to check edge cases
- Able to check invalid inputs
- Able to cover important execution paths
