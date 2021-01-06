import java.util.Random;
public class BankAccount{
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalMoney = 0;
    public BankAccount(){
        setAccount(randomAccount());
        setNumberOfAccounts();
    }
    public String getAccount(){
        return accountNumber;
    }
    public void setAccount(String account){
        this.accountNumber = account;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public void setCheckingBalance(double balance){
        this.checkingBalance += balance;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }
    public void setSavingsBalance(double savings){
        this.savingsBalance += savings;
    }
    private void setNumberOfAccounts(){
        BankAccount.numberOfAccounts += 1;
    }
    public int getNumberOfAccounts(int numberOfAccounts){
        return BankAccount.numberOfAccounts;
    }
    private void setTotalMoney(double amount){
        BankAccount.totalMoney += amount;
    }
    public double getTotalMoney(){
        return BankAccount.totalMoney;
    }
    private String randomAccount(){
        String num = "";
        int n = 0;
        Random rand = new Random();
        for(int i=0; i<10; i++){
            n = rand.nextInt(10);
            num += Integer.toString(n);
        }
        setAccount(num);
        return num;
    }
    public void depositToChecking(double amount){
        setCheckingBalance(amount);
        setTotalMoney(amount);
    }
    public void depositToSavings(double amount){
        setSavingsBalance(amount);
        setTotalMoney(amount);
    }
    public void withdrawFromChecking(double amount){
        if(this.checkingBalance > amount){
            setCheckingBalance(getCheckingBalance()-amount);
            setTotalMoney(getTotalMoney()-amount);
        }
        System.out.println("Amount too big");
    }
    public void withdrawFromSavings(double amount){
        if(this.savingsBalance > amount){
            setSavingsBalance(getSavingsBalance()-amount);
            setTotalMoney(getTotalMoney()-amount);
        }
        System.out.println("Amount too big");
    }
}