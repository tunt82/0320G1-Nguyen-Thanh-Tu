package furamaResort.common;

import furamaResort.models.*;

import java.io.*;
import java.util.*;

public class FuncWriteAndReadFileCSV {
    private static final char COMMA_DELIMITER = ',';
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final int NUM_OF_LINE_SKIP = 1;
    private static final String PATH_FILE_VILLA = "src/furamaResort/data/Villa.csv";
    private static final String PATH_FILE_HOUSE = "src/furamaResort/data/House.csv";
    private static final String PATH_FILE_ROOM = "src/furamaResort/data/Room.csv";
    private static final String PATH_FILE_BOOKING = "src/furamaResort/data/Booking.csv";
    private static final String PATH_FILE_CUSTOMER = "src/furamaResort/data/Customer.csv";
    private static final String PATH_FILE_EMPLOYEE = "src/furamaResort/data/Employee.csv";
    private static final String FILE_HEADER_OF_VILLA = "id,codeService,nameService,rentalArea,rentalCost, maxNumberOfPeople, typeRent, roomStandard, convenientDescription, areaPool, numberOfFloors";
    private static final String FILE_HEADER_OF_HOUSE = "id,codeService,nameService,rentalArea,rentalCost, maxNumberOfPeople, typeRent, roomStandard, convenientDescription, numberOfFloors";
    private static final String FILE_HEADER_OF_ROOM = "id,codeService,nameService,rentalArea,rentalCost, maxNumberOfPeople, typeRent, freeService";
    private static final String FILE_HEADER_OF_CUSTOMER = "name,birthday,gender,idCard,phoneNumber,email,customerType,address";
    private static final String[] FILE_HEADER_OF_BOOKING = {" nameCustomer", " birthday", " gender", "idCard", " phoneNumber", " email", " customerType", " address", "codeService", "nameService", "rentalArea", "rentalCost", "maxNumberOfPeople", "typeRent",};
    private static final String[] FILE_HEADER_OF_EMPOYEE = {"Id", "age","address",};


    public static void writeCsvFileVilla(List<Villa> villas) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH_FILE_VILLA,true);
            fileWriter.append(FILE_HEADER_OF_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villaCSV : villas) {
                fileWriter.append(villaCSV.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villaCSV.getCodeService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villaCSV.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villaCSV.getRentalArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villaCSV.getRentalCost()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villaCSV.getMaximumNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villaCSV.getTypeOfRent()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villaCSV.getRoomStandard()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villaCSV.getDescriptionConvenient());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villaCSV.getPoolArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villaCSV.getFloorNumber()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
    public static void writeCsvFileHouse(List<House> houses) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH_FILE_HOUSE,true);
            fileWriter.append(FILE_HEADER_OF_HOUSE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (House houseCSV : houses) {
                fileWriter.append(houseCSV.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(houseCSV.getCodeService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(houseCSV.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(houseCSV.getRentalArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(houseCSV.getRentalCost()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(houseCSV.getMaximumNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(houseCSV.getTypeOfRent()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(houseCSV.getRoomStandard()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(houseCSV.getDescriptionConvenient());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(houseCSV.getFloorNumber()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
    public static void writeCsvFileRoom(List<Room> rooms) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH_FILE_ROOM,true);
            fileWriter.append(FILE_HEADER_OF_ROOM);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room roomCSV : rooms) {
                fileWriter.append(roomCSV.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(roomCSV.getCodeService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(roomCSV.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(roomCSV.getRentalArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(roomCSV.getRentalCost()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(roomCSV.getMaximumNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(roomCSV.getTypeOfRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(roomCSV.getFreeService());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
    public static void writeCsvFileCustomer(List<Customer> customers) {
        FileWriter fileWriter=null;
        try {
            File file=new File(PATH_FILE_CUSTOMER);
            fileWriter = new FileWriter(PATH_FILE_CUSTOMER,true);
            for (Customer customerCSV : customers) {
                fileWriter.append(customerCSV.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customerCSV.getBirthday());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customerCSV.getGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customerCSV.getIdCard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customerCSV.getPhoneNumber()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customerCSV.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customerCSV.getCustomerType());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customerCSV.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully !!!");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
    public static void writeCsvFileBooking(Customer customer) {
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter(PATH_FILE_BOOKING,true);
            fileWriter.append(customer.getName());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getBirthday());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getGender());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getIdCard());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(customer.getPhoneNumber()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getEmail());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getCustomerType());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getAddress());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getUseService().getCodeService());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getUseService().getNameService());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getUseService().getCodeService());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getUseService().getNameService());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(customer.getUseService().getRentalArea()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(customer.getUseService().getRentalCost()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(customer.getUseService().getMaximumNumberOfPeople()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getUseService().getTypeOfRent());
            fileWriter.append(NEW_LINE_SEPARATOR);
            System.out.println("CSV file was created successfully !!!");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }

    public static ArrayList<Villa> readCsvFileVilla() {
        BufferedReader br=null;
        ArrayList<Villa> listVillasService=new ArrayList<Villa>();
        try {
            String line;
            br=new BufferedReader(new FileReader(PATH_FILE_VILLA));

            while ((line=br.readLine())!=null){
                String[] splitData=line.split(",");
                if(splitData[0].equals("id")){
                    continue;
                }
                Villa villas=new Villa();
                villas.setId(splitData[0]);
                villas.setCodeService(splitData[1]);
                villas.setNameService(splitData[2]);
                villas.setRentalArea(Integer.parseInt(splitData[3]));
                villas.setRentalCost(Double.parseDouble(splitData[4]));
                villas.setMaximumNumberOfPeople(Integer.parseInt(splitData[5]));
                villas.setTypeOfRent(splitData[6]);
                villas.setRoomStandard(splitData[7]);
                villas.setDescriptionConvenient(splitData[8]);
                villas.setPoolArea(Double.parseDouble(splitData[9]));
                villas.setFloorNumber(Integer.parseInt(splitData[10]));
                listVillasService.add(villas);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listVillasService;
    }
    public static ArrayList<House> readCsvFileHouse() {
        BufferedReader br=null;
        ArrayList<House> listHouseService=new ArrayList<House>();
        try {
            String line;
            br=new BufferedReader(new FileReader(PATH_FILE_HOUSE));

            while ((line=br.readLine())!=null){
                String[] splitData=line.split(",");
                if(splitData[0].equals("id")){
                    continue;
                }
                House houses=new House();
                houses.setId(splitData[0]);
                houses.setCodeService(splitData[1]);
                houses.setNameService(splitData[2]);
                houses.setRentalArea(Integer.parseInt(splitData[3]));
                houses.setRentalCost(Double.parseDouble(splitData[4]));
                houses.setMaximumNumberOfPeople(Integer.parseInt(splitData[5]));
                houses.setTypeOfRent(splitData[6]);
                houses.setRoomStandard(splitData[7]);
                houses.setDescriptionConvenient(splitData[8]);
                houses.setFloorNumber(Integer.parseInt(splitData[9]));
                listHouseService.add(houses);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listHouseService;
    }
    public static ArrayList<Room> readCsvFileRoom() {
        BufferedReader br=null;
        ArrayList<Room> listRoomService=new ArrayList<Room>();
        try {
            String line;
            br=new BufferedReader(new FileReader(PATH_FILE_ROOM));

            while ((line=br.readLine())!=null){
                String[] splitData=line.split(",");
                if(splitData[0].equals("id")){
                    continue;
                }
                Room rooms=new Room();
                rooms.setId(splitData[0]);
                rooms.setCodeService(splitData[1]);
                rooms.setNameService(splitData[2]);
                rooms.setRentalArea(Integer.parseInt(splitData[3]));
                rooms.setRentalCost(Double.parseDouble(splitData[4]));
                rooms.setMaximumNumberOfPeople(Integer.parseInt(splitData[5]));
                rooms.setTypeOfRent(splitData[6]);
                rooms.setFreeService(splitData[7]);
                listRoomService.add(rooms);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listRoomService;
    }
    public static ArrayList<Customer> readCsvFileCustomer() {
        BufferedReader br=null;
        ArrayList<Customer> listCustomer=new ArrayList<Customer>();
        try {
            String line;
            br=new BufferedReader(new FileReader(PATH_FILE_CUSTOMER));

            while ((line=br.readLine())!=null){
                String[] splitData=line.split(",");
                if(splitData[0].equals("name")){
                    continue;
                }
                Customer customer=new Customer();
                customer.setName(splitData[0]);
                customer.setBirthday(splitData[1]);
                customer.setGender(splitData[2]);
                customer.setIdCard(splitData[3]);
                customer.setPhoneNumber(Integer.parseInt(splitData[4]));
                customer.setEmail(splitData[5]);
                customer.setCustomerType(splitData[6]);
                customer.setAddress(splitData[7]);
                listCustomer.add(customer);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listCustomer;
    }
//    public static ArrayList<Customer> readCsvFileBooking() {
//        BufferedReader br=null;
//        ArrayList<Customer> listBooking=new ArrayList<Customer>();
//        try {
//            String line;
//            br=new BufferedReader(new FileReader(PATH_FILE_BOOKING));
//
//            while ((line=br.readLine())!=null){
//                String[] splitData=line.split(",");
//                if(splitData[0].equals("name")){
//                    continue;
//                }
//                Customer customer=new Customer();
//                customer.setName(splitData[0]);
//                customer.setBirthday(splitData[1]);
//                customer.setGender(splitData[2]);
//                customer.setIdCard(splitData[3]);
//                customer.setPhoneNumber(Integer.parseInt(splitData[4]));
//                customer.setEmail(splitData[5]);
//                customer.setCustomerType(splitData[6]);
//                customer.setAddress(splitData[7]);
//                customer.setUseService();
//                listCustomer.add(customer);
//
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        finally {
//            try {
//                br.close();
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }
//        return listCustomer;
//    }
//    public static List<Customer> readCsvFileBooking() {
//        String line = "";
//        List<Customer> customers = new ArrayList<>();
//        try (BufferedReader br = new BufferedReader(new FileReader(PATH_FILE_BOOKING))) {
//            line = br.readLine();
//            while ((line = br.readLine()) != null) {
//                String[] arrCustomer = line.split(String.valueOf(COMMA_DELIMITER));
//                Customer customer = new Customer(arrCustomer[0], arrCustomer[1], arrCustomer[2], arrCustomer[3], arrCustomer[4], arrCustomer[5], arrCustomer[6], arrCustomer[7],arrCustomer[8]);
//                customer.setVilla(arrCustomer[9], arrCustomer[10], Double.parseDouble(arrCustomer[11]), Double.parseDouble(arrCustomer[12]), Integer.parseInt(arrCustomer[13]), arrCustomer[14]);
//
//                customers.add(customer);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return customers;
//    }
//    public static void writeCsvFileBooking(List<Customer> listBooking) {
//        FileWriter fileWriter = null;
//
//        try {
//            fileWriter = new FileWriter(PATH_FILE_BOOKING);
//
//            fileWriter.append(Arrays.toString(FILE_HEADER_OF_BOOKING));
//
//
//            fileWriter.append(NEW_LINE_SEPARATOR);
//
//            for (Customer customerCSV : listBooking) {
//                fileWriter.append(customerCSV.getId());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(customerCSV.getNameCustomer());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(customerCSV.getIdCard());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(customerCSV.getBirthday());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(customerCSV.getGender());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(customerCSV.getPhoneNumber());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(customerCSV.getEmail());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(customerCSV.getTypeCustomer());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(customerCSV.getAddress());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(customerCSV.getService().getId());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(customerCSV.getService().getNameService());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(customerCSV.getService().getArea​​Use()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(customerCSV.getService().getRentalCosts()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(customerCSV.getService().getMaxNumberOfPeople()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(customerCSV.getService().getTypeRent());
//                fileWriter.append(NEW_LINE_SEPARATOR);
//            }
//            System.out.println("CSV file was created successfully !!!");
//
//        } catch (Exception e) {
//            System.out.println("Error in CsvFileWriter !!!");
//            e.printStackTrace();
//        } finally {
//
//            try {
//                fileWriter.flush();
//                fileWriter.close();
//            } catch (IOException e) {
//                System.out.println("Error while flushing/closing fileWriter !!!");
//                e.printStackTrace();
//            }
//
//        }
//    }
    public static ArrayList<Employee> readCsvFileEmployee() {
    BufferedReader br=null;
    ArrayList<Employee> listEmployee=new ArrayList<Employee>();
    try {
        String line;
        br=new BufferedReader(new FileReader(PATH_FILE_EMPLOYEE));

        while ((line=br.readLine())!=null){
            String[] splitData=line.split(",");
            if(splitData[0].equals("id")){
                continue;
            }
            Employee employees=new Employee();
            employees.setIdCard(Integer.parseInt(splitData[0]));
            employees.setNameEmployee(splitData[1]);
            employees.setBirthday(splitData[3]);
            employees.setAddress(splitData[3]);
            listEmployee.add(employees);

        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    finally {
        try {
            br.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    return listEmployee;
}

}
