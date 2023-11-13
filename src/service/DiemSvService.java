package service;

import java.util.ArrayList;
import model.DiemSinhVien;
import repository.DiemSvRepository;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class DiemSvService {

    private DiemSvRepository DiemRepo;

    public DiemSvService() {
        this.DiemRepo = new DiemSvRepository();
    }

    public ArrayList<DiemSinhVien> all() {
        return this.DiemRepo.all();
    }
    
    public boolean insert(DiemSinhVien dsv){
        return this.DiemRepo.insert(dsv);
    }
     public boolean update(DiemSinhVien dsv){
        return this.DiemRepo.update(dsv);
    }
      public boolean delete(String maSv){
        return this.DiemRepo.delete(maSv);
    }
}
