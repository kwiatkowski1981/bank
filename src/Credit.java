class Credit {
    Person borrower;
    double cashBorrowed;
    double cashReturned;
    double interestRate;
    int termMonths;

    Credit(Person borrower, double cashBorrowed, double cashReturned, double interestRate, int termMonths){
        this.borrower = borrower;
        this.cashBorrowed = cashBorrowed;
        this.cashReturned = cashReturned;
        this.interestRate = interestRate;
        this.termMonths = termMonths;
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }

    public double getCashBorrowed() {
        return cashBorrowed;
    }

    public void setCashBorrowed(double cashBorrowed) {
        this.cashBorrowed = cashBorrowed;
    }

    public double getCashReturned() {
        return cashReturned;
    }

    public void setCashReturned(double cashReturned) {
        this.cashReturned = cashReturned;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTermMonths() {
        return termMonths;
    }

    public void setTermMonths(int termMonths) {
        this.termMonths = termMonths;
    }
}
