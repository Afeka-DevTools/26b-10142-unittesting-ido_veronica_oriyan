# LEARNING - Part 2

## Student
Oriyan Ben Cohen

## Topic
Learning unit testing in Java using JUnit.

## Purpose
This document summarizes the learning process conducted with ChatGPT as part of Part 2 of the assignment.  
The goal was to understand unit testing in Java before writing the tests in `AppTest.java`.

## What I Learned

### What is a Unit Test?
A unit test is an automated test that checks a small part of the code, usually one method.

The purpose of a unit test is to verify that a method returns the expected result for a given input.

Example:

```java
public static int add(int a, int b) {
    return a + b;
}
```

A possible unit test:

```java
@Test
public void testAdd() {
    int result = App.add(2, 3);
    assertEquals(5, result);
}
```

## Manual Testing vs Unit Testing

### Manual Testing
In manual testing, the program is executed and the result is checked visually.

Example:

```java
System.out.println(App.add(2, 3));
```

The user needs to check whether the printed result is correct.

### Unit Testing
In unit testing, the code checks the result automatically.

```java
@Test
public void testAdd() {
    int result = App.add(2, 3);
    assertEquals(5, result);
}
```

If the result is correct, the test passes.  
If the result is incorrect, the test fails.

## Basic JUnit Test Structure

A basic JUnit test contains:

- The `@Test` annotation
- A clear test method name
- Test preparation
- Method execution
- Assertion of the expected result

Example:

```java
@Test
public void testAddPositiveNumbers() {
    // Arrange
    int a = 3;
    int b = 5;

    // Act
    int result = App.add(a, b);

    // Assert
    assertEquals(8, result);
}
```

## Arrange, Act, Assert

### Arrange
Prepare the input values and test data.

### Act
Run the method that is being tested.

### Assert
Compare the actual result with the expected result.

## JUnit Assertions

### assertEquals
Checks that two values are equal.

```java
assertEquals(5, result);
```

### assertTrue
Checks that the result is `true`.

```java
assertTrue(App.isPrime(7));
```

### assertFalse
Checks that the result is `false`.

```java
assertFalse(App.isPrime(9));
```

### assertNotNull
Checks that the result is not `null`.

```java
assertNotNull(result);
```

### assertNull
Checks that the result is `null`.

```java
assertNull(result);
```

### assertThrows
Checks that a method throws the expected exception.

```java
@Test
public void testFactorialNegativeNumberThrowsException() {
    assertThrows(IllegalArgumentException.class, () -> {
        App.factorial(-3);
    });
}
```

## Edge Cases

An edge case is an input value that is close to a boundary or may cause unusual behavior.

Examples:

- `0`
- `1`
- Negative numbers
- Empty strings
- Empty arrays
- Empty lists
- Values exactly on a condition boundary

Example:

```java
assertTrue(isAdult(18));
assertFalse(isAdult(17));
```

## How to Check Whether Tests Are Sufficient

For every method, the tests should include:

- A normal valid case
- An edge case
- Invalid input when relevant
- Exception testing when relevant
- All important `if` and `else` paths

Example for `factorial`:

- `factorial(5)` - regular case
- `factorial(0)` - edge case
- `factorial(1)` - edge case
- `factorial(-3)` - invalid input that should throw an exception

Example for `isPrime`:

- Prime number
- Non-prime number
- The number `2`
- The numbers `0` and `1`
- Negative number

## Methods Discussed from App.java

The following methods were reviewed:

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

## Summary

During the learning process, I learned:

- What unit testing is
- The difference between manual testing and automated testing
- How JUnit is used in Java
- The meaning of `@Test`
- How to write clear test method names
- How to use Arrange, Act, Assert
- How to use different assertion methods
- How to test edge cases
- How to test exceptions
- How to check whether the tests cover the important execution paths

## Conclusion

Unit tests make it possible to check code automatically, quickly, and accurately.  
They help verify that each method works correctly and make it easier to detect errors after future code changes.
