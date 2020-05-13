package secsion1_ngon_ngu_lap_trinh_java.thuc_hanh;

import java.util.Scanner;

public class FindValueInTheArray {
    public static void main(String[] args) {
        findName();
    }
    public static void findName(){
        String[] students={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc=new Scanner(System.in);
        System.out.print("Input student of name: ");
        String name=sc.nextLine();
        boolean isExist=false;
        for (int i=0; i<students.length; i++){
            if(students[i].equals(name)){
                System.out.print("Position of student in list "+name+" is: "+(i+1));
                isExist=true;
                break;
            }

        }
        if (!isExist){
            System.out.println("Not found " + name + " in the list.");
        }
    }
}
