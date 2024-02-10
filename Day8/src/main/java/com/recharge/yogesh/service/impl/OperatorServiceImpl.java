package com.recharge.yogesh.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.recharge.yogesh.dto.request.OperatorRequest;
import com.recharge.yogesh.dto.response.BasicResponse;
import com.recharge.yogesh.dto.response.OperatorResponse;
import com.recharge.yogesh.model.Operator;
import com.recharge.yogesh.repository.OperatorRepository;
import com.recharge.yogesh.service.OperatorService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class OperatorServiceImpl implements OperatorService{

    private final OperatorRepository operatorRepository;

    @Override
    public BasicResponse<OperatorResponse> getAllOperator() {
        List<Operator> events=operatorRepository.findAll();


        List<OperatorResponse> operatorResponses= events.stream()
              .map(event->OperatorResponse.builder()

            .operatorId(event.getOperatorId())
            .operatorName(event.getOperatorName())
            .operatorType(event.getOperatorType())
            
        .build())
        .collect(Collectors.toList());
        return BasicResponse.<OperatorResponse>builder()
        .message("User Data fetched").data(operatorResponses).build();
    }

    @Override
        public BasicResponse<OperatorResponse> deleteOperator(Long operatorId) {
            // TODO Auto-generated method stub
            if (operatorRepository.existsById(operatorId)) {
                operatorRepository.deleteById(operatorId);
                return BasicResponse.<OperatorResponse>builder()
                    .message("Operator deleted successfully")
                    .build();
            } else {
                return BasicResponse.<OperatorResponse>builder()
                    .message("Operator not found with ID: " + operatorId)
                    .build();
            }
        }

        @Override
        public BasicResponse<OperatorResponse> updateOperator(Long operatorId, OperatorRequest request) {
            // Retrieve the existing booking from the repository
            Operator existingOperator = operatorRepository.findById(operatorId)
                    .orElseThrow(() -> new RuntimeException("Booking not found with id: " + operatorId));

            existingOperator.setOperatorId(request.getOperatorId());
            existingOperator.setOperatorName(request.getOperatorName());
            existingOperator.setOperatorType(request.getOperatorType());

            operatorRepository.save(existingOperator);
        
            // Construct and return the response
            OperatorResponse updatedOperatedResponse = mapToBookingResponse( existingOperator);
            return BasicResponse.<OperatorResponse>builder()
                    .message("Operator updated successfully")
                    .data(List.of(updatedOperatedResponse)) // Pass a list containing a single updated booking response
                    .build();
        }

        private OperatorResponse mapToBookingResponse(Operator existingOperator) {
            // TODO Auto-generated method stub
            return OperatorResponse.builder()
            .operatorId(existingOperator.getOperatorId())
            .operatorName(existingOperator.getOperatorName())
            .operatorType(existingOperator.getOperatorType())
            .build();
        }

      


}



    

