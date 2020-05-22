package codegym;

public class HocVienCodeGym extends HocVien {
    public String taiKhoanJames;

    public HocVienCodeGym(String tenHocVien, String ngaySinh, String taiKhoanJames) {
        super(tenHocVien,ngaySinh);
        this.tenHocVien=tenHocVien;
    }

    @Override
    void thi(String tenMonHoc) {
        System.out.println(this.tenHocVien + " thi Module 1 -> 4, " + tenMonHoc);
    }

    void nopPhat() {

    }

    public void nopPhat(double tien) {

    }

    public String nopPhat(double abc, double tien) {
        return null;
    }

    String nopPhat(double tien, String lyDo) {
        return null;
    }
}
