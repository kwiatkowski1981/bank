package data;



public class Person {
          private       String              firstName;
          private       String              lastName;
          private final String              pesel;
          private       LivingAdress        livingAdress;
          private       RegistredAdress     registredAdress;




    public void printInfo() {
        String info = "Firstname:" + " " + getFirstName() + ", " + "Lastname:" + " " + getLastName() + ", "
                + "Pesel:" + " " + getPesel();

        if (getRegistredAdress() != null) {
            info = info + " " + "Registred Adress:" + " " + getRegistredAdress();
        }
//        if ( getLivingAdress() != getRegistredAdress()) {
//            info = info + "Living Adress:" + " " +  getLivingAdress();
//        }
        System.out.println(info);
    }



    public Person(String firstName, String lastName, String pesel, LivingAdress livingAdress,
                  RegistredAdress registredAdress) {
        this(firstName, lastName, pesel, livingAdress);
        this.registredAdress = registredAdress;
    }

    public Person(String firstName, String lastName, String pesel, LivingAdress livingAdress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.livingAdress = livingAdress;
    }

    public Person(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

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

    public LivingAdress getLivingAdress() {
        return livingAdress;
    }

    public void setLivingAdress(LivingAdress livingAdress) {
        this.livingAdress = livingAdress;
    }

    public RegistredAdress getRegistredAdress() {
        return registredAdress;
    }

    public void setRegistredAdress(RegistredAdress registredAdress) {
        this.registredAdress = registredAdress;
    }
}
