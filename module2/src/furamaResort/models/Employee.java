package furamaResort.models;

public class Employee {
    int idCard;
    String nameEmployee;
    String birthday;
    String address;
//    int phoneNumber;
//    String email;
//    String level;


    public Employee() {
    }

    public Employee(int idCard, String nameEmployee, String birthday, String address) {
        this.idCard = idCard;
        this.nameEmployee = nameEmployee;
        this.birthday = birthday;
        this.address = address;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EMPLOYEE: " +
                "idCard=" + idCard +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\''
                ;
    }
}
