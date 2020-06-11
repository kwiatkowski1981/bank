class Person {
            String firstName;
            String lastName;
      final String pesel;
            Adress city;
            Adress street;
            Adress apartmentNumber;

    Person(String firstName, String lastName,final String pesel, Adress city, Adress street, Adress apartmentNumber){
            this.firstName = firstName;
            this.lastName = lastName;
            this.pesel = pesel;
            this.city = city;
            this.street = street;
            this.apartmentNumber = apartmentNumber;
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

    public Adress getStreet() {
        return street;
    }

    public void setStreet(Adress street) {
        this.street = street;
    }

    public Adress getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(Adress apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}
