package ru.mirea.practices.practice9;


import java.math.BigInteger;

public class InnNotValidException extends Exception {
    private BigInteger innNum;

    public InnNotValidException(BigInteger inn) {
        super("ИНН с номером " + inn + " не действителен!");
        this.innNum = inn;
    }

    public BigInteger getInnNum() {
        return this.innNum;
    }
}


