package logic;

import data.Adress;
import data.BankAccount;
import data.Credit;
import data.Person;

class Bank {
    public static void main(String[] args) {


        Person person1 = new Person("Jan", "Kowalski", "90897812362", "city");

        Adress adress1 = new Adress("Longstreet", 216, 6, "Basel", 4000);

        BankAccount account1 = new BankAccount(person1, 10_000);

        Credit credit1 = new Credit(person1, 2000.0, 0.0,0.05, 12);


        System.out.println("Osoba:");

        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);
    }
}
