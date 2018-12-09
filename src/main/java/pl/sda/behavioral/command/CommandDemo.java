package pl.sda.behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CommandDemo {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        System.out.println("Initial balance: " + bankAccount.getBalance());


        Random random = new Random();
        List<BankCommand> bankCommands = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            DepositMoneyCommand depositMoneyCommand =
                    new DepositMoneyCommand(bankAccount, random.nextInt(100));
            bankCommands.add(depositMoneyCommand);

            WithdrawMoneyCommand withdrawMoneyCommand =
                    new WithdrawMoneyCommand(bankAccount, random.nextInt(100));
            bankCommands.add(withdrawMoneyCommand);
        }

        for (BankCommand bankCommand : bankCommands) {
            bankCommand.execute();
            System.out.println(bankAccount.getBalance());
        }
        System.out.println("Undoing all the staff!");
        for (BankCommand bankCommand : bankCommands) {
            bankCommand.undo();
            System.out.println("Final balance: " + bankAccount.getBalance());
        }
    }

}
