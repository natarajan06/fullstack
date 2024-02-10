package com.recharge.yogesh.controller;



import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;
import static org.springframework.http.HttpStatus.OK;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.recharge.yogesh.service.OperatorService;
import com.recharge.yogesh.utils.MyConstant;
import com.recharge.yogesh.dto.request.OperatorRequest;
import com.recharge.yogesh.dto.response.BasicResponse;
import com.recharge.yogesh.dto.response.OperatorResponse;
import com.recharge.yogesh.model.Operator;
import com.recharge.yogesh.repository.OperatorRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(MyConstant.OPERATOR)
@RequiredArgsConstructor
public class OperatorController {

    private final OperatorService operatorService;

    private final OperatorRepository operatorRepository;
    


     @GetMapping(MyConstant.OPERATOREVENT)
        public ResponseEntity<BasicResponse<OperatorResponse>> create() {
            BasicResponse<OperatorResponse> response = new BasicResponse<>();
            try {
                response = operatorService.getAllOperator();
                return new ResponseEntity<>(response, OK);
            } catch (Exception e) {
                response.setMessage("No Bookings");
                return new ResponseEntity<>(response, EXPECTATION_FAILED);
            }
        }
    //       @PostMapping(MyConstant.OPE)
    // public ResponseEntity<BasicResponse<OperatorResponse>> createOperator(@RequestBody OperatorRequest operatorRequest) {
    //     BasicResponse<OperatorResponse> response = new BasicResponse<>();
    //     try {
    //         BasicResponse<OperatorResponse> createdOperatorResponse = operatorService.createOperator(operatorRequest);
    //         response.setMessage(createdOperatorResponse.getMessage());
    //         response.setData(createdOperatorResponse.getData());
    //         return new ResponseEntity<>(response, OK);
    //     } catch (Exception e) {
    //         response.setMessage("Failed to create operator: " + e.getMessage());
    //         return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    //     }
    // }

    @SuppressWarnings("null")
    @PostMapping(MyConstant.OPE)
    public Operator create(@RequestBody Operator models) {
        return operatorRepository.save(models);
    }

        @DeleteMapping(MyConstant.OPERATOR + "/{operatorId}")
    public ResponseEntity<BasicResponse<OperatorResponse>> deleteOperator(@PathVariable Long operatorId) {
        BasicResponse<OperatorResponse> response = new BasicResponse<>();
        try {
            BasicResponse<OperatorResponse> deletedOperatorResponse = operatorService.deleteOperator(operatorId);
            response.setMessage(deletedOperatorResponse.getMessage());
            return new ResponseEntity<>(response, OK);
        } catch (Exception e) {
            response.setMessage("Failed to delete booking: " + e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping(MyConstant.OPERATOR + "/{operatorId}")
public ResponseEntity<BasicResponse<OperatorResponse>> updateOperator(@PathVariable Long operatorId, @RequestBody OperatorRequest operatorRequest) {
    BasicResponse<OperatorResponse> response = new BasicResponse<>();
    try {
        BasicResponse<OperatorResponse> updatedOperatorResponse = operatorService.updateOperator(operatorId,operatorRequest);
        response.setMessage(updatedOperatorResponse.getMessage());
        response.setData(updatedOperatorResponse.getData());
        return new ResponseEntity<>(response, OK);
    } catch (Exception e) {
        response.setMessage("Failed to update booking: " + e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

}