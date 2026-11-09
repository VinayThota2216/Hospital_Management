package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.PaymentRequest;
import com.vinay.hospitalmanagement.dto.PaymentResponse;
import com.vinay.hospitalmanagement.entity.Payment;
import com.vinay.hospitalmanagement.exception.PaymentNotFoundException;
import com.vinay.hospitalmanagement.mapper.PaymentMapper;
import com.vinay.hospitalmanagement.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentResponse create(PaymentRequest paymentRequest){

        Payment payment= PaymentMapper.paymentRequestToEntity(paymentRequest);

        return PaymentMapper.paymentEntityToResponse(paymentRepository.save(payment));

    }
    public PaymentResponse getById(Long paymentId){
        return null;
    }
    public PaymentResponse update(Long paymentId,PaymentRequest paymentRequest){

        Optional<Payment> payment=paymentRepository.findById(paymentId);

        if(payment.isEmpty()){
            throw new PaymentNotFoundException("Payment not found");
        }

        Payment paymentEntity=payment.get();

        paymentEntity.setBillId(paymentRequest.getBillId());
        paymentEntity.setPaymentStatus(paymentRequest.getPaymentStatus());
        paymentEntity.setPaymentMethod(paymentRequest.getPaymentMethod());
        paymentEntity.setAmount(paymentRequest.getAmount());

        return PaymentMapper.paymentEntityToResponse(paymentRepository.save(paymentEntity));

    }
    public PaymentResponse delete(Long paymentId){
        return null;
    }
}
