package logic;
import data.*;

public class Bank {


  public static void main(String[] args) {

        Person[] persons = new Person[1000];
        persons[0] = new Person("Jan", "Kowalski", "90897812362");

        LivingAdress livingAdress1 = new LivingAdress("Longstreet", "216a", 6,
                "Basel", 4000, persons[0]);

        RegistredAdress registredAdress1 = new RegistredAdress ("Mainroad", 25,
                1, "Zurich", 8000, persons[0]);

        BankAccount account1 = new BankAccount(persons[0], 10_000);

        Credit credit1 = new Credit(persons[0], 2000.0, 0.0,0.05, 12);


        persons[0].printInfo();
        registredAdress1.printRegistredAdressInfo();
        livingAdress1.printLivingAdressInfo();

    }
}
