package com.desafio.componentes.program;

import com.desafio.componentes.entities.Order;
import com.desafio.componentes.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.desafio.componentes"})
public class ComponentesApplication implements CommandLineRunner {
    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {

        SpringApplication.run(ComponentesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(2282, 800.00, 10.0);
        System.out.printf("Pedido código: %d\nValor total: R$ %.2f", order.getCode(), orderService.total(order));
    }
}
