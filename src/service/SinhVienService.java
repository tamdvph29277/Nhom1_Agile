package service;

import java.util.ArrayList;
import model.SinhVien;
import repository.SinhVienRepository;

/**
 *
 * @author Admin
 */
public class SinhVienService {

    private SinhVienRepository SinhVienRepo;

    public SinhVienService() {
        this.SinhVienRepo = new SinhVienRepository();
    }

    public ArrayList<SinhVien> all() {
        return this.SinhVienRepo.all();
    }

    public boolean insert(SinhVien sv) {
        return this.SinhVienRepo.insert(sv);
    }
    
    public boolean update(SinhVien sv){
        return this.SinhVienRepo.update(sv);
    }
    
    public boolean delete(SinhVien sv){
        return this.SinhVienRepo.delete(sv);
    }
}
