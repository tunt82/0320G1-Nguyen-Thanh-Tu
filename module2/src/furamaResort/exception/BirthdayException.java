package furamaResort.exception;

public class BirthdayException extends Exception {
    public BirthdayException(String message) {
        super(message);
    }
    public static String birthdayException(String birthday) throws BirthdayException{
        String regex = "^[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}$";
        if (birthday.matches(regex)) {
            return birthday;
        } else {
            throw new BirthdayException("Birthday is invalid! Please try again");
        }
    }
}
