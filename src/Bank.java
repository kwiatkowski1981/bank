class Bank {
    public static void main(String[] args) {


        Person person = new Person("Jan", "Kowalski", "90897812362",
                    "Dzierżoniów", "słowackiego", 19);

        Adress adress = new Adress("Longstreet", 216, 6, "Basel", 4000);

        BankAccount account1 = new BankAccount(person, 10_000);

        Credit credit1 = new Credit(person, 2000.0, 0.0,0.05, 12);


        System.out.println("Osoba:");
        System.out.println(person.firstName + " " + person.lastName + " " + person.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);
    }
}
