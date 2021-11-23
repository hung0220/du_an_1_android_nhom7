package com.example.du_an_1_android;

public class ThongTinDangNhap {
    private String id;
    private String TenTK;
    private String MatKhau;

    public ThongTinDangNhap() {
    }

    public ThongTinDangNhap(String id, String tenTK, String matKhau) {
        this.id = id;
        TenTK = tenTK;
        MatKhau = matKhau;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String tenTK) {
        TenTK = tenTK;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }
}
