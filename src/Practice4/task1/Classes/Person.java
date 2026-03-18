package Practice4.task1.Classes;

import Practice4.task1.Interfaces.Movable;

public class Person implements Movable {
    protected String name;
    protected int age;
    protected String walletId;

    public Person(String name, int age, String walletId) {
        this.name = name;
        this.age = age;
        this.walletId = walletId;
    }

    @Override public void move() {
        System.out.println(name + " walks.");
    }

    public String getWalletId() {
        return walletId;
    }
    public String getName()     {
        return name;
    }
}