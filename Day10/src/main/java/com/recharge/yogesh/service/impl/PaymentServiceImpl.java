package com.recharge.yogesh.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.recharge.yogesh.dto.request.PaymentRequest;
import com.recharge.yogesh.dto.response.BasicResponse;
import com.recharge.yogesh.dto.response.PaymentResponse; 
import com.recharge.yogesh.model.Payment; 
import com.recharge.yogesh.repository.PaymentRepository;
import com.recharge.yogesh.service.PaymentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository payRepository;

    @Override
    public BasicResponse<PaymentResponse> getAllUser() {
        List<Payment> payments = payRepository.findAll();
        List<com.recharge.yogesh.dto.response.PaymentResponse> payResponses = payments.stream()
                .map(payment -> PaymentResponse.builder()
                        .paymentId(payment.getPaymentId())
                        .status(payment.getStatus())
                        .modeOfPayment(payment.getModeOfPayment())
                        .user_id(payment.getUser_id())
                        .build())
                .collect(Collectors.toList());

        return BasicResponse.<PaymentResponse>builder()
                .message("Payment Data fetched").data(payResponses).build();
    }

    @Override
    public PaymentResponse register(PaymentRequest request) {
       Payment payment = Payment.builder().status(request.getStatus()).amountPaid(request.getAmountPaid()).user_id(request.getUser_id())
                .modeOfPayment(request.getModeOfPayment()).paymentDate(request.getPaymentDate()).build();
        payRepository.save(payment);
        return PaymentResponse.builder()
                .message("PAYMENT Done Successfully")
                .build();
    }

    @Override
    public BasicResponse<PaymentResponse> deletebooking(String paymentId) {
        // TODO Auto-generated method stub
        if (payRepository.existsById(paymentId)) {
            payRepository.deleteById(paymentId);
            return BasicResponse.<PaymentResponse>builder()
                    .message("Payment deleted successfully")
                    .build();
        } else {
            return BasicResponse.<PaymentResponse>builder()
                    .message("Payment found with ID: " + paymentId)
                    .build();
        }
    }

}
