package section3_lop_va_doi_tuong_trong_java.thuc_hanh;

public class Test {
    public static void main(String[] args) {
        pass_by_reference.Person a =new pass_by_reference.Person("John");
        pass_by_reference.Person b =new pass_by_reference.Person("Bill");
        pass_by_reference.swap(a,b);
        System.out.println("a.name	=	"	+	a.name);
        System.out.println("b.name	=	"	+	b.name);
        a.sayHi();
    }
}
