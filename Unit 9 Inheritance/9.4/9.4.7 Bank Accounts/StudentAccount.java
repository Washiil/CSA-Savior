class StudentAccount extends Account {
    private final double BONUS_RATE = 0.1;
    private final double WITHDRAWAL_FEE = 1.5;

    public StudentAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount + (amount * BONUS_RATE));
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + WITHDRAWAL_FEE);
    }

    @Override
    public String toString() {
        return "Student account current balance $" + super.getBalance();
    }
}