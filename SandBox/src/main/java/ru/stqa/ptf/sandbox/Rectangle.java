package ru.stqa.ptf.sandbox;

/**
 * Created by ryzhi on 2/5/2018.
 */
public class Rectangle {
public double a;
public double b;

public Rectangle(double a, double b){
    this.a = a;
    this.b = b;
}

    public double area(){
        return this.a * this.b;
    }
}
