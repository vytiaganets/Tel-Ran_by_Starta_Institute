package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringJoinServiceTest {
    private StringJoinService joinService = new StringJoinService();
    @Test
    void getJoinSubstring() {
        String[] subStr = {"I", "like", "fish"};
        StringBuffer result = joinService.getJoinSubstring(subStr);
        assertEquals("I like fish ", result.toString()); // сравнивание двух обьектов
        assertTrue(result.toString().length() == 12); // просто пример assertTrue, хотя его можно
        // заменить на assertEquals
    }

    @Test
    void getJoinSubstring2() {
        String[] subStr = {"I", "like", "meat"};
        StringBuffer result = joinService.getJoinSubstring(subStr);
        assertNotNull(result); // проверка что результат не null
        assertEquals("I like meat ", result.toString());
    }
}


//package org.example;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class StringJoinServiceTest {
//    private StringJoinService joinService = new StringJoinService();
//    @Test
//    void getJoinSubstring() {
//        String[] subStr = {"I", "like", "fish"};
//        StringBuffer result = joinService.getJoinSubstring(subStr);
//        assertEquals("I like fish ", result.toString());
//    }
//
//    @Test
//    void getJoinSubstring2() {
//        String[] subStr = {"I", "like", "meat"};
//        StringBuffer result = joinService.getJoinSubstring(subStr);
//        assertEquals("I like meat ", result.toString());
//    }
//}