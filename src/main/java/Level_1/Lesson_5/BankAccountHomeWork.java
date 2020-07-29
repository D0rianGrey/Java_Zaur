package Level_1.Lesson_5;

public class BankAccountHomeWork {
    int balance;

    void addMoney(int amount) {
        balance += amount;
    }

    void deleteMonet(int amount) {
        balance -= amount;
    }

}

class BankAccountHomeWorkTest {

    public static void main(String[] args) {
        BankAccountHomeWork bankAccount = new BankAccountHomeWork();
        System.out.println(bankAccount.balance);
        bankAccount.addMoney(50);
        System.out.println(bankAccount.balance);
        bankAccount.deleteMonet(20);
        System.out.println(bankAccount.balance);


    }
}

