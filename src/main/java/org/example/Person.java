package org.example;

public class Person {
    public int dailyPrice;
    public int prim;
    public int workedDay;

    public Person(int dailyPrice, int prim, int workedDay) {
        this.dailyPrice = dailyPrice;
        this.prim = prim;
        this.workedDay = workedDay;
    }

    public int calculate() {
        return (this.workedDay >= 25) ? this.workedDay * (this.dailyPrice+prim) : this.workedDay * this.dailyPrice;
    }
}