package com.example.du_an_1_android;

import java.util.HashMap;
import java.util.Map;

public class ThongTinDangNhap {
    private String id;
    private String TenDangNhap;
    private String MatKhau;
    private String Gmail;
    private String SDT;
    private String TenCuaBan;
    private String NgaySinh;
    private String GioiTinh;
    private String SoThich;
    private String MoTa;
    private String Hinh1;
    private String Hinh2;
    private String Hinh3;
    private String Hinh4;
    private String Hinh5;
    private String Hinh6;
    private String Hinh7;
    private String Hinh8;
    private String Hinh9;

    public ThongTinDangNhap() {
    }

    public ThongTinDangNhap(String id, String tenDangNhap, String matKhau, String gmail, String SDT, String tenCuaBan, String ngaySinh, String gioiTinh, String soThich, String moTa, String hinh1, String hinh2, String hinh3, String hinh4, String hinh5, String hinh6, String hinh7, String hinh8, String hinh9) {
        this.id = id;
        TenDangNhap = tenDangNhap;
        MatKhau = matKhau;
        Gmail = gmail;
        this.SDT = SDT;
        TenCuaBan = tenCuaBan;
        NgaySinh = ngaySinh;
        GioiTinh = gioiTinh;
        SoThich = soThich;
        MoTa = moTa;
        Hinh1 = hinh1;
        Hinh2 = hinh2;
        Hinh3 = hinh3;
        Hinh4 = hinh4;
        Hinh5 = hinh5;
        Hinh6 = hinh6;
        Hinh7 = hinh7;
        Hinh8 = hinh8;
        Hinh9 = hinh9;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        TenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTenCuaBan() {
        return TenCuaBan;
    }

    public void setTenCuaBan(String tenCuaBan) {
        TenCuaBan = tenCuaBan;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getSoThich() {
        return SoThich;
    }

    public void setSoThich(String soThich) {
        SoThich = soThich;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public String getHinh1() {
        return Hinh1;
    }

    public void setHinh1(String hinh1) {
        Hinh1 = hinh1;
    }

    public String getHinh2() {
        return Hinh2;
    }

    public void setHinh2(String hinh2) {
        Hinh2 = hinh2;
    }

    public String getHinh3() {
        return Hinh3;
    }

    public void setHinh3(String hinh3) {
        Hinh3 = hinh3;
    }

    public String getHinh4() {
        return Hinh4;
    }

    public void setHinh4(String hinh4) {
        Hinh4 = hinh4;
    }

    public String getHinh5() {
        return Hinh5;
    }

    public void setHinh5(String hinh5) {
        Hinh5 = hinh5;
    }

    public String getHinh6() {
        return Hinh6;
    }

    public void setHinh6(String hinh6) {
        Hinh6 = hinh6;
    }

    public String getHinh7() {
        return Hinh7;
    }

    public void setHinh7(String hinh7) {
        Hinh7 = hinh7;
    }

    public String getHinh8() {
        return Hinh8;
    }

    public void setHinh8(String hinh8) {
        Hinh8 = hinh8;
    }

    public String getHinh9() {
        return Hinh9;
    }

    public void setHinh9(String hinh9) {
        Hinh9 = hinh9;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> resuft = new HashMap<>();
        resuft.put("gmail", Gmail);
        return resuft;
    }
    public Map<String, Object> toMapSDT() {
        HashMap<String, Object> resuft = new HashMap<>();
        resuft.put("sdt", SDT);
        return resuft;
    }
    public Map<String, Object> toMapTenCuaBan() {
        HashMap<String, Object> resuft = new HashMap<>();
        resuft.put("tenCuaBan", TenCuaBan);
        return resuft;
    }
    public Map<String, Object> toMapNgaySinh() {
        HashMap<String, Object> resuft = new HashMap<>();
        resuft.put("ngaySinh", NgaySinh);
        return resuft;
    }
    public Map<String, Object> toMapGioiTinh() {
        HashMap<String, Object> resuft = new HashMap<>();
        resuft.put("gioiTinh", GioiTinh);
        return resuft;
    }
    public Map<String, Object> toMapSoThich() {
        HashMap<String, Object> resuft = new HashMap<>();
        resuft.put("soThich", SoThich);
        return resuft;
    }
    public Map<String, Object> toMapMoTa() {
        HashMap<String, Object> resuft = new HashMap<>();
        resuft.put("moTa", MoTa);
        return resuft;
    }
    public Map<String, Object> toMapAnh1() {
        HashMap<String, Object> resuft = new HashMap<>();
        resuft.put("hinh1", Hinh1);
        return resuft;
    }



}
