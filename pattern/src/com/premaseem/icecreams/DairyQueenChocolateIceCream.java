package com.premaseem.icecreams;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class DairyQueenChocolateIceCream {
    String brand = "Dairy Queen ";
    Integer cost = 3;
    Integer calories = 200;

    @Override
    public String toString () {
        return this.getClass().getName() + " with " + calories + " and cost: $" + cost;
    }
}
