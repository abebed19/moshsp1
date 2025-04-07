package com.abbayllc.store;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("paypal")
public class PaypalPaymentService  implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal Payment");
        System.out.println("Amount: " + amount);
    }
}
