package com.recharge.yogesh.service;

import com.recharge.yogesh.dto.request.OperatorRequest;
import com.recharge.yogesh.dto.response.BasicResponse;
import com.recharge.yogesh.dto.response.OperatorResponse;

public interface OperatorService {

    BasicResponse<OperatorResponse> getAllOperator();
    BasicResponse<OperatorResponse> deleteOperator(Long operatorId);
    BasicResponse<OperatorResponse> updateOperator(Long operatorId, OperatorRequest request);
    // BasicResponse<OperatorResponse> createOperator(OperatorRequest operatorRequest);

    
    


}
