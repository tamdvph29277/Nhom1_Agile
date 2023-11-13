
package repository;

import java.util.ArrayList;
import model.DiemSinhVien;
import java.sql.*;
import model.SinhVien;

/**
 *
 * @author Admin
 */
public class DiemSvRepository {
    public ArrayList<DiemSinhVien>all(){
        ArrayList<DiemSinhVien>list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "select * from diem_sv join sinh_vien on diem_sv.maSv = sinh_vien.maSv";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            
            while(rs.next()){
             int id = rs.getInt("id");
             String hoTen = rs.getString("ho_ten");
             String maSv = rs.getString("maSv");
                SinhVien sv = new SinhVien();
                sv.setMaSv(maSv);
                sv.setHoTen(hoTen);
             int tiengAnh = rs.getInt("tieng_anh");
             int tinHoc = rs.getInt("tin_hoc");
             int GDTC = rs.getInt("GDTC");
             
             DiemSinhVien dsv = new DiemSinhVien(id, sv, tiengAnh, tinHoc, GDTC);
             list.add(dsv);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean insert(DiemSinhVien dsv){
        try {
            Connection conn = DBContext.getConnection();
            String sql = "INSERT INTO diem_sv(maSv,tieng_anh,tin_hoc,GDTC) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            String masv =null;
            if(dsv.getSinhVien() != null){
                masv = dsv.getSinhVien().getMaSv();
            }
            ps.setString(1,masv);
            ps.setInt(2, dsv.getTiengAnh());
            ps.setInt(3, dsv.getTinHoc());
            ps.setInt(4, dsv.getGDTC());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
   
    }
    
    public boolean update(DiemSinhVien dsv){
        try {
            Connection conn = DBContext.getConnection();
            String sql = " UPDATE diem_sv SET tieng_anh = ?, tin_hoc = ?, GDTC = ? WHERE maSv = ? ;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, dsv.getTiengAnh());
            ps.setInt(2, dsv.getTinHoc());
            ps.setInt(3, dsv.getGDTC());
            String maSv = null;
            if(dsv.getSinhVien() != null){
                maSv = dsv.getSinhVien().getMaSv();
            }
            ps.setString(4, maSv);
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
   
    }
    
    public boolean delete(String maSv){
        try {
            Connection conn = DBContext.getConnection();
            String sql = " DELETE FROM diem_sv WHERE maSv = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maSv);
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
