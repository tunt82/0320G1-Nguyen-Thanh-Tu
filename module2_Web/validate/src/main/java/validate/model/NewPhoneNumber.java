package validate.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class NewPhoneNumber {
    @NotNull
    @Size(min=5,max=8)
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public NewPhoneNumber() {
    }
}
