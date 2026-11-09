package com.vinay.hospitalmanagement.mapper;

import com.vinay.hospitalmanagement.dto.AppointmentRequest;
import com.vinay.hospitalmanagement.dto.AppointmentResponse;
import com.vinay.hospitalmanagement.dto.BillingRequest;
import com.vinay.hospitalmanagement.dto.BillingResponse;
import com.vinay.hospitalmanagement.entity.Appointment;
import com.vinay.hospitalmanagement.entity.Billing;

public class BillingMapper {
    public static Billing billingRequestToEntity(BillingRequest billingRequest){

        Billing billing = new Billing();

        billing.setBillDate(billingRequest.getBillDate());
        billing.setBillStatus(billingRequest.getBillStatus());
        billing.setPatientId(billingRequest.getPatientId());
        billing.setTotalAmount(billingRequest.getTotalAmount());

        return billing;

    }

    public static BillingResponse billingEntityToResponse(Billing billing){
        BillingResponse billingResponse = new BillingResponse();

        billingResponse.setBillId(billing.getBillId());
        billingResponse.setBillDate(billing.getBillDate());
        billingResponse.setBillStatus(billing.getBillStatus());
        billingResponse.setPatientId(billing.getPatientId());
        billingResponse.setTotalAmount(billing.getTotalAmount());

        return billingResponse;

    }
}
