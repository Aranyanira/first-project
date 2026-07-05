package ConstructorGetterSetterPractice;

/*
Создайте класс BankAccount с полями owner и balance.
Реализуйте конструктор, геттеры, сеттер для владельца, методы deposit(amount) и withdraw(amount) и метод printBalance().
В main внесите деньги, снимите и выведите баланс.
 */
public class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    String getOwner() {
        return this.owner;
    }
    double getBalance() {
        return this.balance;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    public double deposit(double amount){
        this.balance = this.balance + amount;
        return this.balance;
    }

    public double withdraw(double amount){
        this.balance = this.balance - amount;
        return this.balance;
    }

    public void printBalance(){
        System.out.println("Счет клиента " + this.owner + "равен: " + this.balance);
    }
}
