package furamaResort.sort;

import furamaResort.models.Customer;

import java.util.Comparator;
import java.util.stream.Collector;

public class SortForCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if(o1.getName().compareTo(o2.getName())==0) {
            return Integer.parseInt(o2.getBirthday().substring(6)) - Integer.parseInt(o1.getBirthday().substring(6));
        }
        return o1.getName().compareTo(o2.getName());
//        String name1=o1.getName();
//        String name2=o2.getName();
//        if(!name1.equals(name2)){
//            return name1.compareTo(name2);
//        }
//        String birth1=o1.getBirthday();
//        String birth2=o2.getBirthday();
//        return birth1.compareTo(birth2);
    }
}
