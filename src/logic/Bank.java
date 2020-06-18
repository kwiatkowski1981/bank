package logic;
import data.*;

public class Bank {


  public static void main(String[] args) {

        Person[] persons = new Person[1000];
        LivingAdress[] livingAdresses = new LivingAdress[1000];
        RegistredAdress[] registredAdresses = new RegistredAdress[1000];

        persons[0] = new Person("Jan", "Kowalski", "90897812362");
        livingAdresses[0] = new LivingAdress("Longstreet", "215a",
                2, "Basel", 9000, persons[0] );

         registredAdresses[0] = new RegistredAdress ("Mainroad", 25,
                1, "Zurich", 8000, persons[0]);

        BankAccount account1 = new BankAccount (persons[0], 10_000);

        Credit credit1 = new Credit(persons[0], 2000.0, 0.0,0.05, 12);




        persons[0].printInfo();

        registredAdresses[0].printRegistredAdressInfo();
        livingAdresses[0].printLivingAdressInfo();

    }
}
