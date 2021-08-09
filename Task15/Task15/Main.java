package com.Task15;

public class Main {
    public static void main(String[] args) {
        Auto Auto_one = new Auto();
        Auto_one.autovobil();
        Auto_one.setModel1("mazda");
        Auto_one.setPower1(100);
        Auto_one.setColor1("red");
        System.out.println("Измененные данные об автомобиле"+" марка-"+ Auto_one.getModel1() +", цвет-"+ Auto_one.getColor1()+ ", мощность-"+ Auto_one.getPower1());
    }
}
