package com.example.demo.service;

import com.example.demo.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {

    private List<SinhVien> sinhViens = new ArrayList<>();

    public void addSinhVien(SinhVien sinhVien) {

        if (sinhVien==null){
            throw new IllegalArgumentException("sinh vien null");
        }

        sinhViens.add(sinhVien);
    }

    public SinhVien getSinhVienbyId(String maSV){
        for(SinhVien sinhVien: sinhViens) {

            if (sinhVien.getMaSV()==maSV) {
                return sinhVien;
            }
        }
        return null;
    }

    public void updateSinhVien(SinhVien sinhVien){

        if (sinhVien==null) {
            throw new IllegalArgumentException("sinhvien k null");

        }
        for (int i = 0; i<sinhViens.size(); ++i) {
            if (sinhViens.get(i).getMaSV()==sinhVien.getMaSV()) {
                sinhViens.set(i, sinhVien);
                return;

            }
        }
        throw new IllegalArgumentException("Student with id " + sinhVien.getMaSV() + " does not exist");

    }
    public boolean deleteSinhVien(String maSV) {

        for (int i = 0; i < sinhViens.size(); ++i) {

            if (sinhViens.get(i).getMaSV() == maSV) {

                sinhViens.remove(i);

                return true;
            }
        }

        return false;
    }

    // getAll
    public List<SinhVien> getAllSinhVien() {

        return sinhViens;
    }


}
