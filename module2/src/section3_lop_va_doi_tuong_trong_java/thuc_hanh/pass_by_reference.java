package section3_lop_va_doi_tuong_trong_java.thuc_hanh;

public class pass_by_reference {
     static public class	Person{
        public	String	name;
        public	Person(String	name){
            this.name	=	name;
        }
        public void sayHi(){
            System.out.println("hi " + this.name);
        }
    }
    public	static	void	swap(Person	first,	Person	second){
        String	temp	=	first.name;
        first.name	=	second.name;
        second.name	=	temp;
    }
    public	static	void	main(String[]	args) {
        Person a = new pass_by_reference.Person("John");
        Person b = new pass_by_reference.Person("Bill");
        swap(a,	b);
        System.out.println("a.name	=	"	+	a.name);
        System.out.println("b.name	=	"	+	b.name);
    }
}
