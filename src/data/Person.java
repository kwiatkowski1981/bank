package data;



public class Person {
          private       String           firstName;
          private       String            lastName;
          private final String               pesel;
          private       Adress     registredAdress;
          private       Adress        livingAdress;



    public void printInfo() {
        String info = "Firstname:" + " " + getFirstName() + ", " + "Lastname:" + " " + getLastName() + ", "
                + "Pesel:" + " " + getPesel();

        if (getRegistredAdress() != null) {
            info = info + " " + "Registred Adress:" + " " + getRegistredAdress();
        }
        if ( getLivingAdress() != getRegistredAdress()) {
            info = info + "Living Adress:" + " " +  getLivingAdress();
        }
        System.out.println(info);
    }



    public String printInfo2() { return
            ("Firstname:" + " " + getFirstName() + "\n " + "Lastname:" + " " + getLastName() + "\n "
                    + "Pesel:" + " " + getPesel());
    }


         // constructor 1

    public Person(String firstName, String lastName, String pesel, Adress registredAdress, Adress livingAdress) {
        this(firstName, lastName, pesel, registredAdress);
        this.livingAdress = livingAdress;

    }

         // constructor 2

    public Person(String firstName, String lastName, String pesel, Adress registredAdress) {
        this(firstName, lastName, pesel);
        this.registredAdress = registredAdress;
    }

        // constructor 3

    public Person(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }


        // getter and setter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public Adress getRegistredAdress() {
        return registredAdress;
    }

    public void setRegistredAdress(Adress registredAdress) {
        this.registredAdress = registredAdress;
    }

    public Adress getLivingAdress() {
        return livingAdress;
    }

    public void setLivingAdress(Adress livingAdress) {
        this.livingAdress = livingAdress;
    }
}
