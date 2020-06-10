class Bank {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski", "90897812362");
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.pesel = "90897812362";

        Adress adress = new Adress("Longstreet", 216, 6, "Basel", 4000);


        BankAccount account1 = new BankAccount();
        account1.owner = person;
        account1.balance = 10_000;

        Credit credit1 = new Credit();
        credit1.borrower = person;
        credit1.cashBorrowed = 2000;
        credit1.interestRate = 0.05;
        credit1.termMonths = 12;

        System.out.println("Osoba:");
        System.out.println(person.firstName + " " + person.lastName + " " + person.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);
    }
}
