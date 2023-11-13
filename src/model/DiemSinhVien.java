
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DiemSinhVien {
    private Integer id;
    private SinhVien sinhVien;
    private int tiengAnh;
    private int tinHoc;
    private int GDTC;

    public DiemSinhVien() {
    }

    public DiemSinhVien(Integer id, SinhVien sinhVien, int tiengAnh, int tinHoc, int GDTC) {
        this.id = id;
        this.sinhVien = sinhVien;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.GDTC = GDTC;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public int getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(int tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public int getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(int tinHoc) {
        this.tinHoc = tinHoc;
    }

    public int getGDTC() {
        return GDTC;
    }

    public void setGDTC(int GDTC) {
        this.GDTC = GDTC;
    }

   

    public String diemtb(){
        double diem = ((getTiengAnh()+getTinHoc()+getGDTC())/3);
        String d = String.format("%.1f", diem);
        return d;
    }
}
