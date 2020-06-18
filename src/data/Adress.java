package data;

public class Adress {

    private   String Street;
    private   String HomeNumber;
    private   int ApartmentNumber;
    private   String City;
    private   int ZipCode;
    private   Person AdressOwner;



    public void printAdressInfo() {
        String info =   "Street:" + " " + getStreet() + ", " +
                        "Home Number:" + " " + getHomeNumber() + ", " +
                        "Apartment Number:" + " " + getApartmentNumber() + ", " +
                        "City:" + " " + getCity() + ", " +
                        "Zip Code:" + " " + getZipCode();
                System.out.println(info);
    }

    public Adress(String street, String homeNumber, int apartmentNumber, String city, int zipCode, Person adressOwner) {
        this.Street = street;
        HomeNumber = homeNumber;
        ApartmentNumber = apartmentNumber;
        City = city;
        ZipCode = zipCode;
        AdressOwner = adressOwner;
    }





    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getHomeNumber() {
        return HomeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        HomeNumber = homeNumber;
    }

    public int getApartmentNumber() {
        return ApartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        ApartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int zipCode) {
        ZipCode = zipCode;
    }

    public Person getAdressOwner() {
        return AdressOwner;
    }

    public void setAdressOwner(Person adressOwner) {
        AdressOwner = adressOwner;
    }
}

