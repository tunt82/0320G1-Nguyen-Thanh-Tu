package furamaResort.exception;

public class GenderException extends Exception {
    public GenderException(String message) {
        super(message);
    }
    public static String genderException(String gender) throws GenderException {
        String regex = "^Male|Female|Unknow$";
        if (gender.matches(regex)) {
            return gender;
        } else {
            throw new GenderException("Gender is invalid! Please try again");
        }
    }
}
