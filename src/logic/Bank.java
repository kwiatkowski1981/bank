package logic;

import data.*;

public class Bank {
    public static void main(String[] args) {


        Person person1 = new Person("Jan", "Kowalski", "90897812362");

        LivingAdress livingAdress1 = new LivingAdress("Longstreet", 216, 6,
                "Basel", 4000, person1);

        RegistredAdress registredAdress1 = new RegistredAdress ("Mainroad", 25,
                1, "Zurich", 8000, person1);

        BankAccount account1 = new BankAccount(person1, 10_000);


        Credit credit1 = new Credit(person1, 2000.0, 0.0,0.05, 12);


        person1.printInfo();
        System.out.println("Osoba:");
        System.out.println(person1.getFirstName() + " " + person1.getLastName() + " " + person1.getPesel());
        System.out.println(livingAdress1.getCurrentStreet() + " " + livingAdress1.getCurrentHomeNumber() + " " +
                livingAdress1.getCurrentCity());

        System.out.println("posiada konto bankowe z kwotą: " + account1.getBalance());
        System.out.println("oraz kredyt na kwotę: " + credit1.getCashBorrowed());
    }
}
