package org.example.delivery;

import java.util.List;

public class DHLDeliveryStrategy extends Delivery {

    @Override
    public String deliver(List<String> items) {
        return items.toString();
    }
}
