package furama_resort.models;


public class Quantity {
    int count;

    public int increment(){
        return count++;
    }

    public int decrement(){
        return count--;
    }

    public Quantity(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
