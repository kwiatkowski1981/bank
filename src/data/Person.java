package data;

import data.LivingAdress;

public class Person {
          private       String       firstName;
          private       String       lastName;
          private final String       pesel;
          private       LivingAdress placeOfLiving;

    private Person(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public LivingAdress getPlaceOfLiving() {
        return placeOfLiving;
    }

    public void setPlaceOfLiving(LivingAdress placeOfLiving) {
        this.placeOfLiving = placeOfLiving;
    }
}
