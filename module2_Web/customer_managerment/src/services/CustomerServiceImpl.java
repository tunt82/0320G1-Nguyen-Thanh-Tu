package services;

import com.sun.javafx.collections.MappingChange;
import models.Customers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerServicesInterface {
    private static Map<Integer,Customers>listCustomers;
    static {
        listCustomers=new HashMap<Integer, Customers>();
        listCustomers.put(1,new Customers(1,"Tu","tu@gmail.com","Thanh Khe"));
        listCustomers.put(2,new Customers(2,"Vu","vu@gmail.com","Hai Chau"));
        listCustomers.put(3,new Customers(3,"Thanh","thanh@gmail.com","Lien Chieu"));
    }


    public List<Customers> findAll() {
        return new ArrayList<>(listCustomers.values());
    }

    @Override
    public void save(Customers customer) {
        listCustomers.put(customer.getId(),customer);
    }

    @Override
    public Customers findById(int id) {
        return listCustomers.get(id);
    }

    @Override
    public void update(int id, Customers customer) {
        listCustomers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        listCustomers.remove(id);
    }
}
