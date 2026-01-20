package kr.spartaclub.running.day01.Step8;

import java.util.Objects;

public class SecureAccount {
    private int accountNumber;
    private String owner;
    private  int balace;
    private  String password;

    public SecureAccount(int accountNumber, String owner, int balace, String password) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balace = balace;
        this.password = password;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balace += amount;
            System.out.println("현재 잔액 : " + balace);
        } else {
            System.out.println("입금액은 0보다 커야합니다.");
        }
    }

    public void withdraw(int amout , String inputPassword){
        if (Objects.equals(password,inputPassword) && balace - amout > 0){
            balace-= amout;
            System.out.println("현재 잔액" + balace);
        } else {
        System.out.println("잔액이 충분하지않거나 비밀번호가 잘못입력되었습니다.");
    }
        }

    public int getBalace(String inputPassword) {
        if (Objects.equals(password,inputPassword)) {
            return balace;
        }return -1;
    }
;}
