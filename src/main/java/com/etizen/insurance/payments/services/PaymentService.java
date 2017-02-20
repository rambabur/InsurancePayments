package com.etizen.insurance.payments.services;

import com.etizen.insurance.payments.domain.Payment;
import com.etizen.insurance.payments.repositories.PaymentsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ramab on 2/19/2017.
 */
@Component
public class PaymentService {

    @Autowired
    private  PaymentsDao paymentDao;

    public List<Payment> getPaymentHistroy() {
        List<Payment> list = paymentDao.getPaymentHistroy();
        return list;
    }

    public void createPayment(Payment payment) {

        paymentDao.createPayment(payment);

    }

    public void cancelPayment(long paymentId) {
        paymentDao.cancelPayment(paymentId);
    }

    public Payment getLastPayment()
    {
       Payment payment = paymentDao.getLastPayment();
       return payment;
    }
}
