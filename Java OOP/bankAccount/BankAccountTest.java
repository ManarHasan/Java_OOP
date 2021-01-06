public class BankAccountTest{
    public static void main(String[] args){
        BankAccount test = new BankAccount();
        System.out.println(test.getAccount());
        test.depositToChecking(400);
        System.out.println(test.getCheckingBalance());
    }
}