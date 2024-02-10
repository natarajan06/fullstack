package com.recharge.yogesh.service;

import com.recharge.yogesh.dto.request.PaymentRequest;
import com.recharge.yogesh.dto.response.BasicResponse;
import com.recharge.yogesh.dto.response.PaymentResponse;

public interface PaymentService {
    BasicResponse<PaymentResponse> getAllUser();

    PaymentResponse register(PaymentRequest request);

    BasicResponse<PaymentResponse> deletebooking(String paymentId);
}
