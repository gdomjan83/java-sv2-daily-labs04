package day01;

import java.time.LocalDate;

public class Actor {
    private String name;
    private int yearOfBirth;

    public Actor(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
