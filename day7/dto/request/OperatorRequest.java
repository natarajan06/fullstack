package com.recharge.yogesh.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperatorRequest {

    private Long operatorId;
    private String operatorName;
    private String operatorType;

}
