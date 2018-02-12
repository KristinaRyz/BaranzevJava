package ru.stqa.ptf.sandbox;

import com.sun.org.apache.xpath.internal.SourceTree;

public class MyFirstProgram{

public static void main (String[] args){
hello("user ");
    hello("kristina ");
    hello("Arina ");
    hello("cat");

    Square s = new Square(5);
        System.out.println("Square of a square with a side " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,3);
        System.out.println("Square of a rectangle with a sides " + r.a + "," + r.b + " = " + r.area());
}

public static void hello(String a){
    System.out.println("Hello " + a + "!");
}


    }