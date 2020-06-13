package data;

public class LivingAdress {
 private   String currentStreet;
 private   int currentHomeNumber;
 private   int currentApartmentNumber;
 private   String currentCity;
 private   int currentZipCode;
 private   Person CurrentAdressOwner;

     private LivingAdress(String currentStreet, int currentHomeNumber, int currentApartmentNumber,
                         String currentCity, int currentZipCode, Person currentAdressOwner) {
         this.currentStreet = currentStreet;
         this.currentHomeNumber = currentHomeNumber;
         this.currentApartmentNumber = currentApartmentNumber;
         this.currentCity = currentCity;
         this.currentZipCode = currentZipCode;
         this.CurrentAdressOwner = currentAdressOwner;
     }

    public String getCurrentStreet() {
        return currentStreet;
    }

    public void setCurrentStreet(String currentStreet) {
        this.currentStreet = currentStreet;
    }

    public int getCurrentHomeNumber() {
        return currentHomeNumber;
    }

    public void setCurrentHomeNumber(int currentHomeNumber) {
        this.currentHomeNumber = currentHomeNumber;
    }

    public int getCurrentApartmentNumber() {
        return currentApartmentNumber;
    }

    public void setCurrentApartmentNumber(int currentApartmentNumber) {
        this.currentApartmentNumber = currentApartmentNumber;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public int getCurrentZipCode() {
        return currentZipCode;
    }

    public void setCurrentZipCode(int currentZipCode) {
        this.currentZipCode = currentZipCode;
    }

    public Person getCurrentAdressOwner() {
        return CurrentAdressOwner;
    }

    public void setCurrentAdressOwner(Person currentAdressOwner) {
        CurrentAdressOwner = currentAdressOwner;
    }
}
