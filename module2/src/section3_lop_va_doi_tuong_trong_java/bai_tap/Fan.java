package section3_lop_va_doi_tuong_trong_java.bai_tap;

public class Fan {
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color="blue";

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
       this.on = on;
    }

    public int isSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString()	{
        if(on==true){
            return "Quạt đang bật";
        }else {
            return "Quat đang tắt";
        }
    }

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public static void main(String[] args) {
        Fan fan1=new Fan(3,true,10,"Black");
        fan1.setOn(false);
        System.out.println(fan1.isOn());
        fan1.toString();

        Fan fan2=new Fan(2,true,5,"Blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.color);
    }
}
