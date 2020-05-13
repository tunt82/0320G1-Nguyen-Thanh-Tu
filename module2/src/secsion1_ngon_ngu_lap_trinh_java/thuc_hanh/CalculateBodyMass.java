package secsion1_ngon_ngu_lap_trinh_java.thuc_hanh;

public class CalculateBodyMass {
    public static void main(String[] args) {
    calBodyMass(75,1.5f);
    }
    public static void calBodyMass(float weight,float height){
       double bmi=weight/Math.pow(height,2);
       if(bmi<18.5){
           System.out.println("Underweight");
       }else if (18.5<=bmi && bmi<25){
           System.out.println("Normal");
       }else if (25<=bmi && bmi<30) {
           System.out.println("Overweight");
       }else if (bmi>30) {
           System.out.println("Obese");
       }
    }

}
