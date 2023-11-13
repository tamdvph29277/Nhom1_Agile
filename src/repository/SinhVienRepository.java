package repository;

import java.util.ArrayList;
import model.SinhVien;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class SinhVienRepository {

    public ArrayList<SinhVien> all() {
        ArrayList<SinhVien> list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "SELECT * FROM sinh_vien";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maSv = rs.getString("maSv");
                String hoTen = rs.getString("ho_ten");
                String email = rs.getString("email");
                String sdt = rs.getString("sdt");
                boolean gioiTinh = rs.getBoolean("gioi_tinh");
                String diaChi = rs.getString("dia_chi");
                String hinh = rs.getString("hinh");

                SinhVien sv = new SinhVien(maSv, hoTen, email, sdt, gioiTinh, diaChi, hinh);
                list.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean insert(SinhVien sv) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "INSERT INTO sinh_vien(maSv, ho_ten,email,sdt,gioi_tinh,dia_chi,hinh) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sv.getMaSv());
            ps.setString(2, sv.getHoTen());
            ps.setString(3, sv.getEmail());
            ps.setString(4, sv.getSdt());
            ps.setBoolean(5, sv.isGioiTinh());
            ps.setString(6, sv.getDiachi());
            ps.setString(7, sv.getHinh());
            ps.execute();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(SinhVien sv) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "UPDATE sinh_vien SET ho_ten = ?,email = ?,sdt = ?,gioi_tinh = ?,dia_chi = ?,hinh = ? WHERE maSv = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, sv.getHoTen());
            ps.setString(2, sv.getEmail());
            ps.setString(3, sv.getSdt());
            ps.setBoolean(4, sv.isGioiTinh());
            ps.setString(5, sv.getDiachi());
            ps.setString(6, sv.getHinh());
            ps.setString(7, sv.getMaSv());
            ps.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(SinhVien sv) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "DELETE FROM sinh_vien WHERE maSv = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sv.getMaSv());
            ps.executeUpdate();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
