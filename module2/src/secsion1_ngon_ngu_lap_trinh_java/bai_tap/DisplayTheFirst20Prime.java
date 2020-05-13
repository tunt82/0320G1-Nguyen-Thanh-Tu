package secsion1_ngon_ngu_lap_trinh_java.bai_tap;

public class DisplayTheFirst20Prime {
    public static void main(String[] args) {
        ShowPimeNumber();

    }
    public static void ShowPimeNumber(){
        int count=0;
        String prime="";
        for (int i=0;;i++){
            boolean check=false;
            if(i<2){
                check=false;
            }else if (i==2){
                check=true;
            }else {
                for (int j=2; j<i; j++){
                    if(i%j==0){
                        check=false;
                        break;
                    }else {
                        check=true;
                    }
                }
            }
            if (check){
                count++;
                prime=prime+i+" ";
            }
            if (count==20){
                break;
            }
        }
        System.out.print(count+" số nguyên tố đầu tiên là: "+prime);
    }
}

