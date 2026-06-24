package com.example.demo.method;

import com.example.demo.method.MyUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyUtilsTest {

    @Test
    @DisplayName("Phep Cong")
    void addTest() {
       int result =  new MyUtils().add(1,2);

        Assertions.assertEquals(3, result);
    }

    @Test
    @DisplayName("Dao Ky Tu")
    void reverseTest() {
        Assertions.assertEquals("cba", new MyUtils().reverse("abc"));
    }
}