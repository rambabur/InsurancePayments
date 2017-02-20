package com.etizen.insurance.payments;

import com.etizen.insurance.payments.domain.Payment;
import com.etizen.insurance.payments.services.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"spring-payments-config.xml"});
        PaymentService paymentService = (PaymentService)context.getBean("paymentService");

        paymentService.getLastPayment();
        paymentService.getPaymentHistroy();
        paymentService.createPayment(new Payment());
        paymentService.cancelPayment(100);

    }
}
