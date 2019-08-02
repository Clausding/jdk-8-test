package newFeatures.Lambda;

import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Sex getGender() {
        return gender;
    }

    public int getAge() {
        return 28;
    }

    public void printPerson() {
        // ...
    }
}