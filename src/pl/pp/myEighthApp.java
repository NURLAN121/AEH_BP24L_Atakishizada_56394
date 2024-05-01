package pl.pp;

public class myEighthApp {
    private String accNumber;
    private double balance;
    private String ownerName;
    private String email;
    private String phone;

    public myEighthApp(String accNumber, String ownerName, String email, String phone) {
        this.accNumber = accNumber;
        this.balance = 0.0;
        this.ownerName = ownerName;
        this.email = email;
        this.phone = phone;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void credit(double amount) {
        balance += amount;
        System.out.printf("Deposit of %.2f was made. New balance: %.2f%n", amount, balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.printf("Withdrew %.2f from the account. Remaining balance = %.2f%n", amount, balance);
        } else {
            System.out.printf("Insufficient funds. You have %.2f in your account.%n", balance);
        }
    }

    // Example usage
    public static void main(String[] args) {
        myEighthApp acc = new myEighthApp("123456", "John Doe", "john.doe@example.com", "+1234567890");
        acc.credit(250.0);
        acc.withdraw(50.0);
        acc.withdraw(900.0);
    }
}

