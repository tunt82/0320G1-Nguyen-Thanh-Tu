package furamaResort.controllers;

import furamaResort.models.Room;
import furamaResort.models.Villa;
import furamaResort.models.House;
import furamaResort.common.FuncWriteAndReadFileCSV;
import furamaResort.validation.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static void displayMainMenu() {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Add New Services");
            System.out.println("2. Show Services");
            System.out.println("3. Add New Customer");
            System.out.println("4. Show Information of Customer");
            System.out.println("5. Add New Booking");
            System.out.println("6. Show Information of Employee");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    menuAddNewService();
                    break;
                case 2:
                    menuShowService();
                    break;
//                case 3:
//                    AddNewCustomer;
//                    break;
//                case 4:
//                    ShowInformationCustomer;
//                    break;
//                case 5:
//                    AddNewBooking;
//                    break;
//                case 6:
//                    ShowInformationEmployee;
//                    break;
                case 7:
                    System.exit(7);
                    break;
                default:
                    System.out.println("No choice!");

            }
        }
    }
    public static void menuAddNewService() {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    addListVillaService();
                    break;
                case 2:
                    addListHouseService();
                    break;
                case 3:
                    addListRoomService();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(7);
                    break;
                default:
                    System.out.println("No choice!");

            }
        }
    }
    public static void addListVillaService() {
        Scanner scanner = new Scanner(System.in);
        List<Villa> villas = new ArrayList<>();
        Villa villa = new Villa();
        System.out.println("Enter number list villa you want: ");
        int length = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < length; i++) {
            System.out.println("Enter information for villa " + (i + 1));
            System.out.print("Enter id: ");
            villa.setId(scanner.nextLine());
            System.out.print("Enter codeService: ");
            String checkCodeVilla=scanner.nextLine();
            while (!Validation.checkCodeVilla(checkCodeVilla)){
                System.out.println("Code service was wrong! Please try again. Example:SVVL-1234");
                checkCodeVilla=scanner.nextLine();
            }
            villa.setCodeService(checkCodeVilla);
            System.out.print("Enter name of service: ");
            String checkNameService=scanner.nextLine();
            while (!Validation.checkNameService(checkNameService)){
                System.out.println("Name service was wrong! Please try again. Example: A~");
                checkNameService=scanner.nextLine();
            }
            villa.setNameService(checkNameService);
            System.out.print("Enter rental of area: ");
            villa.setRentalArea(Integer.parseInt(scanner.nextLine()));
            System.out.print("Enter rental of cost: ");
            String checkRentalCost=scanner.nextLine();
            while (!Validation.checkRentalCost(checkRentalCost)){
                System.out.println("Rental of cost was wrong! Please try again. (Value >0");
                checkRentalCost=scanner.nextLine();
            }
            villa.setRentalCost(Integer.parseInt(checkRentalCost));
            System.out.print("Enter maximum number of people: ");
            String checkMaxPeople=scanner.nextLine();
            while (!Validation.checkMaxPeople(checkMaxPeople)){
                System.out.println("Rental of cost was wrong! Please try again. (Value >0");
                checkMaxPeople=scanner.nextLine();
            }
            villa.setMaximumNumberOfPeople(Integer.parseInt(checkMaxPeople));
            System.out.print("Enter type for rent: ");
            String checkTypeRent=scanner.nextLine();
            while (!Validation.checkNameService(checkTypeRent)){
                System.out.println("Type for rental was wrong! Please try again. Example: A~");
                checkTypeRent=scanner.nextLine();
            }
            villa.setTypeOfRent(checkTypeRent);
            System.out.print("Enter room of standard: ");
            villa.setRoomStandard(scanner.nextLine());
            System.out.print("Enter description convenient: ");
            villa.setDescriptionConvenient(scanner.nextLine());
            System.out.print("Enter pool of area: ");
            int checkPoolArea=Integer.parseInt(scanner.nextLine());
            while (!Validation.checkPoolArea(checkPoolArea)){
                System.out.println("Pool area was wrong! Please try again. (Value >=30");
                checkPoolArea=Integer.parseInt(scanner.nextLine());
            }
            villa.setPoolArea(checkPoolArea);
            System.out.print("Enter number of floor: ");
            String checkFloorNumber=scanner.nextLine();
            while (!Validation.checkFloorNumber(checkFloorNumber)){
                System.out.println("Number of floor was wrong! Please try again. (Value >0");
                checkFloorNumber=scanner.nextLine();
            }
            villa.setFloorNumber(Integer.parseInt(checkFloorNumber));
            villas.add(villa);
        }
        FuncWriteAndReadFileCSV.writeCsvFileVilla(villas);
        System.out.println("Add new list villas complete ");
        menuAddNewService();
    }
    public static void addListHouseService() {
        Scanner scanner = new Scanner(System.in);
        List<House> houses = new ArrayList<>();
        House house = new House();
        System.out.println("Enter number list house you want: ");
        int length = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < length; i++) {
            System.out.println("Enter information for house " + (i + 1));
            System.out.print("Enter id: ");
            house.setId(scanner.nextLine());
            System.out.print("Enter codeService: ");
            String checkCodeHouse=scanner.nextLine();
            while (!Validation.checkCodeHouse(checkCodeHouse)){
                System.out.println("Code service was wrong! Please try again. Example:SVHO-1234");
                checkCodeHouse=scanner.nextLine();
            }
            house.setCodeService(checkCodeHouse);
            System.out.print("Enter name of service: ");
            String checkNameService=scanner.nextLine();
            while (!Validation.checkNameService(checkNameService)){
                System.out.println("Name service was wrong! Please try again. Example: A~");
                checkNameService=scanner.nextLine();
            }
            house.setNameService(checkNameService);
            System.out.print("Enter rental of area: ");
            house.setRentalArea(Integer.parseInt(scanner.nextLine()));
            System.out.print("Enter rental of cost: ");
            String checkRentalCost=scanner.nextLine();
            while (!Validation.checkRentalCost(checkRentalCost)){
                System.out.println("Rental of cost was wrong! Please try again. (Value >0");
                checkRentalCost=scanner.nextLine();
            }
            house.setRentalCost(Integer.parseInt(checkRentalCost));
            System.out.print("Enter maximum number of people: ");
            String checkMaxPeople=scanner.nextLine();
            while (!Validation.checkMaxPeople(checkMaxPeople)){
                System.out.println("Rental of cost was wrong! Please try again. (Value >0");
                checkMaxPeople=scanner.nextLine();
            }
            house.setMaximumNumberOfPeople(Integer.parseInt(checkMaxPeople));
            System.out.print("Enter type for rent: ");
            String checkTypeRent=scanner.nextLine();
            while (!Validation.checkNameService(checkTypeRent)){
                System.out.println("Type for rental was wrong! Please try again. Example: A~");
                checkTypeRent=scanner.nextLine();
            }
            house.setTypeOfRent(checkTypeRent);
            System.out.print("Enter room of standard: ");
            house.setRoomStandard(scanner.nextLine());
            System.out.print("Enter description convenient: ");
            house.setDescriptionConvenient(scanner.nextLine());
            System.out.print("Enter number of floor: ");
            String checkFloorNumber=scanner.nextLine();
            while (!Validation.checkFloorNumber(checkFloorNumber)){
                System.out.println("Number of floor was wrong! Please try again. (Value >0");
                checkFloorNumber=scanner.nextLine();
            }
            house.setFloorNumber(Integer.parseInt(checkFloorNumber));
            houses.add(house);
        }
        FuncWriteAndReadFileCSV.writeCsvFileHouse(houses);
        System.out.println("Add new list villas complete ");
        menuAddNewService();
    }
    public static void addListRoomService() {
        Scanner scanner = new Scanner(System.in);
        List<Room> rooms = new ArrayList<>();
        Room room = new Room();
        System.out.println("Enter number list room which you want input: ");
        int length = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < length; i++) {
            System.out.println("Enter information for room " + (i + 1));
            System.out.print("Enter id: ");
            room.setId(scanner.nextLine());
            System.out.print("Enter codeService: ");
            String checkCodeRoom=scanner.nextLine();
            while (!Validation.checkCodeRoom(checkCodeRoom)){
                System.out.println("Code service was wrong! Please try again. Example:SVRO-1234");
                checkCodeRoom=scanner.nextLine();
            }
            room.setCodeService(checkCodeRoom);
            System.out.print("Enter name of service: ");
            String checkNameService=scanner.nextLine();
            while (!Validation.checkNameService(checkNameService)){
                System.out.println("Name service was wrong! Please try again. Example: A~");
                checkNameService=scanner.nextLine();
            }
            room.setNameService(checkNameService);
            System.out.print("Enter rental of area: ");
            room.setRentalArea(Integer.parseInt(scanner.nextLine()));
            System.out.print("Enter rental of cost: ");
            String checkRentalCost=scanner.nextLine();
            while (!Validation.checkRentalCost(checkRentalCost)){
                System.out.println("Rental of cost was wrong! Please try again. (Value >0");
                checkRentalCost=scanner.nextLine();
            }
            room.setRentalCost(Integer.parseInt(checkRentalCost));
            System.out.print("Enter maximum number of people: ");
            String checkMaxPeople=scanner.nextLine();
            while (!Validation.checkMaxPeople(checkMaxPeople)){
                System.out.println("Maximum number of people was wrong! Please try again. (Value >0");
                checkMaxPeople=scanner.nextLine();
            }
            room.setMaximumNumberOfPeople(Integer.parseInt(checkMaxPeople));
            System.out.print("Enter type for rent: ");
            String checkTypeRent=scanner.nextLine();
            while (!Validation.checkNameService(checkTypeRent)){
                System.out.println("Type for rental was wrong! Please try again. Example: A~");
                checkTypeRent=scanner.nextLine();
            }
            room.setTypeOfRent(checkTypeRent);
            System.out.print("Enter room of standard: ");
            room.setRoomStandard(scanner.nextLine());
            System.out.print("Enter description convenient: ");
            room.setDescriptionConvenient(scanner.nextLine());
            System.out.print("Enter number of floor: ");
            String checkFloorNumber=scanner.nextLine();
            while (!Validation.checkFloorNumber(checkFloorNumber)){
                System.out.println("Number of floor was wrong! Please try again. (Value >0");
                checkFloorNumber=scanner.nextLine();
            }
            room.setFloorNumber(Integer.parseInt(checkFloorNumber));
            houses.add(house);
        }
        FuncWriteAndReadFileCSV.writeCsvFileHouse(houses);
        System.out.println("Add new list villas complete ");
        menuAddNewService();
    }
    public static void menuShowService() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("1. Show All Villa\n" +
                "2. Show All House\n" +
                "3. Show All Room\n" +
                "4. Show All Name Villa Not Duplicate\n" +
                "5. Show All Name House Not Duplicate\n" +
                "6. Show All Name Room Not Duplicate\n" +
                "7. Back to menu\n" +
                "8. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                showVillaService();
                break;
            }
            case 2: {
                showHouseService();
                break;
            }
////            case 3: {
////                showRoomService();
////                break;
////            }
////            case 4: {
////                showAllNameVillaNotDuplicate();
////                break;
////            }
////            case 5: {
////                showAllNameHouseNotDuplicate();
////                break;
////            }
////            case 6: {
////                showAllNameRoomNotDuplicate();
////                break;
////            }
//
//            case 7: {
//                displayMainMenu();
//                break;
//            }
                default: {
                    System.exit(0);
                }
        }
    }
    public static void showVillaService(){
        ArrayList<Villa>villas=FuncWriteAndReadFileCSV.readCsvFileVilla();
        for (Villa villa : villas) {
            System.out.println("--------------------------------------------------");
            System.out.println(villa.ShowInfor());
            System.out.println("--------------------------------------------------");
        }
        displayMainMenu();

    }
    public static void showHouseService(){
        ArrayList<House>houses=FuncWriteAndReadFileCSV.readCsvFileHouse();
        for (House house : houses) {
            System.out.println("--------------------------------------------------");
            System.out.println(house.ShowInfor());
            System.out.println("--------------------------------------------------");
        }
        displayMainMenu();

    }
    public static void showRoomService(){
        ArrayList<House>houses=FuncWriteAndReadFileCSV.readCsvFileHouse();
        for (House house : houses) {
            System.out.println("--------------------------------------------------");
            System.out.println(house.ShowInfor());
            System.out.println("--------------------------------------------------");
        }
        displayMainMenu();

    }
    public static void main (String[]args){
        displayMainMenu();
    }

}

