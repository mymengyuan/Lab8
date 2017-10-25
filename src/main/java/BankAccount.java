import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    /**
     * The constructor.
     * @param name the default owner name
     * @param accountCategory
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    public int getAcountNumber() {
        return accountNumber;
    }

//    public int setAcountNumber(int newAccountNumber) {
//        accountNumber = newAccountNumber;
//    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public double addAmount(double amount) {
        this.accountBalance = accountBalance + amount;
        return this.accountBalance;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public double getInterstEarned() {
        return interestEarned;
    }
}