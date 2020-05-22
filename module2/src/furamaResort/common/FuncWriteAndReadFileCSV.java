package furamaResort.common;

import furamaResort.models.House;
import furamaResort.models.Villa;
import java.io.*;
import java.util.*;

public class FuncWriteAndReadFileCSV {
    private static final char COMMA_DELIMITER = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final int NUM_OF_LINE_SKIP = 1;
    private static final String PATH_FILE_VILLA = "src/furamaResort/data/Villa.csv";
    private static final String PATH_FILE_HOUSE = "src/furamaResort/data/House.csv";
    private static final String FILE_HEADER_OF_VILLA = "id,codeService,nameService,rentalArea,rentalCost, maxNumberOfPeople, typeRent, roomStandard, convenientDescription, areaPool, numberOfFloors";
    private static final String FILE_HEADER_OF_HOUSE = "id,codeService,nameService,rentalArea,rentalCost, maxNumberOfPeople, typeRent, roomStandard, convenientDescription, numberOfFloors";

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
//    public static void writeCsvFileHouse(List<House> houses) {
//        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter(PATH_FILE_HOUSE,true);
//            fileWriter.append(FILE_HEADER_OF_HOUSE);
//            fileWriter.append(NEW_LINE_SEPARATOR);
//            for (House houseCSV : houses) {
//                fileWriter.append(houseCSV.getId());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(houseCSV.getCodeService());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(houseCSV.getNameService());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(houseCSV.getRentalArea()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(houseCSV.getRentalCost()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(houseCSV.getMaximumNumberOfPeople()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(houseCSV.getTypeOfRent()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(houseCSV.getRoomStandard()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(houseCSV.getDescriptionConvenient());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(houseCSV.getFloorNumber()));
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
//        }
//    }

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
}
