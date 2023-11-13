package model;

/**
 *
 * @author Admin
 */
public class SinhVien {

    private String maSv;
    private String hoTen;
    private String email;
    private String sdt;
    private boolean gioiTinh;
    private String diachi;
    private String hinh;

    public SinhVien() {
    }

    public SinhVien(String maSv, String hoTen, String email, String sdt, boolean gioiTinh, String diachi, String hinh) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
        this.diachi = diachi;
        this.hinh = hinh;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSv=" + maSv + ", hoTen=" + hoTen + ", email=" + email + ", sdt=" + sdt + ", gioiTinh=" + gioiTinh + ", diachi=" + diachi + ", hinh=" + hinh + '}';
    }

   
}
