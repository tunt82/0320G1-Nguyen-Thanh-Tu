package section3_lop_va_doi_tuong_trong_java.thuc_hanh;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double weight, double height) {
        this.width = weight;
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(3,  4);
//        System.out.println("Your Rectangle \n"+ rectangle.display());
//        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
//        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
        System.out.println(new Rectangle(3,  4));

    }
}
