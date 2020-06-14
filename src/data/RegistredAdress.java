package data;

public class RegistredAdress {

    private   String registredStreet;
    private   int registredHomeNumber;
    private   int registredApartmentNumber;
    private   String registredCity;
    private   int registredZipCode;
    private   Person registredAdressOwner;



    public void printRegistredAdressInfo() {
        String info =   "Street:" + " " + getRegistredStreet() + ", " +
                        "Home Number:" + " " + getRegistredHomeNumber() + ", " +
                        "Apartment Number:" + " " + getRegistredApartmentNumber() + ", " +
                        "City:" + " " + getRegistredCity() + ", " +
                        "Zip Code:" + " " + getRegistredZipCode();
                System.out.println(info);
    }


    public RegistredAdress(String registredStreet, int registredHomeNumber, int registredApartmentNumber,
                           String registredCity, int registredZipCode, Person registredAdressOwner) {
        this.registredStreet = registredStreet;
        this.registredHomeNumber = registredHomeNumber;
        this.registredApartmentNumber = registredApartmentNumber;
        this.registredCity = registredCity;
        this.registredZipCode = registredZipCode;
        this.registredAdressOwner = registredAdressOwner;
    }

    public String getRegistredStreet() {
        return registredStreet;
    }

    public void setRegistredStreet(String registredStreet) {
        this.registredStreet = registredStreet;
    }

    public int getRegistredHomeNumber() {
        return registredHomeNumber;
    }

    public void setRegistredHomeNumber(int registredHomeNumber) {
        this.registredHomeNumber = registredHomeNumber;
    }

    public int getRegistredApartmentNumber() {
        return registredApartmentNumber;
    }

    public void setRegistredApartmentNumber(int registredApartmentNumber) {
        this.registredApartmentNumber = registredApartmentNumber;
    }

    public String getRegistredCity() {
        return registredCity;
    }

    public void setRegistredCity(String registredCity) {
        this.registredCity = registredCity;
    }

    public int getRegistredZipCode() {
        return registredZipCode;
    }

    public void setRegistredZipCode(int registredZipCode) {
        this.registredZipCode = registredZipCode;
    }

    public Person getRegistredAdressOwner() {
        return registredAdressOwner;
    }

    public void setRegistredAdressOwner(Person registredAdressOwner) {
        this.registredAdressOwner = registredAdressOwner;
    }

}

