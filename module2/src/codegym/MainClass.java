package codegym;

public class MainClass {

    public static void main(String[] args) {

//        HocVienCodeGym hocVienCodeGym = new HocVienCodeGym("Tien", "2000", "tiennvt");
//        hocVienCodeGym.thi("Java");
//        HocVien hocVien = new HocVien("Cuong", "8t");
//        hocVien.thi("Java");

        HocVien hocVien = new HocVienCodeGym("Tien", "2000", "tiennvt");
        System.out.println(hocVien.tenHocVien);
        hocVien.thi("Java");

        HocVienCodeGym hocVienCodeGym = (HocVienCodeGym) hocVien;

//        HinhTron[] listHinhTron;
//        TamGiac[] listTamGiac;
//
//        HinhHoc[] listHinhHoc
//                listHinhHoc[0] instanceof TamGiac

    }
}
