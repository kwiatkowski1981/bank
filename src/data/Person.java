package data;

import data.Adress;

private class Person {
            String firstName;
            String lastName;
      final String pesel;
            Adress city;


    Person(String firstName, String lastName, final String pesel, Adress city){
            this.firstName = firstName;
            this.lastName = lastName;
            this.pesel = pesel;
            this.city = city;
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

    public Adress getCity() {
        return city;
    }

    public void setCity(Adress city) {
        this.city = city;
    }
}
