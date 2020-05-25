package furamaResort.common;

import furamaResort.exception.BirthdayException;
import furamaResort.exception.GenderException;
import furamaResort.exception.NameException;
import furamaResort.models.Customer;

import java.util.Scanner;

public class CheckInputAndAddCustomerInfor {
    public static Customer addNewCustomer(){
        Scanner sc=new Scanner(System.in);
        Customer customer=new Customer();
        while (true){
            try{
                System.out.println("Enter name of customer:");
                String nameCustomer= NameException.nameException(sc.nextLine());
                customer.setName(nameCustomer);
                break;
            } catch (NameException e) {
                System.out.println(e);;
            }
        }
        while (true){
            try{
                System.out.println("Enter gender of customer:");
                String genderCustomer= GenderException.genderException(sc.nextLine());
                customer.setGender(genderCustomer);
                break;
            } catch (GenderException e) {
                System.out.println(e);;
            }
        }
        while (true){
            try{
                System.out.println("Enter birthday of customer:");
                String birthdayCustomer= BirthdayException.birthdayException(sc.nextLine());
                customer.setBirthday(birthdayCustomer);
                break;
            } catch (BirthdayException e) {
                System.out.println(e);;
            }
        }
        System.out.println("Enter idCard of customer:");
        customer.setIdCard(sc.nextLine());
        System.out.println("Enter phone of number of customer:");
        customer.setPhoneNumber(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter email of customer:");
        customer.setEmail(sc.nextLine());
        System.out.println("Enter type of customer:");
        customer.setCustomerType(sc.nextLine());
        System.out.println("Enter address of customer:");
        customer.setAddress(sc.nextLine());

        return customer;
    }
}
