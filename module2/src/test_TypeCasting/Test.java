package test_TypeCasting;

public class Test {
    String birthday;

    public Test(String birthday) {
        this.birthday = birthday;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args) {
        Test test=new Test("29/09/1982");
        Test t=new Test("27/10/1987");
        System.out.println(test.birthday);
        String t1=test.birthday.substring(6);
        String t2=t.birthday.substring(6);
        System.out.println(t1);
        System.out.println(t2);



    }
}
