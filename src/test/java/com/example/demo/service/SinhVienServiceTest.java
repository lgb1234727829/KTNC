package com.example.demo.service;

import com.example.demo.entity.SinhVien;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {

    private SinhVienService sinhVienService;

    @BeforeEach
    void setUp() {
        sinhVienService = new SinhVienService();
    }

    // add
    @Test
    void addSinhVienWithValidSinhVien() {
        SinhVien sinhVien = new SinhVien("MKT", 2, 9, 19, "abc", "sv01");
        sinhVienService.addSinhVien(sinhVien);

        assertEquals(1, sinhVienService.getAllSinhVien().size());
        assertEquals(19, sinhVienService.getSinhVienbyId("sv01").getTuoi());

    }

    @Test
    void addSinhVienWithNull() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSinhVien(null));

        assertEquals("sinh vien null", exception.getMessage());
    }

    @Test
    void addSinhVienWithInvalidAge() {

        Exception exception = assertThrows(IllegalArgumentException.class, ()
                -> sinhVienService.addSinhVien(new SinhVien("MKT", 1, 9, 17, "abc", "sv01")));

        assertEquals("Tuoi lon hon 18", exception.getMessage());
    }

}