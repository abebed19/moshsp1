package com.abbayllc.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
public class appConfig {
    @Value("${spring.payment-method}")
    private String payment;



    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }
    @Bean
    public PaypalPaymentService paypal(){
        return new PaypalPaymentService();
    }
    @Bean
    public  OrderService orderService(){
        if(payment.equals("stripe")){
            return new OrderService(stripe());
        }else {
            return new OrderService(paypal());
        }

    }

}
