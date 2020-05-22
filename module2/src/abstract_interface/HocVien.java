package abstract_interface;

public abstract class HocVien {
    public String tenHocVien;
    public String ngaySinh;
    public static String gioiTinh;

    public HocVien() {

    }

    public HocVien(String tenHocVien, String ngaySinh) {
        this.tenHocVien = tenHocVien;
        this.ngaySinh = ngaySinh;
    }

    public abstract void hocBai();

    abstract void thi(String tenMonHoc);

    public void printName() {
        System.out.println("Hoc vien: " + this.tenHocVien);
    }
}
