package secsion1_ngon_ngu_lap_trinh_java.bai_tap;

public class ShowPrimeNumberLessThan100 {
    public static void main(String[] args) {
        ShowPimeNumber();

    }
    public static void ShowPimeNumber(){
        int checkOut=0;
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
                checkOut=i;
                if(checkOut>100) {
                    break;
                }else {
                    prime = prime + i + " ";
                }
            }

        }
        System.out.print("Các số nguyên tố nhỏ hơn 100 là: "+prime);
    }
}
