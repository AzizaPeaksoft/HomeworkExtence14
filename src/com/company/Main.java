package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Aziza", "Javadeveloper", "Peaksoft");
        Dancer dancer = new Dancer("Jan", "solist", "Jandanc");
        Singer singer = new Singer("J.LO", "singersolist", "Fabrica");
        System.out.println(programmer);
        programmer.Learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println(dancer);
        dancer.Learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println(singer);
        singer.Learn();
        singer.walk();
        singer.eat();
        singer.signingPlayGitar();
    }
}

