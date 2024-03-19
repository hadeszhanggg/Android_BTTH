package com.example.lab04;

public class NhanVien {

        int maNV;
        String tenNV;

        public NhanVien(int maNV,String tenNV) {
            this.maNV=maNV;
            this.tenNV=tenNV;
        }

        public NhanVien() {
        }

        public int getMaNV() {
            return this.maNV;
        }

        public void setMaNV(int idAnh) {
            this.maNV = idAnh;
        }

        public String getTenNV() {
            return this.tenNV;
        }

        public void setTenNV(String tenNV) {
            this.tenNV = tenNV;
        }
}
