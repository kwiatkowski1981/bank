package data;

public class BankAccount {

        private   Person owner;
        private  double balance;


//        public void BankAccount() {
//            info = ();
//        }


        public BankAccount(Person owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

        public Person getOwner() {
        return owner;
    }

        public void setOwner(Person owner) {
        this.owner = owner;
    }

        public double getBalance() {
        return balance;
    }

        public void setBalance(double balance) {
        this.balance = balance;
    }
}
