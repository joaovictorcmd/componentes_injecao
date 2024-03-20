package com.desafio.componentes.services;

import com.desafio.componentes.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double discount = order.getBasic() * (order.getDiscount() / 100);
        return order.getBasic() + shippingService.shipment(order) - discount;
    }
}
