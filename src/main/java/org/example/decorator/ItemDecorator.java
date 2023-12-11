package org.example.decorator;

import org.example.flowers.Item;

public abstract class ItemDecorator extends Item {
    private int decoratorPrice;
    private String description;
    public abstract double price();
    public abstract double getDescription();
}
