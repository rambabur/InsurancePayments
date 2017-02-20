package com.etizen.insurance.payments.repositories;

import com.etizen.insurance.payments.domain.Payment;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * Created by ramab on 2/19/2017.
 */
@Component
public class PaymentsDao {

    private Payment payment;
    static Logger logger = Logger.getLogger(PaymentsDao.class);

    public List<Payment> getPaymentHistroy() {

        payment = new Payment();
        payment.setPaymentDate(getDateFor(2016, 03, 20));
        payment.setPaidByUser("Sam");
        payment.setPaymentAmount(new BigDecimal(620.50));
        payment.setPaymentId(100);
        payment.setPaymentStatus("Completed");
        payment.setPaymentMethod("credit card");
        payment.setPolicyNumber("A-123467");

        List<Payment> list = new ArrayList<Payment>();
        list.add(payment);
        return list;

    }

    private Date getDateFor(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        return cal.getTime();
    }
    //Called method.
    public void createPayment(Payment payment) {
        logger.info("Payment Details: " + payment.toString());
        logger.info("Payment inserted sucessfully...");

    }

    public void cancelPayment(long paymentId) {
        logger.info("payment deleted sucessfully");
    }

    public Payment getLastPayment() {
        logger.info("About to get last payment");
        payment = new Payment();
        payment.setPaymentDate(getDateFor(2016, 03, 20));
        payment.setPaidByUser("Sam");
        payment.setPaymentAmount(new BigDecimal(620.50));
        payment.setPaymentId(100);
        payment.setPaymentStatus("Completed");
        payment.setPaymentMethod("credit card");
        payment.setPolicyNumber("A-123467");
        logger.info("Last payment received.." + payment.toString());
        return payment;

    }


}
