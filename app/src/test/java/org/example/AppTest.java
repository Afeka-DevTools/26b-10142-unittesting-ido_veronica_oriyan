package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AppTest {

    @Test
    public void testAdd() {
        assertEquals(5, App.add(2, 3));
        assertEquals(-1, App.add(-4, 3));
        assertEquals(0, App.add(0, 0));
    }

    @Test
    public void testIsPrime() {
        assertTrue(App.isPrime(2));
        assertTrue(App.isPrime(13));
        assertFalse(App.isPrime(1)); // מקרה קצה: 1 אינו ראשוני
        assertFalse(App.isPrime(0)); // מקרה קצה: 0
        assertFalse(App.isPrime(-5)); // מקרה קצה: שלילי
        assertFalse(App.isPrime(9)); // לא ראשוני
    }

    @Test
    public void testReverse() {
        assertEquals("cba", App.reverse("abc"));
        assertEquals("", App.reverse("")); // מקרה קצה: מחרוזת ריקה
        assertEquals("a", App.reverse("a"));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, App.factorial(5));
        assertEquals(1, App.factorial(0)); // מקרה קצה: 0 עצרת זה 1
        assertEquals(1, App.factorial(1));
        
        // מקרה קצה: מספר שלילי אמור לזרוק שגיאה
        assertThrows(IllegalArgumentException.class, () -> App.factorial(-1));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(App.isPalindrome("A man, a plan, a canal: Panama")); // עם רווחים ופיסוק
        assertTrue(App.isPalindrome("racecar"));
        assertFalse(App.isPalindrome("hello"));
        assertTrue(App.isPalindrome("")); // מקרה קצה: מחרוזת ריקה
    }

    @Test
    public void testFibonacciUpTo() {
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5), App.fibonacciUpTo(5));
        assertEquals(Arrays.asList(0), App.fibonacciUpTo(0)); // מקרה קצה: עד 0
        
        // מקרה קצה: קלט שלילי אמור לזרוק שגיאה
        assertThrows(IllegalArgumentException.class, () -> App.fibonacciUpTo(-5));
    }

    @Test
    public void testCharFrequency() {
        Map<Character, Integer> freq = App.charFrequency("hello");
        assertEquals(1, freq.get('h'));
        assertEquals(1, freq.get('e'));
        assertEquals(2, freq.get('l'));
        assertEquals(1, freq.get('o'));
        
        assertTrue(App.charFrequency("").isEmpty()); // מקרה קצה: מחרוזת ריקה
    }

    @Test
    public void testIsAnagram() {
        assertTrue(App.isAnagram("Listen", "Silent")); // מקרה קצה: אותיות גדולות וקטנות
        assertTrue(App.isAnagram("Dormitory", "Dirty room")); // מקרה קצה: רווחים
        assertFalse(App.isAnagram("hello", "world"));
    }

    @Test
    public void testAverage() {
        int[] arr1 = {1, 2, 3, 4, 5};
        assertEquals(3.0, App.average(arr1));
        
        int[] arr2 = {-5, 5, 0};
        assertEquals(0.0, App.average(arr2));

        // מקרה קצה: מערך ריק אמור לזרוק שגיאה
        assertThrows(IllegalArgumentException.class, () -> App.average(new int[]{}));
    }

    @Test
    public void testFilterEvens() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(Arrays.asList(2, 4, 6), App.filterEvens(list));
        
        List<Integer> oddsOnly = Arrays.asList(1, 3, 5);
        assertTrue(App.filterEvens(oddsOnly).isEmpty()); // מקרה קצה: רק אי-זוגיים
    }

    @Test
    public void testMostCommonWord() {
        String text = "Hello world! Hello everyone. World is big.";
        assertEquals("hello", App.mostCommonWord(text)); // מתעלם מאותיות גדולות וסימני פיסוק
        
        String singleWord = "test";
        assertEquals("test", App.mostCommonWord(singleWord));
    }
}