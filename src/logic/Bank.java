package logic;
import data.*;

public class Bank {


  public static void main(String[] args) {

        Person[] persons = new Person[1000];
        Adress[] adresses = new Adress[1000];

// jak przypisac do obiektu obiekt innej klasy zeby zgadzalo sie w tablicy,
// tablica pozycja-2 sciaga dane o klient-2 konto-2 adresy z tablicy pozycja-2, kredyt pozycja-2,
// w sposob, wypisz mi z tablicy pola pozycji [2] jak to powiązać.


        persons[0] = new Person("Jan", "Kowalski", "90897812362");
        adresses[0] = new Adress("Longstreet", "215a",
                2, "Basel", 9000, persons[0] );

         adresses[1] = new Adress ("Mainroad", "25",
                1, "Zurich", 8000, persons[0]);

        BankAccount account1 = new BankAccount (persons[0], 10_000);

        Credit credit1 = new Credit(persons[0], 2000.0, 0.0,0.05, 12);




        persons[0].printInfo();

        adresses[0].printAdressInfo();
        adresses[1].printAdressInfo();

      System.out.println(account1.getOwner().printInfo2());

    }
}
