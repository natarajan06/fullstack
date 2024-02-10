package com.recharge.yogesh.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OperatorResponse {
    private String message;
    private Long operatorId;
    private String operatorName;
    private String operatorType;

}
