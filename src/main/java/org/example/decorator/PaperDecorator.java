package org.example.decorator;

import org.example.flowers.Item;

public class PaperDecorator extends ItemDecorator{
    private final int decorPrice = 13;
    private Item item;
    @Override
    public double price() {
        return item.price() + decorPrice;
    }

    @Override
    public double getDescription() {
        return 0;
    }
}
