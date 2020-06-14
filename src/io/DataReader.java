package io;
import data.*;
import java.util.Scanner;

public class DataReader {

    private Scanner sc = new Scanner(System.in);

    public  BankAccount readAndCreateBankAccount() {
             System.out.println("Account Owner");
             String owner = sc.nextLine();
             System.out.println("Balance");
             double balance = sc.nextDouble();
             sc.nextLine();
             return new BankAccount(owner, balance);
            }

    public  Person readAndCreatePerson() {
             System.out.println("Firstname:");
             String firstName = sc.nextLine();
             System.out.println("Lastname:");
             String lastName = sc.nextLine();
             System.out.println("Pesel:");
             String pesel = sc.nextLine();
             sc.nextLine();

             return new Person(firstName, lastName, pesel);
            }

    public  Person readAndCreateLivingAdress() {
             System.out.println("Street:");
             String currentStreet = sc.nextLine();
             System.out.println("Home Number:");
             String currentHomeNumber = sc.nextLine();
             System.out.println("Apartment Number:");
             int currentApartmentNumber = sc.nextInt();
             System.out.println("City");
             String currentCity = sc.nextLine();
             System.out.println("Zip Code:");
             int currentZipCode = sc.nextInt();
             System.out.println("Adress Owner");
             String currentAdressOwner = sc.nextLine();
             sc.nextLine();

             return new LivingAdress(currentStreet, currentHomeNumber, currentApartmentNumber,
                        currentCity, currentZipCode, currentAdressOwner);
            }

    }
