package com.abbayllc.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
public class StripePaymentService implements PaymentService {
    @Value("${spring.application.name}")
    private String apiUrl;
    @Value("${stripe.enabled}")
    private boolean enabled ;
    @Value("${stripe.amount}")
    private double amount;
    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;
    @Override
    public void processPayment(double amount){
        System.out.println("Stripe");
        System.out.println("Api Url: " + apiUrl);
        System.out.println("Enabled: " + enabled);
        System.out.println("Amount: " + amount);
        System.out.println("SupportedCurrencies: " + supportedCurrencies);

        System.out.println("Amount :" + amount);
    }
}
