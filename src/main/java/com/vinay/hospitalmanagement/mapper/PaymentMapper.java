package com.vinay.hospitalmanagement.mapper;

import com.vinay.hospitalmanagement.dto.AppointmentRequest;
import com.vinay.hospitalmanagement.dto.AppointmentResponse;
import com.vinay.hospitalmanagement.dto.PaymentRequest;
import com.vinay.hospitalmanagement.dto.PaymentResponse;
import com.vinay.hospitalmanagement.entity.Appointment;
import com.vinay.hospitalmanagement.entity.Payment;
import org.springframework.data.util.TypeCollector;

public class PaymentMapper {
    public static Payment paymentRequestToEntity(PaymentRequest paymentRequest){

        Payment payment = new Payment();

        payment.setBillId(paymentRequest.getBillId());
        payment.setAmount(paymentRequest.getAmount());
        payment.setPaymentMethod(paymentRequest.getPaymentMethod());
        payment.setPaymentStatus(paymentRequest.getPaymentStatus());

        return payment;
    }

    public static PaymentResponse paymentEntityToResponse(Payment payment){

        PaymentResponse paymentResponse = new PaymentResponse();

        paymentResponse.setPaymentId(payment.getPaymentId());
        paymentResponse.setBillId(payment.getBillId());
        paymentResponse.setAmount(payment.getAmount());
        paymentResponse.setPaymentMethod(payment.getPaymentMethod());
        paymentResponse.setPaymentStatus(payment.getPaymentStatus());

        return paymentResponse;
    }
}
