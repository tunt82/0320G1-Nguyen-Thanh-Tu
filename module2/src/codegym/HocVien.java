package codegym;

public class HocVien {
    public String tenHocVien;
    public String ngaySinh;
    public static String gioiTinh;

    public HocVien() {

    }

    public HocVien(String tenHocVien, String ngaySinh) {
        this.tenHocVien = tenHocVien;
        this.ngaySinh = ngaySinh;
    }

    public void hocBai() {
        System.out.println(this.tenHocVien + "dang hoc");
    }

    void thi(String tenMonHoc) {
        System.out.println(this.tenHocVien + " dang thi " + tenMonHoc);
    }
}
