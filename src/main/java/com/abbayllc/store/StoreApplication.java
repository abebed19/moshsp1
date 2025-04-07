package com.abbayllc.store;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;

import javax.imageio.event.IIOReadProgressListener;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        var orderService = context.getBean(OrderService.class);

         //orderService.setPaymentService(new PaypalPaymentService());
        orderService.placeOrder();
    }

}
