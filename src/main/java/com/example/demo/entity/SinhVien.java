package com.example.demo.entity;

public class SinhVien {

    private String maSV;
    private String ten;
    private int tuoi;
    private float diemTrungBinh;
    private int kyHoc;
    private String chuyenNganh;

    public SinhVien(String chuyenNganh, int kyHoc, float diemTrungBinh, int tuoi, String ten, String maSV) {
        this.chuyenNganh = chuyenNganh;
        this.kyHoc = kyHoc;
        setDiemTrungBinh(diemTrungBinh);
        setTuoi(tuoi);
        setTen(ten);
        this.maSV = maSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {

        if (ten == null || ten.isEmpty()) {

            throw new IllegalArgumentException("Ten khong duoc de trong");
        }
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {

        if (tuoi<18 ) {
            throw new IllegalArgumentException("Tuoi lon hon 18");
        }
        this.tuoi = tuoi;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {

        if (diemTrungBinh < 0 || diemTrungBinh > 10) {
            throw new IllegalArgumentException("Sai diem");
        }
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
