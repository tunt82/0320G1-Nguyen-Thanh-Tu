package abstract_interface;


import codegym.ThongTinGiaDinh;

public class HocVienCodeGym extends HocVien implements ThongTinGiaDinh {
    public String taiKhoanJames;

    public HocVienCodeGym(String tenHocVien, String ngaySinh, String taiKhoanJames) {
        super(tenHocVien, ngaySinh);
        this.taiKhoanJames = taiKhoanJames;
    }


    void nopPhat() {

    }

    public void nopPhat(double tien) {
        System.out.println("Tiền nộp phạt là: "+tien);

    }

    public String nopPhat(double abc, double tien) {
        return null;
    }

    String nopPhat(double tien, String lyDo) {
        return null;
    }

    @Override
    public void hocBai() {

    }

    @Override
    void thi(String tenMonHoc) {

    }



//    @Override
//    public void hocBai() {
//        System.out.println(this.tenHocVien + " hoc thi phai login " + this.taiKhoanJames);
//    }
//
//    @Override
//    void thi(String tenMonHoc) {
//        System.out.println("thi module 1");
//        System.out.println("thi module 2");
//        System.out.println("thi module 3");
//        System.out.println("thi module 4");
//        System.out.println(tenMonHoc);
//    }
//
    @Override
    public void updateThongTinCha(String hoTenCha) {
        // update thong tin
        System.out.println("Da update thong tin cha");
    }

    @Override
    public void updateThongTinMe(String hoTenMe) {
        // update thong tin
        System.out.println("Da update thong tin me");
    }
//
//    @Override
//    public void boTien(double tien) {
//        this.nopPhat(tien);
//    }
}
